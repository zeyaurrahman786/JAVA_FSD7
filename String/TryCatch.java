public class TryCatch 
{
    public static void main(String[] args) 
    {
        try 
        {
            // int a = 10 / 0;
            String str = "Java";
            int i = Integer.parseInt(str);
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }
        System.out.println("This code Executed");
    }
}