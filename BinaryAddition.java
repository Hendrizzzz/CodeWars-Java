/*
Implement a function that adds two numbers together and returns their sum in binary. The conversion can be done before, or after the addition.

The binary number returned should be a string.

Examples:(Input1, Input2 --> Output (explanation)))

1, 1 --> "10" (1 + 1 = 2 in decimal or 10 in binary)
5, 9 --> "1110" (5 + 9 = 14 in decimal or 1110 in binary)
*/

package CodeWars;

public class Kata{
    public static void main(String[] args) {
        int a = 5;
        int b = 9;

        String binary = binaryAddition(a , b);
        System.out.println(binary);
    }

    public static String binaryAddition(int a, int b){
        StringBuilder binary = new StringBuilder();

        int sum = a + b;
        while(sum>0){
            binary.append(sum%2);
            sum /= 2;
        }
        return binary.reverse().toString();
    }
}

/*
BEST SOLUTION:
public class Kata{
  public static String binaryAddition(int a, int b){
    return Integer.toBinaryString(a+b);
  }
}
*/
