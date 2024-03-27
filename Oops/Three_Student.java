package Oops;

class Student{
    String name = "Zeyaur";
    String branch = "CSE";
    String enrollment = "0116CS211063";

    int m1 = 85;
    int m2 = 75;
    int m3 = 95;

    double average(int m1, int m2, int m3){
        double sum = m1+m2+m3;
        double average = (m1+m2+m3)/3;
        return average;
    }

    void display (){
        System.out.println("Name is :- "+name);
        System.out.println("Branch is :- "+branch);
        System.out.println("Enrollment is :- "+enrollment);
        System.out.println(s.average);
    }
}

public class Three_Student {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}
