package OOPS;

public class inharitance  {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();

        Bird bird = new Bird();
        bird.fly();
    }
}
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breath(){
        System.out.println("breath");
    }
}
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("swim in water");
    }
}
class Mammal extends Animal{
    void walk(){
        System.out.println("walks");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("Fly");
    }
}
