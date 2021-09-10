package lesson5.phonebook.controller;



import lesson5.phonebook.dao.PhonebookDAO;
import lesson5.phonebook.entity.Person;
import lesson5.phonebook.mapper.PersonMapper;
import lesson5.phonebook.marshaller.PersonMarshaller;
import lesson5.phonebook.storage.FileStorage;

import java.util.Collections;
import java.util.List;

public class PhonebookController implements IController {
    @Override
    public void process(List<String> arguments) {
        var storage = new FileStorage<Person>("./phonebook.txt");
        storage.setMarshaller(new PersonMarshaller());
        storage.setEntityClass(Person.class);

        var dao = new PhonebookDAO(Collections.singletonList(storage));
        switch (arguments.get(0).replace("phonebook/", "")) {
            case "generate" -> {
                var mapper = new PersonMapper();
                for (int i = 0; i < 15; i++) {
                    dao.save(mapper.toEntity(arguments));
                }
            }
            case "save" -> {
                var mapper = new PersonMapper();
                dao.save(mapper.toEntity(arguments));
            }
            case "call" -> {
                var person = dao.findByLastname(arguments.get(1));
                //person.getPhoneNumber();
            }
            case "delete" -> {
                dao.delete(Integer.parseInt(arguments.get(1)));
            }
            case "find" -> {
                var person = dao.find(Integer.parseInt(arguments.get(1)));
                if (person != null) {
                    System.out.println(person);
                } else {
                    System.err.println("Person not found");
                }
            }
        }
    }
}
