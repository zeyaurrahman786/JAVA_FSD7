package Array;

import java.util.Scanner;

public class SearchingOfAnElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creation of an array
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();  // determines size
        int [] arr = new int[size];  // create space for array

        // En ter element inside an array
        for(int i=0;i<size;i++)
        {
            System.out.println("Enter the elements inside an array");
            arr[i] = sc.nextInt();  // elements entering in array
        }

        boolean flag = false;
        System.out.println("Enter the search element");
        int SearchElement = sc.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == SearchElement){
                flag = true;
                break;
            }
        }
        if(flag == true){
            System.out.println("Element found");
        }
        else{
            System.out.println("Element not found");
        }
        sc.close();
    }
}



// Linear search algorithm
             