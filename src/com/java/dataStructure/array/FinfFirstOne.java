package daa.assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Given an infinite array containing some 0's and then 1's, we have to find the first occurrence  of 1 in
// O(log n) time
// e.g  [0,0,0,0,0,0,0,0,0,0,0,0,"1",1,1,1,1,1,1,1,1,1]
public class FinfFirstOne {
    public static void binarySearch(int arr[], int first, int last, int key) {
        int mid = (first + last) / 2;
        while (first <= last) {
            if (arr[mid] < key) {
                first = mid + 1;
            } else if (arr[mid] == key) {
                System.out.println("Element is found at index: " + mid);
                break;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

//        int size=Integer.parseInt(br.readLine());
        int size=100;
        int arr[]=new int[size];
        int input;
        System.out.println("How many elements you want to insert : ");
        input=Integer.parseInt(br.readLine());
        try {
            System.out.println("Enter array elements(0's then 1's )");
            for(int i=0; i<=input;i++){
                arr[i]=Integer.parseInt(br.readLine());
            }
        }
        catch (NumberFormatException | IOException e){

        }


        int i = 1, x = 2, y = 0;
        while (i >= 0) {
            y = x;
            x = 2*x;
            if (arr[x] == 1) {
                if (arr[x - 1] != 1) {
                    System.out.println("Found the first 1 at location : " + x);
                    break;
                } else {
                    binarySearch(arr, y, x - 1, 1);
                    break;
                }
            }
            else {
                continue;
            }

        }
    }

}
