package Array;

import java.util.Scanner;

public class SubArrayWithSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creation of an array
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();  // determines size
        int [] arr1 = new int[size];  // create space for array

        // Enter element inside an array
        System.out.println("Enter the elements in an array");
        for(int i=0;i<size;i++)
        {
            arr1[i] = sc.nextInt();
        }

       
       sc.close();
    }
}