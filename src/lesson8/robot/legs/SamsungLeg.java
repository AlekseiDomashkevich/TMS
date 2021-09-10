package lesson8.robot.legs;

import lesson8.robot.heads.SamsungHead;

public class SamsungLeg implements ILeg {
    private int price;

    public SamsungLeg() {

    }

    public SamsungLeg(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Шагает нога Samsung");
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
