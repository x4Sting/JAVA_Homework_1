package Castings.Task3.Model;

public class Journal extends Issue {
    private int pages;

    public Journal(String name, int pages) {
        super(name);
        this.pages = pages;
    }

    public void printPages() {
        System.out.println("Страниц:" + pages);
    }
}
