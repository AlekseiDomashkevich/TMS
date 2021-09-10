package lesson8.human.jacket;

public class ColumbiaJacket implements IJacket {
    @Override
    public void putOn() {
        System.out.println("Одеваем куртку Columbia");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимаем куртку Columbia");
    }
}
