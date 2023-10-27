/*
DESCRIPTION:
An isogram is a word that has no repeating letters, consecutive or non-consecutive. Implement a function that determines whether a string that contains only letters is an isogram. Assume the empty string is an isogram. Ignore letter case.

Example: (Input --> Output)

"Dermatoglyphics" --> true "aba" --> false "moOse" --> false (ignore letter case)

isIsogram "Dermatoglyphics" = true
isIsogram "moose" = false
isIsogram "aba" = false


BEST PRACTICE: 
public class isogram {
  public static boolean  isIsogram(String str) {
    return str.length() == str.toLowerCase().chars().distinct().count();
  } 
}
*/

package CodeWars;

public class Isograms {
    public static void main(String[] args) {
        String str = "moOse";
        boolean isogram = isIsogram(str);
        System.out.println(isogram);
    }

    private static boolean isIsogram (String str) {
        int count = 0;
        char[] letters = str.toCharArray();

        for (char i : letters) {
            char x = Character.toLowerCase(i);
            for (char j : letters) {
                char y = Character.toLowerCase(j);
                if (x == y) {
                    count++;
                }
            }
        }
        return (count == letters.length);
    }
}

