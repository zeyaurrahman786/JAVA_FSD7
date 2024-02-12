package Array;

import java.util.Scanner;

public class arraySyntax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr [] = new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter the element");
        }

        sc.close();
    }
}
