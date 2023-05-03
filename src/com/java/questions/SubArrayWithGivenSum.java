package com.java.questions;

/**
 * Given an array A[]. We have to find the sub-array from A[]
 * whose sum of all element should be equals to SUM.
 * <p>
 * A[]={5, 6, 7, 9, 4, 4, 10, 11}
 * SUM=26
 * SubArray AA[]={6, 7, 9, 4}
 */

import java.util.Arrays;

public class SubArrayWithGivenSum {

    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 9, 4, 4, 10, 11};
        System.out.println("Given Array is : " + Arrays.toString(arr));
        int targetedSum = 26;
        System.out.println("Expected SubArray whose sum is : " + targetedSum);
        //We can use one of the two methods
        int[] subArray = findSubArray(arr, targetedSum);
        //int[] subArray = findSubArray2(arr, targetedSum);
        int lengthOfSubArr = subArray[subArray.length - 1] - subArray[0] + 1;
        if (lengthOfSubArr == 0) {
            System.out.println("No such Sub-Array Exist !");
        } else {
            System.out.println(Arrays.toString(subArray));
        }

    }


    //Method1 to find the subArray whose sum is targetedSum
    public static int[] findSubArray(int[] arr, int targetSum) {

        int sum = 0;
        int[] subArrIndex = {0, -1};
        int startIndex = 0;
        int lastIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            startIndex = i;
            sum = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                sum = sum + arr[j];
                if (sum == targetSum) {
                    lastIndex = j;
                    return Arrays.copyOfRange(arr, startIndex, lastIndex + 1);
                } else if (sum > targetSum) {
                    break;
                }
            }
        }
        return subArrIndex;
    }

    //Method2 to find the subArray whose SUM is tSum
    public static int[] findSubArray2(int[] arr, int sum) {
        int start = 0;
        int end = -1;
        int currSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            while (currSum > sum && start <= i) {
                currSum -= arr[start];
                start++;
            }
            if (currSum == sum) {
                end = i;
                break;
            }
        }
        if (end == -1) {
            return new int[]{0, -1};
        } else {
            return Arrays.copyOfRange(arr, start, end + 1);
        }
    }


}

