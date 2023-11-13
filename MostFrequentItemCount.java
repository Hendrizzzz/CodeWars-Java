/*
Complete the function to find the count of the most frequent item of an array. You can assume that input is an array of integers. For an empty array return 0

Example
input array: [3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3]
ouptut: 5 
The most frequent number in the array is -1 and it occurs 5 times.
*/

package CodeWars;

public class MostFrequentItemCount {
    public static void main(String[] args) {
        int[] collection = {3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3};
        System.out.println(mostFrequentItemCount(collection));
    }
    public static int mostFrequentItemCount(int[] collection) {
        int finalCount = 0;

        for (int k : collection) {
            int currentCount = 0;
            for (int i : collection) {
                if (k == i) {
                    currentCount++;
                }
            }
            finalCount = Math.max(currentCount, finalCount);
        }
        return finalCount;
    }
}
