package lesson12;

import lesson12.controller.CommandLineController;

public class StoreApplication {
    public static void main(String[] args) {
        var controller = new CommandLineController();
        controller.start();
    }
}
