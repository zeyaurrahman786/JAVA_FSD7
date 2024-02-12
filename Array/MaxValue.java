package Array;

import java.util.Scanner;

public class MaxValue {

    static int maxValue(int[] arr, int size) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creation of an array
        System.out.println("Enter the size of an array");
        int size = sc.nextInt(); // determines size
        int[] arr = new int[size]; // create space for array

        // Enter element inside an array
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the elements inside an array");
            arr[i] = sc.nextInt(); // elements entering in array
        }

        System.out.println("Maximum Value is : " + maxValue(arr, size));
        sc.close();
    }
}
