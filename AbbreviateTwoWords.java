/*
DESCRIPTION:
Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.

The output should be two capital letters with a dot separating them.

It should look like this:

Sam Harris => S.H

patrick feeney => P.F
*/

package CodeWars;

public class AbbreviateTwoWords {
    public static void main(String[] args) {
        String name = "Jim Hendrix";
        System.out.println(abbrevName(name));

    }

    public static String abbrevName(String name) {
        char[] letter = name.toCharArray();
        char lastInitial = ' ';

        for(int i = 0 ; i < letter.length; i++){
            if(letter[i] == ' '){
                lastInitial = letter[i + 1];
            }
        }
        
        String initials = letter[0] + "." + lastInitial;
        return initials.toUpperCase();
    }
}

/*
BEST CODE 
public class AbbreviateTwoWords {

  public static String abbrevName(String name) {
    String[] names = name.split(" ");
    return (names[0].charAt(0) + "." + names[1].charAt(0)).toUpperCase();
  }
}
*/
