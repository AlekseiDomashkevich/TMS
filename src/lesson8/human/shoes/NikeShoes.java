package lesson8.human.shoes;

public class NikeShoes implements IShoes {
    @Override
    public void putOn() {
        System.out.println("Одеваем обувь Nike");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимаем обувь Nike");
    }
}
