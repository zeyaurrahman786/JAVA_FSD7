public class Palindrome {
    static boolean checkPalindrome(int num){
        int rev = 0;
        while(num>0){
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        if(num == rev){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        
    }
}
