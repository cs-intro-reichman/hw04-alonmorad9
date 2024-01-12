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
        String check = "One two tHRee world";
        System.out.println(capVowelsLowRest(check));
    }

    public static String capVowelsLowRest (String string) {
        String newString = "";
        for (int i = 0; i < string.length(); i++) {
            switch (string.charAt(i)) {
                case 97:
                case 101:
                case 105:
                case 111:
                case 117:
                newString = newString + (char) (string.charAt(i) - 32);
                break;
                
                case 32:
                newString = newString + " ";
                break;
                
                default:
                if (string.charAt(i) >= 65 && string.charAt(i) <= 90) {
                    newString = newString + (char) (string.charAt(i) + 32);
                }
                else
                newString = newString + (char) (string.charAt(i));
                break;
            }
        }
        return newString;
    }

    public static String camelCase (String string) {
        // Write your code here:
        return "";
    }

    public static int[] allIndexOf (String string, char chr) {
        // Write your code here:
        return new int[1];
    }
}
