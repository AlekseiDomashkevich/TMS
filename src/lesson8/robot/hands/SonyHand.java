package lesson8.robot.hands;

public class SonyHand implements IHand{
    private int price;

    public SonyHand(){

    }

    public SonyHand(int price){
        this.price = price;
    }

    @Override
    public void upHand() {
        System.out.println("Поднимается рука Sony");
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Sony";
    }
}
