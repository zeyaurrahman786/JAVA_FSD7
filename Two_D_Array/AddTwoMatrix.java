package Two_D_Array;

import java.util.Scanner;

public class AddTwoMatrix {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the number of Rows : ");
        int row = sc.nextInt();
        System.out.print("Enter the number of Columns : ");
        int col = sc.nextInt();

        int arr1 [] [] = new int [row] [col];
        int arr2 [] [] = new int [row] [col];
        int arr3 [] [] = new int [row] [col];

        System.out.println("Enter the elements of the Array1 : ");
        for(int i=0;i<row;i++)
        {
            for(int j=0; j<col;j++)
            {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the elements of the Array2 : ");
        for(int i=0;i<row;i++)
        {
            for(int j=0; j<col;j++)
            {
                arr2[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<row;i++)
        {
            for(int j=0; j<col;j++)
            {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        

        // For Display
        System.out.println("Elements of the Array3 are : ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
