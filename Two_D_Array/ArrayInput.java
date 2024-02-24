package Two_D_Array;

import java.util.Scanner;

public class ArrayInput 
{
    public static void main(String[] args) 
    {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the number of Rows : ");
        int row = sc.nextInt();
        System.out.print("Enter the number of Columns : ");
        int col = sc.nextInt();

        int arr [] [] = new int [row] [col];

        System.out.println("Enter the elements of the Array : ");
        for(int i=0;i<row;i++)
        {
            for(int j=0; j<col;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        // For Display
        System.out.println("Elements of the Array are : ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
