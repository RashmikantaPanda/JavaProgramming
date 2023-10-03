package daa.assignment;

//Create a binary tree and perform the following operations
//InsertNode,DeleteNode,Find_Of_the_tree, Find_No_of_Leaf_Nodes,Count_no_of_Nodes

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree{
    static class Node{
        int data;
        Node left,right;
        Node(int data)
        {
            this.data=data;
        }
    }
    static Node root;
    static int countLeafNodes(Node node)
    {
        if(node==null)
        {
            return 0;
        }
        if(node.left== null && node.right==null)
        {
            return 1;
        }
        return countLeafNodes(node.left)+countLeafNodes(node.right);
    }

    static int HeightOfTree(Node root)
    {
        if(root==null){
            return -1;
        }
        return 1 + Math.max(HeightOfTree(root.left),HeightOfTree(root.right));

    }

    static int CountNodes(Node root)
    {
        int count=0;
        if(root==null)
            return 0;
        if(root!=null)
            count++;

//        if(root.left!=null )
//              count++;
//        if(root.right!=null )
//            count++;
//
        count=count+(CountNodes(root.left)+CountNodes(root.right));

        return count;
    }
    //    static Node newNode(int data)
//    {
//        Node node=new Node();
//        node.data=data;
//        node.left=node.right=null;
//        return node;
//    }
    static void PostOrderTraversal(Node node)
    {
        if(node==null)
            return;
        PostOrderTraversal(node.left);
        PostOrderTraversal(node.right);
        System.out.print(node.data+" ");
    }
    static void PreOrderTraversal(Node node)
    {
        if(node==null)
            return;
        System.out.print(node.data+" ");
        PreOrderTraversal(node.left);
        PreOrderTraversal(node.right);

    }
    static void InOrderTraversal(Node node)
    {
        if(node==null)
            return;
        InOrderTraversal(node.left);
        System.out.print(node.data+" ");
        InOrderTraversal(node.right);

    }

    static void InsetNode(Node temp, int key){
        if(temp==null){
            root=new Node(key);
            return;
        }
        Queue<Node> queue=new LinkedList<Node>();
        queue.add(temp);

        while(!queue.isEmpty()){
            temp=queue.peek();
            queue.remove();

            if(temp.left==null){
                temp.left=new Node(key);
                break;
            }
            else{
                queue.add(temp.right);
            }

            if(temp.right==null){
                temp.right=new Node(key);
                break;
            }
            else{
                queue.add(temp.right);
            }
        }
    }

    static void deleteDeepest(Node root,
                              Node delNode)
    {
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);

        Node temp = null;

        // Do level order traversal until last node
        while (!q.isEmpty())
        {
            temp = q.peek();
            q.remove();

            if (temp == delNode)
            {
                temp = null;
                return;

            }
            if (temp.right!=null)
            {
                if (temp.right == delNode)
                {
                    temp.right = null;
                    return;
                }
                else
                    q.add(temp.right);
            }

            if (temp.left != null)
            {
                if (temp.left == delNode)
                {
                    temp.left = null;
                    return;
                }
                else
                    q.add(temp.left);
            }
        }
    }


    static void DeleteNode(Node root, int key)
    {
        if (root == null)
            return;

        if (root.left == null &&
                root.right == null)
        {
            if (root.data == key)
            {
                root=null;
                return;
            }
            else
                return;
        }

        Queue<Node> DQueue = new LinkedList<Node>();
        DQueue.add(root);
        Node temp = null, keyNode = null;

        // Do level order traversal until
        // we find key and last node.
        while (!DQueue.isEmpty())
        {
            temp = DQueue.peek();
            DQueue.remove();

            if (temp.data == key)
                keyNode = temp;

            if (temp.left != null)
                DQueue.add(temp.left);

            if (temp.right != null)
                DQueue.add(temp.right);
        }

        if (keyNode != null)
        {
            int x = temp.data;
            deleteDeepest(root, temp);
            keyNode.data = x;
        }
    }


    public static void main(String args[]){
//        Node root=new Node(15);
//        root.left=new Node(2);
////        root.left.right=new Node(10);
//        Node node1=root.right=new Node(5);
//        Node node2=node1.left=new Node(8);
//        Node node3=node1.right=new Node(4);
//        node2.left=new Node(10);
//        node2.right=new Node(2);
//        node3.right=new Node(6);


//        System.out.println("PostOrder Traversal : ");
//        PostOrderTraversal(root);
        InsetNode(root,20);
        InsetNode(root,10);
        InsetNode(root,30);
        InsetNode(root,80);
        InsetNode(root,70);
        InsetNode(root,90);
        InsetNode(root,50);
        System.out.println("\nAfter Inseting node");
        System.out.println("PostOrder Traversal : ");
        PostOrderTraversal(root);
        System.out.println();
        System.out.println("PreOrder Traveral : ");
        PreOrderTraversal(root);
        System.out.println();
        System.out.println("InOrder Traversal : ");
        InOrderTraversal(root);

        System.out.println("\nHeight of Binary Tree is : "+HeightOfTree(root));
        System.out.println("Total numbers of nodes in the binary tree is : "+CountNodes(root));
        System.out.println("Leaf Nodes of the Tree is : "+countLeafNodes(root));

        System.out.println("\nDeleting a node");
        DeleteNode(root,80);
        System.out.println("After deletion , the InOrder Traversal is  : ");
        InOrderTraversal(root);

        System.out.println("\nHeight of Binary Tree is : "+HeightOfTree(root));
        System.out.println("Total numbers of nodes in the binary tree is : "+CountNodes(root));
        System.out.println("Leaf Nodes of the Tree is : "+countLeafNodes(root));



    }
}
