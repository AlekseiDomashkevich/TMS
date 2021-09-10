package lesson8.human;

import lesson8.human.jacket.IJacket;
import lesson8.human.pants.IPants;
import lesson8.human.shoes.IShoes;

public class Human {
    private String name;
    private IJacket jacket;
    private IPants pants;
    private IShoes shoes;

    public Human() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human(String name, IJacket jacket, IPants pants, IShoes shoes) {
        this.name = name;
        this.jacket = jacket;
        this.pants = pants;
        this.shoes = shoes;
    }

    public void putOn() {
        jacket.putOn();
        pants.putOn();
        shoes.putOn();
    }

    public void takeOff() {
        jacket.takeOff();
        pants.takeOff();
        shoes.takeOff();
    }
}
