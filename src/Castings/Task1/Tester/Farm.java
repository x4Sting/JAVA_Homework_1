package Castings.Task1.Tester;

import Castings.Task1.Model.*;

public class Farm {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Murzik"),
                new Duck("Donald"),
                new PetDog("Jack"),
                new Spaniel("Lessi")
        };

        for (Animal animal : animals){
            animal.move();

            if (animal instanceof Cat)
                ((Cat) animal).sleep();
            else if (animal instanceof Duck)
                ((Duck) animal).eat();
            else if (animal instanceof Dog) {
                ((Dog) animal).play();

                if (animal instanceof PetDog)
                    ((PetDog) animal).bark();
                else if (animal instanceof Spaniel)
                    ((Spaniel) animal).whine();
            }
        }
    }
}
