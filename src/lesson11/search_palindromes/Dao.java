package lesson11.search_palindromes;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Dao {
    public String readFile(String filePath) throws IOException {

        FileReader reader = new FileReader(filePath);
        StringBuilder text = new StringBuilder();
        int i = 0;
        while ((i = reader.read()) != -1) {
            text.append((char) i);
        }
        reader.close();

        return text.toString();
    }

    public void writeFile(String filePath, String text) throws IOException {
        FileWriter writer = new FileWriter(filePath, true);
        writer.write(text);
        writer.write("\n");
        writer.flush();
        writer.close();
    }
}
