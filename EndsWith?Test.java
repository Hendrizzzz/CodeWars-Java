public class StringEndsWith {
    public static void main(String[] args) {
        String str = "aaabc";
        String ending = "abc";

        boolean isEndsWith = checker(str, ending);
        System.out.println(isEndsWith);
    }

    private static boolean checker(String str, String ending) {
        int count = 0;
        char[] string1 = str.toCharArray();
        char[] string2 = ending.toCharArray();

        int str1Length = string1.length;
        int str2Length = string2.length;

        for(int i = str1Length - 1; i >= str1Length - str2Length; i--){
            if (string1[i] == string2[str2Length - 1]){
                str2Length--;
                count++;
            }
        }
        return (count == str2Length);
    }
}

//https://www.codewars.com/kata/51f2d1cafc9c0f745c00037d/train/java
