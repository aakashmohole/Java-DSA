package OOPS;

public class classesAndObjects {
    public static void main(String[] args) {
        Pen p1 = new Pen(); //created pen object called p1

        p1.setColor("Blue");
        System.out.println(p1.getColor());

        p1.setTip(5);
        System.out.println(p1.getTip());

        p1.setColor("Red");
        System.out.println(p1.getColor());

        Student s1 = new Student();
        s1.name = "Om";
        s1.roll = 77;
        s1.password = "asdf";

        Student s2 = new Student(s1);
        s2.password = "asd";

    }
}

class BankAccount{
    public String username;
    private String password;

    public void setPassword(String pwd){
        password = pwd;
    }

}

class Pen{
    private String color;
    private int tip;

    //getter
    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }

    //setter
    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}
class Student{
    String name;
    int roll;
    String password;

    Student(Student s1){
        this.name = s1.name;
        this.roll = s1.roll;
    }
    Student(){
        System.out.println("Calling Constructor");
    }

}
