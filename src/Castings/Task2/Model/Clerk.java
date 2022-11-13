package Castings.Task2.Model;

public class Clerk extends Employee{
    public Clerk(String name, int salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println("Clerk " + getName() + " is working now and earns " + getSalary());
    }

    public void workOvertime() {
        System.out.println("Clerk " + getName() + " started working overtime");
    }
}
