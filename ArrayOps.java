public class ArrayOps {
    public static void main(String[] args) {
        int [] arr = {2,3,7,8};
        int [] arr2 = {3,1,5,2,0,66,6};
        System.out.println(findMissingInt(arr));
        System.out.println(secondMaxValue(arr));
        System.out.println(containsTheSameElements(arr, arr2));
    }
    
    public static int findMissingInt (int [] array) {
        int n = array.length;
        int sumArr = 0;
        // formula for computing sum of numbers from 0 to n
        int expectedSum = n * (n + 1) / 2;
        int missingInt;
        // sums the elements of the array
        for (int i = 0; i < n; i++) {
            sumArr = sumArr + array[i];
        }
        // the difference between expected sum and actual sum is the missing int
        missingInt = expectedSum - sumArr;
        return missingInt;
    }

    public static int secondMaxValue(int [] array) { 
        int n = array.length;
        int maxV = 0;
        int secondMax = 0;
        // checks on each element of the array the following conditions
        for (int i = 0; i < n; i++) {
            // if the current number is bigger than the max number
            // set secondmax to max number
            // set max to current number
            if (array[i] > maxV || array[i] == maxV) {
                secondMax = maxV;
                maxV = array[i];
            }
            // else if: current number is bigger than second max and not equal to max
            // set secondmax to current number
            else if (array[i] > secondMax && array[i] != maxV) {
                secondMax = array[i];
            }
        }
        return secondMax;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        boolean foundInSecondArray = false;
         // checks on each element of the first array the following conditions
         for (int i = 0; i < array1.length; i++) {
            foundInSecondArray = false;
            // checks on each element of the second array the following conditions
            for (int j = 0; j < array2.length; j++) {
                // if the current number in the first array was found in the second array
                if (array1[i] == array2[j]) {
                    // mark as found and stop the current j loop
                    foundInSecondArray = true;
                    break;
                }
            }
            // if the current number in the first array wasn't found in the second array, retrun false
            if (!foundInSecondArray) {
                return false;
            }
        }
        // checks on each element of the second array the following conditions
        for (int i = 0; i < array2.length; i++) {
            foundInSecondArray = false;
            // checks on each element of the first array the following conditions
            for (int j = 0; j < array1.length; j++) {
                // if the current number in the second array was found in the first array
                if (array2[i] == array1[j]) {
                    // mark as found and stop the current loop
                    foundInSecondArray = true;
                    break;
                }
            }
            // if the current number in the second array wasn't found in the first array, retrun false
            if (!foundInSecondArray) {
                return false;
            }
        }
        // if the function didn't return false until now, means arrays contain the same numbers, return true
        return true;
    }

    public static boolean isSorted(int [] array) {
        // Write your code here:
        return false;
    }

}
