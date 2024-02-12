// Write a program to find the product of elements present in an array ?

package Array;

import java.util.Scanner;

public class ProductOfArray {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        // Creation of an array
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();  // determines size
        int [] arr = new int[size];  // create space for array

        // Enter element inside an array
        for(int i=0;i<size;i++)
        {
            System.out.println("Enter the elements inside an array");
            arr[i] = sc.nextInt();  // elements entering in array
        }

        int product = 1;
        for(int i=0;i<arr.length;i++)
        {
            product = product * arr[i];
        }
        System.out.println("The product of array elements is : "+product);
        sc.close();
    }
}
