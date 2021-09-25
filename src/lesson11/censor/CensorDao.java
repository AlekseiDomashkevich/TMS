package lesson11.censor;

import java.io.*;

public class CensorDao {

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
}
