package lesson5.phonebook;

import lesson5.phonebook.dao.PhonebookDAO;
import lesson5.phonebook.mapper.InputMapper;
import lesson5.phonebook.storage.FileStorage;

import java.util.Collections;

public class Application {
    public static void main(String[] args) {
        var action = args[0];
        //var dao = new PhonebookDAO(Arrays.asList(new FileStorage(), new DatabaseStorage()));
        var dao = new PhonebookDAO(Collections.singletonList(new FileStorage()));
        switch (action) {
            case "update" -> {
                dao.update(Integer.parseInt(args[1]), args[2]);
            }
            case "generate" -> {
                var mapper = new InputMapper();
                for (int i = 0; i < 15; i++) {
                    dao.save(mapper.toEntity(args));
                }
            }
            case "save" -> {
                var mapper = new InputMapper();
                dao.save(mapper.toEntity(args));
            }
            case "call" -> {
                var person = dao.findByLastname(args[1]);
                //person.getPhoneNumber();
            }
            case "delete" -> {
                dao.delete(Integer.parseInt(args[1]));
            }
            case "find" -> {
                var person = dao.find(Integer.parseInt(args[1]));
                if (person != null) {
                    System.out.println(person);
                } else {
                    System.err.println("Person not found");
                }
            }
        }
    }
}
