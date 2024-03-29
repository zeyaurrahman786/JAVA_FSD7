public class FibonacciSeries {
    static int fibb(int n){
        if(n==0){
            return 2;
        }
        if(n==1){
            return 5;
        }
        return fibb(n-1) + fibb(n-2);
    }
    public static void main(String[] args) {
        for(int i=0; i<10; i++){
            if(fibb(i)){
                System.out.println(i);
            }
        }
    }
}
 