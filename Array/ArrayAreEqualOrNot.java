package Array;

public class ArrayAreEqualOrNot 
{

    static boolean sameArray (int [] a, int [] b)
    {
        if(a.length!=b.length)
        {
            return false;
        }
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) 
    {
        int [] a = {10,20,30,40,50};
        int [] b = {10,20,30,40,50};
        boolean res = sameArray(a,b);
        if(res==true){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }
    }
}
