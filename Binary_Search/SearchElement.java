package Binary_Search;

public class SearchElement {
    public static int main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8};
        int lenght [] = {8};
        int se = 7;
        int l = 0;
        int r = arr.length-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid]==se){
                return mid;
            }
            if(se>arr[mid]){
                l=mid+1;
            }
            if(se<arr[mid]){
                r=mid-1;
            } 
        }
        return -1;
        System.out.println(arr,);
    }  
}
