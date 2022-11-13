package Castings.Task2.Model;

public class Manager extends Employee{
    public Manager(String name, int salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println("Manager " + getName() + " is working now and earns " + getSalary());
    }

    public void sleep() {
        System.out.println("Manager " + getName() + " is sleeping");
    }
}
