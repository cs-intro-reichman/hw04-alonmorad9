public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        String check = "HELLO world";
        System.out.println(camelCase(check));
        System.out.println(camelCase(check));
    }

    public static String capVowelsLowRest (String string) {
        String newString = "";
        // checks on each char of the string the following cases
        for (int i = 0; i < string.length(); i++) {
            switch (string.charAt(i)) {
                // cases of lowercase vowels chars
                case 97:
                case 101:
                case 105:
                case 111:
                case 117:
                newString = newString + (char) (string.charAt(i) - 32);
                break;
                
                // cases of uppercase vowels chars
                case 65:
                case 69:
                case 73:
                case 79:
                case 85:
                newString = newString + (char) (string.charAt(i));
                break;
                
                // case of space char
                case 32:
                newString = newString + " ";
                break;
                
                // in case of a regular char (non vowel and non space)
                default:
                // if it's uppercase turn it to lowercase
                if (string.charAt(i) >= 65 && string.charAt(i) <= 90) {
                    newString = newString + (char) (string.charAt(i) + 32);
                }
                // if none of the conditions above exists, keep the char as it is
                else
                newString = newString + (char) (string.charAt(i));
                break;
            }
        }
        return newString;
    }

    public static String camelCase (String string) {
        String newString = "";
        // cuts spaces in the begining of the sentence
        while (string.charAt(0) == ' ') {
            string = string.substring(1);
        }
        // finds the index of the first space (end of first word)
        int indexOfFirstSpace = string.indexOf(" ");
        // for each char of the first word check the following conditions
        for (int i = 0; i < indexOfFirstSpace; i++) {
            // if char is uppercase, turn it to lowercase
            if (string.charAt(i) >= 65 && string.charAt(i) <= 90) {
                newString = newString + (char) (string.charAt(i) + 32);
            }
            // else keep it the same (lowercase)
            else
            newString = newString + (char) (string.charAt(i));
        }
        // creates the same string without the first word
        String stringWoFirstWord = string.substring(indexOfFirstSpace + 1, string.length());
        boolean formerCharIsSpace = true;
        for (int i = 0; i < stringWoFirstWord.length(); i++) {
            if (formerCharIsSpace) {
                if (stringWoFirstWord.charAt(i) >= 65 && stringWoFirstWord.charAt(i) <= 90 ) {
                    newString = newString + (char) (stringWoFirstWord.charAt(i));
                } 
                else if (stringWoFirstWord.charAt(i) != 32){
                newString = newString + (char) (stringWoFirstWord.charAt(i) - 32);
                }
            }
            else {
            if (stringWoFirstWord.charAt(i) == 32) {
                formerCharIsSpace = true;
            }
            else
            formerCharIsSpace = false;
             // if char is uppercase, turn it to lowercase
             if (stringWoFirstWord.charAt(i) >= 65 && stringWoFirstWord.charAt(i) <= 90) {
                newString = newString + (char) (stringWoFirstWord.charAt(i) + 32);
            }
            // else keep it the same (lowercase)
            else if (stringWoFirstWord.charAt(i) != 32)
            newString = newString + (char) (stringWoFirstWord.charAt(i));
        }
        if (stringWoFirstWord.charAt(i) == 32) {
            formerCharIsSpace = true;
        }
        else
        formerCharIsSpace = false;
    }
        return newString;
}

    public static int[] allIndexOf (String string, char chr) {
        // Write your code here:
        return new int[1];
    }
}
