package Oops;

class Student{       // classes
    String name;
    int age;

    public void printInfo(){    // methods
        System.out.println(this.name);
        System.out.println(this.age);
    }
    public Student(String name, int age){  // iniliaze
        this.name=name;
        this.age=age;
    }
}
public class opps2 {
    public static void main(String[] args) {
        Student s1=new Student("Aman", 24);
        s1.printInfo();
    }
    
}
