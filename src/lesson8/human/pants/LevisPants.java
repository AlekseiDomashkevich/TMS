package lesson8.human.pants;

public class LevisPants implements IPants {
    @Override
    public void putOn() {
        System.out.println("Одеваем штаны Levis");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимаем штаны Levis");
    }
}
