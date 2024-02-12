package Array;

import java.util.Scanner;

public class MinElement {
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

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum Value is : "+min);
        sc.close();
    }
}



// Enter the size of an array
// 7
// Enter the elements inside an array
// 1
// Enter the elements inside an array
// 4
// Enter the elements inside an array
// 3
// Enter the elements inside an array
// 9
// Enter the elements inside an array
// 15
// Enter the elements inside an array
// 2
// Enter the elements inside an array
// 0
// Minimum Value is : 0