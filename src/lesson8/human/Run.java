package lesson8.human;

import lesson8.human.jacket.ColumbiaJacket;
import lesson8.human.pants.HeliconPants;
import lesson8.human.shoes.LowaShoes;

public class Run {
    public static void main(String[] args) {
        var human = new Human("Вася", new ColumbiaJacket(), new HeliconPants(), new LowaShoes());
        human.putOn();
        human.takeOff();
    }
}
