package Oops;

class Calculator {
    int add(int a, int b){
        int c = a+b; // c is my local variable
        return c;
    }
}

public class Four_Calculator {
    public static void main(String[] args) {
        // a,b are local variables
        int a = 10;
        int b = 20;
        Calculator c1 = new Calculator();
        System.out.println(c1.add(a,b));

        int d = 0;
        System.out.println(d);
    }
}
