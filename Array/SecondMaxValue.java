package Array;

public class SecondMaxValue {
    public static int main(String[] args) 
    {
        int[] arr = {2,7,4,9,8,6,3};
        int max = Integer.MIN_VALUE;
        int Secondmax = Integer.MIN_VALUE;
        for(int i=0;i<6;i++){
            if(arr[i]>max){
                Secondmax = max;
                max = arr[i];
            }
            else if (arr[i]>Secondmax && arr[i]!=max){
                Secondmax= arr[i];
            }
        }
        return Secondmax;
    }
}
