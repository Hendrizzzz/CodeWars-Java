/*
DESCRIPTION:
Your classmates asked you to copy some paperwork for them. You know that there are 'n' classmates and the paperwork has 'm' pages.

Your task is to calculate how many blank pages do you need. If n < 0 or m < 0 return 0.

Example:
n= 5, m=5: 25
n=-5, m=5:  0
Waiting for translations and Feedback! Thanks!
*/

package CodeWars;

public class Paper
{
    public static void main(String[] args) {
        int n = 5;
        int m = -5;

        int paperWork = paperWork(n, m);
        System.out.println(paperWork);
    }
    public static int paperWork(int n, int m)
    {
        return (n < 0 || m < 0)? 0: n*m;
    }
}
