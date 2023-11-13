/*
DESCRIPTION:
Given two integers a and b, which can be positive or negative, find the sum of all the integers between and including them and return it. If the two numbers are equal return a or b.

Note: a and b are not ordered!

Examples (a, b) --> output (explanation)
(1, 0) --> 1 (1 + 0 = 1)
(1, 2) --> 3 (1 + 2 = 3)
(0, 1) --> 1 (0 + 1 = 1)
(1, 1) --> 1 (1 since both are same)
(-1, 0) --> -1 (-1 + 0 = -1)
(-1, 2) --> 2 (-1 + 0 + 1 + 2 = 2)
Your function should only return a number, not the explanation about how you get that number.
*/

package CodeWars;

public class Sum
{
    public static void main(String[] args) {
        int a = -1;
        int b = 2;

        int sum = GetSum(a, b);
        System.out.println(sum);
    }
    public static int GetSum(int a, int b)
    {
        int biggerNum = Math.max(a,b);
        int smallerNum = Math.min(a,b);
        int sum = 0;

        while(smallerNum <= biggerNum){
            sum += smallerNum;
            smallerNum += 1;
        }

        return sum;
    }
}
