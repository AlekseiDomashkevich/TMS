package lesson11.serializator;

import java.io.*;

public class CarMarshaller {
    private FileOutputStream fOut;
    private FileInputStream fIn;

    public void setfOut(FileOutputStream fOut) {
        this.fOut = fOut;
    }

    public void setfIn(FileInputStream fIn) {
        this.fIn = fIn;
    }

    public void writeObject(Car car) throws IOException {
        var oos = new ObjectOutputStream(fOut);
        oos.writeObject(car);
        oos.flush();

    }

    public Car readObject() throws IOException, ClassNotFoundException {
        var ois = new ObjectInputStream(fIn);
        return (Car) ois.readObject();
    }
}
