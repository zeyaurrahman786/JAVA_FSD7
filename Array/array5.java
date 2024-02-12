package Array;

import java.util.Scanner;

public class array5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int size = sc.nextInt();

        // creation of empty array object
        String[] arr = new String[size];

        // input element inside an array
        for (int i = 0; i <= size - 1; i++) {
            System.out.print("Enter the element : ");
            
            arr[i] = sc.next();
        }

        // Display array element
        for (String a : arr) {
            System.out.println(a);
        }
        sc.close();
    }
}
