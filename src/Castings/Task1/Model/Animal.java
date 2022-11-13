package Castings.Task1.Model;

public class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void move() {
        System.out.println("Animal which is called "  + name + " now is moving…");
    }


}
