/*
Write a function, persistence, that takes in a positive parameter num and returns its 
multiplicative persistence, which is the number of times you must multiply the digits 
in num until you reach a single digit.

For example (Input --> Output):
39 --> 3 (because 3*9 = 27, 2*7 = 14, 1*4 = 4 and 4 has only one digit)
999 --> 4 (because 9*9*9 = 729, 7*2*9 = 126, 1*2*6 = 12, and finally 1*2 = 2)
4 --> 0 (because 4 is already a one-digit number)
*/


class Persist {
    public static int persistence(int number) {
        int persistence = 0;
        while (number >= 10){
            int resultedNum = 1;
            while (number > 0){ // Loop until the product of their digits is done
                int digit = number % 10; // Get the last digit
                resultedNum *= digit; // Store the product in resultedNum
                number /= 10;
            }
            number = resultedNum;
            persistence++;
        }
        return persistence;
    }
}
