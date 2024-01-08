public class ArrayOps {
    public static void main(String[] args) {
        
    }
    
    public static int findMissingInt (int [] array) {
        int n = array.length;
        int sumArr = 0;
        int sumGen = 0;
        int missingInt;
        for (int i = 0; i < n; i++) {
            sumArr = sumArr + array[i];
            sumGen = sumGen + i;
        }
        missingInt = sumGen - sumArr;
        return missingInt;
    }

    public static int secondMaxValue(int [] array) {
        // Write your code here:
        return 0;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        // Write your code here:
        return false;
    }

    public static boolean isSorted(int [] array) {
        // Write your code here:
        return false;
    }

}
