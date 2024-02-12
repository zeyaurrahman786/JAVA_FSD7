package Array;

import java.util.Scanner;

public class SumOfEvenIndex {
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

        int sum = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(i%2==0){
                sum = sum + arr[i];
            }
        }
        System.out.println("The sum of array elements is : "+sum);
        sc.close();
    }
}




// Enter the size of an array
// 5
// Enter the elements inside an array
// 3
// Enter the elements inside an array
// 2
// Enter the elements inside an array
// 7
// Enter the elements inside an array
// 4
// Enter the elements inside an array
// 5
// The sum of array elements is : 15