package lesson8.human.jacket;

public class AlphaJacket implements IJacket{
    @Override
    public void putOn() {
        System.out.println("Одеваем куртку Alpha");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимаем куртку Alpha");
    }
}
