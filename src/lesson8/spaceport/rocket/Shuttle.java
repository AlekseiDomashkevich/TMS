package lesson8.spaceport.rocket;

import java.util.Random;

public class Shuttle implements IStart {
    @Override
    public boolean checkSystem() {
        return new Random().nextInt(11) > 3;

    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели Шаттла запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Шаттла");
    }
}
