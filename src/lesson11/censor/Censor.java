package lesson11.censor;


import java.util.*;

public class Censor {
    private Set<String> result = new HashSet<>();

    public Set<String> chekText(String text, String blackList) {
        String[] sentences = text.split("[!?.]+");
        String[] blackWords = blackList.split(",");
        for (String sentence : sentences) {
            for (String blackWord : blackWords) {
                if (sentence.contains(blackWord)) {
                    result.add(sentence.trim());
                }
            }
        }
        return result;
    }
}
