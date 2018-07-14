package by.epam.tr.start;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        List<Book> books = BookReader.readJsonFile("Books.json");

        for (Book book: books) {
            System.out.println(book.toString());
        }
    }
}