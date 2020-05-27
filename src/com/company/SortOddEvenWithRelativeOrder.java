package com.company;

public class SortOddEvenWithRelativeOrder {

    public static void sortOddEvenNumbers(int[] arr) {
        // Taking Count of odd numbers
        int countOdd = 0;
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            if (arr[i] % 2 != 0) {
                countOdd++;
            }
        }
        int i = 0;
        int j = i + 1;
        while (i != countOdd) {
            if (arr[i] % 2 != 0) {
                i++;
                j = i + 1;

            } else if (arr[i] % 2 == 0 && j < length) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }

    // Main Method in which sortOddEvenNumber Function is called.
    public static void main(String args[]) {
        //Input of random odd/even number in list
        int arr[] = {34, 21, 12, 19, 31, 32, 4, 13, 50, 5, 3, 7, 16, 20, 17};
        int n = arr.length;

        sortOddEvenNumbers(arr);

        System.out.print("Modified List with Relative Order :" + " ");

        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

}
