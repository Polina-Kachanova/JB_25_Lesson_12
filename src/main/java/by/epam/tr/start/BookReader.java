package by.epam.tr.start;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

public class BookReader {

    private BookReader() {}

    public static List<Book> readJsonFile(String fileName) throws FileNotFoundException {
        Gson gson = new Gson();
        JsonReader reader = new JsonReader(new FileReader(fileName));
        Book[] books = gson.fromJson(reader, Book[].class);
        return Arrays.asList(books);
    }
}


