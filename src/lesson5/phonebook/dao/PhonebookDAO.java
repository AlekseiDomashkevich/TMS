package lesson5.phonebook.dao;

import lesson5.phonebook.entity.Person;
import lesson5.phonebook.storage.Storage;

import lesson5.phonebook.entity.Person;
import lesson5.phonebook.storage.Storage;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class PhonebookDAO {

    private final List<Storage<Person>> storages;

    public PhonebookDAO(List<Storage<Person>> storages) {
        this.storages = storages;
    }


    private void saveAll(Person[] people) {
        this.deleteFile();

        for (int i = 0; i < people.length; i++) {
            if (people[i] != null) {
               this.save(people[i]);
            }
        }
    }

    private void deleteFile() {
        new File("./phonebook.txt").delete();
    }

    public Person findByLastname(String lastname) {
        try (var scanner = new Scanner(new FileInputStream("./phonebook.txt")).useDelimiter("\\Z")) {
            var content = scanner.next();
            var lines = content.split("\n");
            for (int i = 0; i < lines.length; i++) {
                var row = lines[i];
                var columns = row.split("/");
                var p = new Person(columns[0], columns);
                if (p.getLastname().equals(lastname)) {
                    return p;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }

    public Person find(Integer id) {

        var storage = this.storages.get(0);
        var people = storage.findAll();
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).getId().equals(id)) {
                return people.get(i);
            }

        }

        return null;
    }

    public void delete(int id) {

        Person[] people = this.storages.get(0).findAll().toArray(new Person[0]);

        for (int i = 0; i < people.length; i++) {
            if (people[i].getId().equals(id)) {
                people[i] = null;
            }
        }
        this.saveAll(people);
    }

    public void save(Person person) {
        for (int i = 0; i < this.storages.size(); i++) {
            this.storages.get(i).save(person);
        }
    

}
