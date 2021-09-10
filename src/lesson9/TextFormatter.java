package lesson9;

public class TextFormatter {

    public static int getWordCount(String line) {
        String[] words = line.split("\\s+");
        return words.length;
    }

    public static boolean isPalindromeInLine(String line) {
        //Уберем все знаки препинания для корректного поиска палиндромов
        //и затем разделим строку на слова
        String[] words = line.replaceAll("[^A-Za-zА-Яа-я0-9\\s]+", "").split("\\s+");
        StringBuilder builder;
        for (String word : words) {
            builder = new StringBuilder(word);
            //исключим из палиндромов все предлоги из одной буквы
            if (builder.reverse().toString().equals(word) && word.length() > 1) {
                return true;
            }
        }
        return false;
    }
}
