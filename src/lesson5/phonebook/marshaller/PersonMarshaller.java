package lesson5.phonebook.marshaller;

import lesson5.phonebook.entity.Person;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class PersonMarshaller implements Marshaller {
    private OutputStream fout;

    public void setStream(OutputStream fin) {
        this.fout = fin;
    }

    @Override
    public void process(Object entity) throws IOException {
        var person = (Person) entity;
        var ois = new ObjectOutputStream(fout);
        ois.writeObject(person);
        ois.flush();
        ois.close();



//        fin.write(person.getId().toString().getBytes(StandardCharsets.UTF_8));
//        fin.write("/".getBytes(StandardCharsets.UTF_8));
//        fin.write(person.getFirstname().getBytes(StandardCharsets.UTF_8));
//        fin.write("/".getBytes(StandardCharsets.UTF_8));
//        fin.write(person.getLastname().getBytes(StandardCharsets.UTF_8));
//        fin.write("/".getBytes(StandardCharsets.UTF_8));
//        fin.write(person.getAge().toString().getBytes(StandardCharsets.UTF_8));
//        fin.write("/".getBytes(StandardCharsets.UTF_8));
//        fin.write(person.getPhoneNumber().getBytes(StandardCharsets.UTF_8));
//        fin.write("/".getBytes(StandardCharsets.UTF_8));
//        fin.write(person.getAddress().getBytes(StandardCharsets.UTF_8));
//        fin.write("\n".getBytes(StandardCharsets.UTF_8));
    }
}
