/*
Simple, given a string of words, return the length of the shortest word(s).

String will never be empty and you do not need to account for different data types.
*/

public class Kata {
    public static int findShort(String s) {
        int length = Integer.MAX_VALUE;

        for (String a : s.split(" ")){
            if (a.length() < length) length = a.length();
        }

        return length;
    }
}
