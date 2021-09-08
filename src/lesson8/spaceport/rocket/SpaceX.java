package lesson8.spaceport.rocket;

import java.util.Random;

public class SpaceX implements IStart {
    @Override
    public boolean checkSystem() {
        return new Random().nextInt(2) == 1;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели SpaceX запущены. Все системы в норме.");

    }

    @Override
    public void start() {
        System.out.println("Старт SpaceX");
    }
}
