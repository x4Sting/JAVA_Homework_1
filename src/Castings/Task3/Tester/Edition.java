package Castings.Task3.Tester;

import Castings.Task3.Model.*;

public class Edition {
    public static void main(String[] args) {
        Issue[] catalog = new Issue[] {
                new Journal("People", 50),
                new Newspaper("Из рук в руки", 2000),
                new Book("Война и мир", "Л.Толстой"), };

        for (Issue issue : catalog) {
            issue.printName();

            if (issue instanceof Journal)
                ((Journal) issue).printPages();
            else if (issue instanceof Book)
                ((Book) issue).printAuthors();
            else if (issue instanceof Newspaper)
                ((Newspaper) issue).printCirculation();
        }

    }
}
