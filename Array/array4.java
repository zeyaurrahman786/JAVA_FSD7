package Array;

import java.util.Scanner;

public class array4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int size = sc.nextInt();

        System.out.println();

        // creation of empty array object
        int[] arr = new int[size];

        // input element inside an array
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the element : ");
            arr[i] = sc.nextInt();
        }

        System.out.println();
        
        // Display array element
        for (int a : arr) {
            System.out.println(a);
        }
        sc.close();
    }
}
