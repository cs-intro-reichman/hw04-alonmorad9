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
        int n = array.length;
        int maxV = 0;
        int secondMax = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] > maxV) {
                maxV = array[i];
            }
        }
        int [] newArr = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            if (array[i] != maxV) {
                newArr[i] = array[i];
            }
        }
        for (int i = 0; i < newArr.length; i++) {
            if (newArr[i] > secondMax) {
                secondMax = newArr[i];
            }
        }
        return secondMax;
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
