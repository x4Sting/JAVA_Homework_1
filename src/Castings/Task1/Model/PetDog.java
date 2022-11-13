package Castings.Task1.Model;

public class PetDog extends Dog{
    public PetDog(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("PetDog which is called "  + getName() + " now is moving…");
    }

    @Override
    public void play() {
        System.out.println("PetDog "  + getName() + " is playing at home now");
    }

    public void bark() {
        System.out.println("PetDog "  + getName() + " is barking now");
    }
}
