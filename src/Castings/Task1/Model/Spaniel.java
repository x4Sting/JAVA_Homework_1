package Castings.Task1.Model;

public class Spaniel extends Dog{
    public Spaniel(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Spaniel which is called "  + getName() + " now is moving…");
    }

    @Override
    public void play() {
        System.out.println("Spaniel "  + getName() + " is playing outside now");
    }

    public void whine() {
        System.out.println("Spaniel "  + getName() + " is whining now");
    }
}
