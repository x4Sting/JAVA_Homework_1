package Castings.Task3.Model;

public class Book extends Issue {
    String authors;

    public Book(String name, String authors) {
        super(name);
        this.authors = authors;
    }

    public void printAuthors() {
        System.out.println("Авторы:" + authors);
    }

}
