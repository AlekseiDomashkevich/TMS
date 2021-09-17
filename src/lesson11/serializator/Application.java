package lesson11.serializator;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class Application {
    public static void main(String[] args) {
        var bmw = new Car("BMW", 50000, 300);
        var lexus = new Car("Lexus", 80000, 250);
        var ford = new Car("Ford", 25000, 250);

        var carList = new ArrayList<Car>();
        carList.add(new Car("Toyota", 20000, 300));
        carList.add(new Car("Volkswagen", 15000, 180));
        carList.add(new Car("Peugeot", 20000, 200));
        carList.add(new Car("Citroen", 25000, 200));

        var marshaller = new CarMarshaller();
        try {
            marshaller.setfOut(new FileOutputStream("./Cars.out", true));
            for (Car car : carList) {
                marshaller.writeObject(car);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        var restoredCarList = new LinkedList<Car>();
        try {
            marshaller.setfIn(new FileInputStream("./Cars.out"));
            while (true) {
                try {
                    restoredCarList.add(marshaller.readObject());
                } catch (EOFException e) {
                    break;
                }
            }

        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }

        for (Car car : restoredCarList) {
            System.out.println(car);
        }


//        var marshaller = new CarMarshaller();
//        try {
//            marshaller.setfOut(new FileOutputStream("./Cars.out", true));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        try {
//            marshaller.writeObject(bmw);
//            marshaller.writeObject(lexus);
//            marshaller.writeObject(ford);
//        } catch (IOException exception) {
//            exception.printStackTrace();
//        }
//        try {
//            marshaller.setfIn(new FileInputStream("./Cars.out"));
//            var restoredBmw = marshaller.readObject();
//            System.out.println(restoredBmw);
//            var restoredLexus = marshaller.readObject();
//            System.out.println(restoredLexus);
//            var restoredFord = marshaller.readObject();
//            System.out.println(restoredFord);
//        } catch (IOException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//

    }
}
