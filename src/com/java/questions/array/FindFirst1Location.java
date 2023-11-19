package com.java.questions.array;

import java.util.*;

class FindFirst1Location {


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

    public static void posOfFirstOne(int arr[])
    {
        int x= 0,y = 1;

        while (1>0) {

            x = y;
            y = 2 * y;
            if(arr[0]==1) {
                System.out.println("First 1 is at : 0");
                break;
            }
            if(arr[x]==1) {
                System.out.println("First 1 is at : " + x);
                break;
            }
            if(arr[y]==1){
                if(arr[y-1]==0)
                {
                    System.out.println("First 1 is at : "+y);
                    break;

                }
                else{
                    binarySearch(arr, x, y-1,1);
                    break;
                }
            }
            continue;
        }

//
    }

    public static void main(String[] args)
    {

        int arr[] = {0,0,0,0,1,1};
        posOfFirstOne(arr);

    }
}