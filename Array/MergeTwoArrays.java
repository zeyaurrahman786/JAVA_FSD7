package Array;

public class MergeTwoArrays 
{
    public static void main(String[] args) 
    {

        int [] arr1 = {1,2,3,4};
        int [] arr2 = {5,6,7,8};
        int [] arr3 = new int [8];

        int j = 0;
        for(int i=0; i<arr1.length; i++){
            arr3[j] = arr1[i];
            j++;
        }

        for(int i=0; i<arr2.length; i++){
            arr3[j] = arr2[i];
            j++;
        }

        for(int Display : arr3){
            System.out.println(Display + " ");
        }

    }
}
