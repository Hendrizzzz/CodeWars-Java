/*
DESCRIPTION:
Jaden Smith, the son of Will Smith, is the star of films such as The Karate Kid (2010) and After Earth (2013). 
Jaden is also known for some of his philosophy that he delivers via Twitter. When writing on Twitter, he is 
known for almost always capitalizing every word. For simplicity, you'll have to capitalize each word, check 
out how contractions are expected to be in the example below.

Your task is to convert strings to how they would be written by Jaden Smith. The strings are actual quotes 
from Jaden Smith, but they are not capitalized in the same way he originally typed them.

Example:

Not Jaden-Cased: "How can mirrors be real if our eyes aren't real"
Jaden-Cased:     "How Can Mirrors Be Real If Our Eyes Aren't Real"
Note that the Java version expects a return value of null for an empty string or null.

Link to Jaden's former Twitter account @officialjaden via archive.org
*/



package CodeWars;
public class JadenCasingStrings {
    public static void main(String[] args) {

        String phrase = "most trees are blue";
        String modifiedPhrase = toJadenCase(phrase);

        System.out.println(modifiedPhrase);
    }

    private static String toJadenCase(String phrase) {

        if(phrase == null || phrase.isEmpty()){
            return null;
        }

        char[] array = phrase.toCharArray();
        boolean spaseIsFound = true;

        for(int i = 0; i < array.length; i++){
            if(Character.isLetter(array[i])){
                if (spaseIsFound){
                    array[i] = Character.toUpperCase(array[i]);
                    spaseIsFound = false;
                }
            } else{
                spaseIsFound = true;
            }
        }
        return (String.valueOf(array));
    }
}
