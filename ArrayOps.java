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

        // chatgpt code:
        /*
         * def find_second_largest(numbers):
    # Initialize the largest and second largest with minimum possible values
    largest = second_largest = float('-inf')

    # Traverse through all the numbers in the array
    for num in numbers:
        # Update the largest and second largest if needed
        if num > largest:
            second_largest = largest  # Update second largest to the old largest
            largest = num  # Update largest to the new largest
        elif largest > num > second_largest:
            # Update second largest if the number is between largest and second largest
            second_largest = num

    return second_largest

# Example usage:
example_array = [3, 5, 7, 7, 5]
find_second_largest(example_array)

         */
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
