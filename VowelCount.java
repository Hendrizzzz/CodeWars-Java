/*
Return the number (count) of vowels in the given string.

We will consider a, e, i, o, u as vowels for this Kata (but not y).

The input string will only consist of lower case letters and/or spaces.
*/

public class Vowels {

  public static int getCount(String str) {
    int count = 0;

    for (char c : str.toCharArray()) {
        count += (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? 1 : 0;
    }

    return count;
  }
}
