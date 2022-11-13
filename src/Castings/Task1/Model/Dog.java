package Castings.Task1.Model;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Dog which is called "  + getName() + " now is moving…");
    }

    public void play() {
        System.out.println("Dog "  + getName() + " is playing now");
    }
}
