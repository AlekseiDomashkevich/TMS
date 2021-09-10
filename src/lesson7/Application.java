package lesson7;

import lesson7.entity.Computer;

import java.util.Random;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Computer computer = new Computer();
        computer.setCpu("Intel Core I7");
        computer.setRam("16 GB DDR3");
        computer.setHdd("1 TB Western Digital");
        computer.setResource(10);

        computer.printInfo();

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Turn ON the computer (enter 0 or 1)");
            if (new Random().nextInt(2) == scanner.nextInt()) {
                computer.start();
                computer.setResource(computer.getResource() - 1);
            } else {
                computer.crash();
                return;
            }
            scanner.nextLine();


            System.out.println("Turn OFF the computer (enter 0 or 1)");
            if(new Random().nextInt(2) == scanner.nextInt()){
                computer.shutDown();
                computer.setResource(computer.getResource() - 1);
            }else {
                computer.crash();
                return;
            }
            scanner.nextLine();

        } while (computer.getResource() > 0);
    }
}
