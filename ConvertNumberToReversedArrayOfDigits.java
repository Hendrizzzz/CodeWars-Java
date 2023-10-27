/*
Convert number to reversed array of digits
Given a random non-negative number, you have to return the digits of this number within an array in reverse order.

Example(Input => Output):
35231 => [1,3,2,5,3]
0 => [0]
*/


package CodeWars;

import java.util.Arrays;

public class ReversedArray {
    public static void main(String[] args) {
        long n = 1234567;

        int[] m = digitized(n);
        System.out.println(Arrays.toString(m));
    }

    private static int[] digitized(long n) {
        int[] original = String.valueOf(n).chars().map(Character::getNumericValue).toArray();

        int temp = original.length - 1;

        for(int i = 0; i < original.length/2; i++){
            int temp1 = original[i];
            original[i] = original[(temp - i)];
            original[temp - i] = temp1;
        }
        return original;
    }
}
