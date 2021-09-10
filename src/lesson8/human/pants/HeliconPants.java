package lesson8.human.pants;

public class HeliconPants implements IPants {
    @Override
    public void putOn() {
        System.out.println("Одеваем штаны Helicon");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимаем штаны Helicon");
    }
}
