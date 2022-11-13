package Castings.Task3.Model;

public class Newspaper extends Issue {
    private int circulation;

    public Newspaper(String name, int circulation) {
        super(name);
        this.circulation = circulation;
    }

    public void printCirculation() {
        System.out.println("Тираж:" + circulation);
    }
}
