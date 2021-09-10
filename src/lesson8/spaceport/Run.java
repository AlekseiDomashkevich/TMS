package lesson8.spaceport;

import lesson8.spaceport.rocket.Shuttle;
import lesson8.spaceport.rocket.SpaceX;

public class Run {
    public static void main(String[] args) {
        var spaceport = new Spaceport();
        try {
            spaceport.start(new Shuttle());
            spaceport.start(new SpaceX());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
