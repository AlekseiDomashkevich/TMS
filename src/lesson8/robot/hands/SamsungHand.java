package lesson8.robot.hands;

import lesson8.robot.heads.SamsungHead;
import lesson8.robot.legs.SamsungLeg;

public class SamsungHand implements IHand {
    private int price;

    public SamsungHand() {

    }

    public SamsungHand(int price) {
        this.price = price;
    }

    @Override
    public void upHand() {
        System.out.println("Поднимается рука Samsung");
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
