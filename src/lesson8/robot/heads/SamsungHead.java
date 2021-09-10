package lesson8.robot.heads;

public class SamsungHead implements IHead {
    private int price;

    public SamsungHead() {

    }

    public SamsungHead(int price) {
        this.price = price;
    }

    @Override
    public void speak() {
        System.out.println("Говорит голова Samsung");

    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Samsung";
    }
}
