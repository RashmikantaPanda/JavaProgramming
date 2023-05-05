package com.java.questions;

import java.util.Arrays;

public class MoveNegativeNoToLeft {
    public static int[] moveNegativeWithOutSorting(int[] arr){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            if (arr[left]>0 && arr[right]<0){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            } else if (arr[left]<0 && arr[right]<0) {
                left++;
            }
            else if(arr[left]>0 &&arr[right]>0 ){
                right--;
            }
            else {
                left++;
                right--;
            }
        }
        return arr;
    }

    public static int[] moveNegativeUsingSorting(int[] arr)
    {
        Arrays.sort(arr);
        return arr;
    }


    public static void main(String[] args) {
        int[] arr={-8,6,5,9,-8,-6,4,-3,-3,-1,6,8,3,88,4,9,-6,7};
        int[] newArr1=moveNegativeWithOutSorting(arr);
        System.out.println(Arrays.toString(newArr1));

        int[] newArr2=moveNegativeUsingSorting(arr);

        System.out.println();
        System.out.println(Arrays.toString(newArr1));
//        System.out.println(Arrays.toString(newArr2));
    }
}
