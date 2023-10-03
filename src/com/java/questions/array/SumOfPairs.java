package daa.assignment;

//Given an array, we have to chose a target elemet, and to find such pairs whose sum is equals to the target element.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

import static java.util.Arrays.sort;
public class SumOfPairs {

    static void findPair(int nums[], int n, int target)
    {
        sort(nums);
        int low = 0;
        int high = n - 1;
        int flag=0;


        while (low < high)
        {
            if (nums[low] + nums[high] == target)
            {

                System.out.println("Pair found( "+nums[low]+" , "+nums[high]+" )");
                flag++;

            }
            if((nums[low] + nums[high]) < target)
            {
                low++;
            }
            else
            {
                high--;
            }

        }
        if(flag==0)
        {
            System.out.println("Pair Not Found");
        }




    }

    public static void  main(String args[]) throws IOException {

        int max=100;
        int size;
        System.out.println("Enter the size of the array : ");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        size=Integer.parseInt(br.readLine());
        int arr[]=new int[size];
        Random random=new Random();
        for(int i=0; i<size; i++){
            arr[i]=random.nextInt(max);
        }
        for (int a:arr) {
            System.out.print(a+" ");
        }
        System.out.println("\nEnter the TARGET element : ");
        int target=Integer.parseInt(br.readLine());
        findPair(arr,size, target);

    }


}
