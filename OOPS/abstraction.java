package OOPS;

public class abstraction {
    public static void main(String[] args) {

    }

}
abstract class Animals{
    void eat(){
        System.out.println("Animal eats");
    }

    abstract void walk();
}

class Horse extends Animals {
    void walk(){
        System.out.println("walk on 4 leg");
    }
}

class chicken extends Animals {
    @Override
    void walk() {
        System.out.println("walk on 2 leg");
    }
}