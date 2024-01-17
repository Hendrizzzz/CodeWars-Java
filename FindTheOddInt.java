public class FindOdd {
	public static int findIt(int[] a) {
            int oddCount = 0;
            for(int numbers : a){
                oddCount = 0;
                 for (int numbers1 : a){
                    if (numbers == numbers1) oddCount++;
                }
                 if(oddCount % 2 == 1) return numbers;
            }
            return oddCount;
        }
}
