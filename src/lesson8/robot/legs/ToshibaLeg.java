package lesson8.robot.legs;

public class ToshibaLeg implements ILeg {
    private int price;

    public ToshibaLeg() {

    }

    public ToshibaLeg(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Шагает нога Toshiba");
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
