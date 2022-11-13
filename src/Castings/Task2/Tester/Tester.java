package Castings.Task2.Tester;

import Castings.Task2.Model.*;

public class Tester {
    public static void main(String[] args) {
        Person[] persons = {
          new Clerk("Bob", 500),
          new Clerk("Elena", 600),
          new Manager("Aleks", 2000),
          new Manager("John", 2500)
        };

        for (Person person : persons) {
            person.work();

            if (person instanceof Clerk)
                ((Clerk) person).workOvertime();
            else if (person.getClass() == Manager.class)
                ((Manager) person).sleep();
        }
    }
}
