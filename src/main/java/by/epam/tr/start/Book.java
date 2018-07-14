package by.epam.tr.start;

public class Book {

    private String name;
    private int yearPublished;
    private String author;

    public Book(String name, int yearPublished, String author) {
        this.name = name;
        this.yearPublished = yearPublished;
        this.author = author;
    }

    @Override
    public String toString() {
        return  "name = " + name + '\n' +
                "yearPublished = " + yearPublished + "\n" +
                "author = " + author + "\n";
    }
}
