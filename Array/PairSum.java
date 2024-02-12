package Array;

import java.util.Scanner;

public class PairSum {
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

        System.out.println("Enter the key value : ");
        int key = sc.nextInt();
        int sum = 0;
        for(int i=0;i<size;i++){
            
        }
        sc.close();
    }
}