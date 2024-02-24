package Oops;

class Dog{
    String name = "Tommy";
    String color = "Brown";

    void sleep(){
        System.out.println("Dog is sleeping");
    }

    void eat(){
        System.out.println("Dog is eating");
    }
}

public class Two_dog {

    public static void main(String[] args) {
        Dog d1 = new Dog();
        System.out.println(d1.name);
        System.out.println(d1.color);
        d1.sleep();
        d1.eat();
    }
}
