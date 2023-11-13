/*
DESCRIPTION:
Given an array of integers, return a new array with each value doubled.

For example:

[1, 2, 3] --> [2, 4, 6]
*/

package CodeWars;

import java.util.Arrays;

public class Maps {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(Arrays.toString(map(arr)));
    }


    public static int[] map(int[] arr) {
        for(int i = 0; i<arr.length; i++){
            arr[i] *= 2;
        }
        return arr;
    }
}
