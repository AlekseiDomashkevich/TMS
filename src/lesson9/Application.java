package lesson9;


import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        Dao dao = new Dao();
        String text = dao.getTextFromFile("./text.txt");
        String[] lines = text.split("[.!?]+");

        for (String line : lines) {
            if (TextFormatter.isPalindromeInLine(line)
                    || (TextFormatter.getWordCount(line) >= 3 && TextFormatter.getWordCount(line) <= 5)) {
                dao.setTextToFile("./newText.txt", line);
            }
        }
    }
}
