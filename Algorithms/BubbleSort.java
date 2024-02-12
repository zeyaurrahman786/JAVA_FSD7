package Algorithms;

public class BubbleSort 
{
    public static void main(String[] args) 
    {
        int [] arr = {4,2,3,1,7,8,0,9};
        for(int i=0; i<=7;i++)
        {
            for(int j=i+1; j<=7; j++)
            {
                if(arr[i] > arr[j])
                {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
            System.out.println(arr[i]+" ");
        }
    }
}
