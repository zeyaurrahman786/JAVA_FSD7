public class TryCatch2 {
    public static void main(String[] args) {
        int age = 14;
        if(age<18)
        {
            throw new ArithmeticException("Age is below 18");
        }
        else
        {
            System.out.println("Applicable for DL");
        }
    }
}