package Array;

import java.util.Scanner;

public class LeftRotateArrayByKthTerms {
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

        //  Logic Starts Here 
        System.out.println("Enter the no. of elements to be rotated");
        int k = sc.nextInt();
        int mod = k%size;
        for(int i=0;i<size;i++){
            System.out.print(arr1[(i+mod)%size]+" ");
        }
        sc.close();
    }
}
