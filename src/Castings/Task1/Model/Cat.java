package Castings.Task1.Model;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Cat which is called "  + getName() + " now is moving…");
    }

    public void sleep() {
        System.out.println("Cat "  + getName() + " is sleeping now");
    }
}
