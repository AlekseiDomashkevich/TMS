package lesson11.censor;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CensorApplication {
    public static void main(String[] args) throws IOException {
        CensorDao dao = new CensorDao();
        String text = dao.readFile("./text.txt");
        String blackList = dao.readFile("./black list.txt");

        Censor censor = new Censor();
        var result = censor.chekText(text, blackList);
        if (result.isEmpty()) {
            System.out.println("Текст прошел проверку");
        } else {
            System.out.println("Количество предложений не прошедщих проверку - " + result.size());
            System.out.println("Предложения не прошедшие проверку:");
            for (String s : result) {
                System.out.println(s);
            }
        }


    }
}
