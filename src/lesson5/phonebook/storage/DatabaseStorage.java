package lesson5.phonebook.storage;

<<<<<<<<< Temporary merge branch 1
import lesson5.phonebook.entity.Person;

public class DatabaseStorage implements Storage {
    @Override
    public void save(Person save) {
        ;
=========
import lesson5.phonebook.marshaller.Marshaller;

import java.util.List;

public class DatabaseStorage<E> extends BaseStorage implements Storage<E> {
    @Override
    public Class getEntityClass() {
        return null;
    }

    @Override
    public void setEntityClass(Class<E> clazz) {

    }

    @Override
    public void setMarshaller(Marshaller marshaller) {

    }

    @Override
    public String getFilePath() {
        return null;
    }

    @Override
    public void save(Object save) {

    }

    @Override
    public List<E> findAll() {
        return Storage.super.findAll();
>>>>>>>>> Temporary merge branch 2
    }
}
