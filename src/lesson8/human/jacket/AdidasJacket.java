package lesson8.human.jacket;

public class AdidasJacket implements IJacket {
    @Override
    public void putOn() {
        System.out.println("Одеваем куртку Adidas");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимаем куртку Adidas");
    }
}
