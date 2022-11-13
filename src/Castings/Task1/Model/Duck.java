package Castings.Task1.Model;

public class Duck extends Animal{
    public Duck(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Duck which is called "  + getName() + " now is moving…");
    }

    public void eat() {
        System.out.println("Duck "  + getName() + " is eating now");
    }
}
