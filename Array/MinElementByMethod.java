package Array;

import java.util.Scanner;

public class MinElementByMethod 
{

    static int minValue(int [] arr, int size){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<size;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) 
    {
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

        System.out.println("Minimum Value is : "+minValue(arr, size));
        sc.close();
    }
}