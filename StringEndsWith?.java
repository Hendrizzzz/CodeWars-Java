/*
Complete the solution so that it returns true if the first argument(string) passed in ends with the 2nd argument (also a string).

Examples:

solution('abc', 'bc') // returns true
solution('abc', 'd') // returns false
*/


package CodeWars;

public class StringEndsWith {
    public static void main(String[] args) {
        String str = "samurai";
        String ending = "murai";

        boolean isEndsWith = checker(str, ending);
        System.out.print(isEndsWith);
    }

    private static boolean checker(String str, String ending) {
        int strLength = str.length();
        int endingLength = ending.length();

        if (endingLength > strLength){
            return false;
        }

        for (int i = 1; i <= endingLength; i++){
            if(str.charAt(strLength - i) != ending.charAt(endingLength - i)){
                return false;
            }
        }

        return true;
    }
}

/* 
or just

public class Kata {
  public static boolean solution(String str, String ending) {
    return str.endsWith(ending);
  }
}

*/
