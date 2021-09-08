package lesson8.spaceport;

import lesson8.spaceport.rocket.IStart;

public class Spaceport {

    public void start(IStart iStart) throws InterruptedException {
        if (iStart.checkSystem()) {
            iStart.startEngine();
            for (int i = 10; i > 0; i--) {
                System.out.println("До старта осталось - " + i);
                Thread.sleep(1000);

            }
            iStart.start();
        } else {
            System.out.println("Предстартовая проверка провалена.");
        }
    }
}
