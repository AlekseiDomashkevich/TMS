package lesson8.robot.legs;

public class SonyLeg implements ILeg{
    private int price;

    public SonyLeg(){

    }

    public SonyLeg(int price){
        this.price = price;
    }
    @Override
    public void step() {
        System.out.println("Шагает нога Sony");
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String toString(){
        return "Sony";
    }
}
