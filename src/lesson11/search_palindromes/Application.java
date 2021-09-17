package lesson11.search_palindromes;

import java.io.IOException;

public class Application {
    public static void main(String[] args) {
        Dao dao = new Dao();
        String text = null;
        try {
            text = dao.readFile("./text.txt");
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        String[] words = text.replaceAll("[^A-Za-z0-9А-Яа-я\\s]+", "").split("\\s");
        for (String word : words) {
            StringBuilder builder = new StringBuilder(word);
            String isPalindrome = builder.reverse().toString();
            if (isPalindrome.equals(word)) {
                System.out.println(word);
                try {
                    dao.writeFile("./palindromes.txt", word);
                } catch (IOException exception) {
                    exception.printStackTrace();
                }
            }
        }

    }
}
