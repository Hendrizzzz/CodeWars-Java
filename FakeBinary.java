/*
DESCRIPTION:
Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'. Return the resulting string.

Note: input will never be an empty string
*/


public class FakeBinary {
    public static String fakeBin(String numberString) {
      StringBuffer stringBuffer = new StringBuffer();
        for(int i = 0; i < numberString.length(); i++){
            if(Integer.parseInt(String.valueOf(numberString.charAt(i))) < 5){
                stringBuffer.append(0);
            } else stringBuffer.append(1);
        }
        return stringBuffer.toString();
    }
}
