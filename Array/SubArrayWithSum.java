package Array;

import java.util.Scanner;

public class SubArrayWithSum {
    private static int i;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creation of an array
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();  // determines size
        int [] arr = new int[size];  // create space for array

        // Enter element inside an array
        System.out.println("Enter the elements in an array");
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }

        int CSum = arr[0];
        int start = 0;
        int sum = 1;
        int n = 0;
        for(int i=1;i<n;i++){
            while(CSum>sum && start<i){
                CSum = CSum - arr[start];
                start++;
            }
            if(CSum==sum){
                System.out.println(start + " " + (i-1));
            }
            if(i<n){
                CSum = CSum + arr[i];
            }
        }
       System.out.println();
       sc.close();
    }
}