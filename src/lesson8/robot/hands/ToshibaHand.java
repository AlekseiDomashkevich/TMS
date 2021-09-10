package lesson8.robot.hands;

public class ToshibaHand implements IHand {
    private int price;

    public ToshibaHand() {

    }

    public ToshibaHand(int price) {
        this.price = price;
    }

    @Override
    public void upHand() {
        System.out.println("Поднимается рука Toshiba");
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Toshiba";
    }
}
