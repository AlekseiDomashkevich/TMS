package lesson8.human.shoes;

public class LowaShoes implements IShoes {
    @Override
    public void putOn() {
        System.out.println("Одеваем обувь Lowa");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимаем обувь Lowa");
    }
}
