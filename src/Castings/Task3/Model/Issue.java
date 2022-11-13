package Castings.Task3.Model;

public class Issue {
    String name;

    public Issue(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("Наименование:" + name);
    }

}
