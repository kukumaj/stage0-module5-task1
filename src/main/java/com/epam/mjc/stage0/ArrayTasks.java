package com.epam.mjc.stage0;

/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {
    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    public String[] seasonsArray() {
        return new String[]{"winter", "spring", "summer", "autumn"};
    }

    /**
     * Generate an int[] array of consecutive positive integers
     * starting at 1 of the given length (length parameter > 0).
     * <p>
     * Example:
     * <p>
     * length = 1  -> [1]
     * length = 3  -> [1, 2, 3]
     * length = 5  -> [1, 2, 3, 4, 5]
     */
    public int[] generateNumbers(int length) {
        int[] result = new int[length];
        for (int i = 1; i < length + 1; i++) {
            result[i - 1] = i;
        }
        return result;
    }

    /**
     * Find the sum of all elements of the int[] array.
     * <p>
     * Example:
     * <p>
     * arr = [1, 3, 5]   -> sum = 9
     * arr = [5, -3, -4] -> sum = -2
     */
    public int totalSum(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum = sum + j;
        }
        return sum;
    }

    /**
     * Return the index of the first occurrence of number in the arr array.
     * If there is no such element in the array, return -1.
     * <p>
     * Example:
     * <p>
     * arr = [99, -7, 102], number = -7    ->   2
     * arr = [5, -3, -4],   number = 10    ->  -1
     */
    public int findIndexOfNumber(int[] arr, int number) {
        int result = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                result = i;
                break;
            }
        }
        return result;
    }

    /**
     * Return the new String[] array obtained from the arr array
     * by reversing the order of the elements.
     * <p>
     * Example:
     * <p>
     * arr = ["Bob", "Nick"]               -> ["Nick", "Bob"]
     * arr = ["pineapple", "apple", "pen"] -> ["pen", "apple", "pineapple"]
     */
    public String[] reverseArray(String[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }

    /**
     * Return new int[] array obtained from arr int[] array
     * by choosing positive numbers only.
     * P.S. 0 is not a positive number =)
     * <p>
     * Example:
     * <p>
     * arr = [1,-2, 3]      -> [1, 3]
     * arr = [-1, -2, -3]   -> []
     * arr = [1, 2]         -> [1, 2]
     */
    public int[] getOnlyPositiveNumbers(int[] arr) {
        int countPos = 0;
        for (int value : arr) {
            if (value > 0) {
                countPos += 1;
            }
        }
        int[] result = new int[countPos];
        int j = 0;
        for (int i : arr) {
            if (i > 0) {
                result[j] = i;
                j += 1;
            }
        }
        return result;
    }

    /**
     * Return a sorted, ragged, two-dimensional int[][] array following these rules:
     * Incoming one-dimensional arrays must be arranged in ascending order of their length;
     * numbers in all one-dimensional arrays must be in ascending order.
     * <p>
     * Example:
     * <p>
     * arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]]
     * arr = [[5, 4], [7]]       -> [[7], [4, 5]]
     */
    public int[][] sortRaggedArray(int[][] arr) {
        for (int k = 0; k < arr.length; k++) {
            for (int i = 1; i < arr.length; i++) {
                if (arr[i - 1].length > arr[i].length) {
                    int[] temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for (int[] ints : arr) {
            helper(ints);
        }
        System.out.print("[");
        for (int j = 0; j < arr.length; j++) {
            System.out.print("[");
            for (int i = 0; i < arr[j].length; i++) {
                if (i < arr[j].length - 1) {
                    System.out.print(arr[j][i] + ",");
                } else {
                    System.out.print(arr[j][i]);
                }
            }
            if (j < arr.length - 1) {
                System.out.print("], ");
            } else {
                System.out.print("]");
            }
        }
        System.out.print("]");

        return arr;
    }

    private static void helper(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            for (int j = 1; j < ints.length; j++) {
                if (ints[j - 1] > ints[j]) {
                    int temp = ints[j - 1];
                    ints[j - 1] = ints[j];
                    ints[j] = temp;
                }
            }
        }
    }
}





