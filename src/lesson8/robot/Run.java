package lesson8.robot;

import lesson8.robot.hands.SamsungHand;
import lesson8.robot.hands.SonyHand;
import lesson8.robot.hands.ToshibaHand;
import lesson8.robot.heads.SamsungHead;
import lesson8.robot.heads.SonyHead;
import lesson8.robot.heads.ToshibaHead;
import lesson8.robot.legs.SamsungLeg;
import lesson8.robot.legs.SonyLeg;
import lesson8.robot.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {

        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */

        var robotOne = new Robot(new SamsungHead(100), new SonyHand(50), new ToshibaLeg(55));
        var robotTwo = new Robot(new ToshibaHead(150), new SamsungHand(40), new SonyLeg(40));
        var robotThree = new Robot(new SonyHead(125), new ToshibaHand(50), new SamsungLeg(120));

        System.out.println("Первый робот:");
        robotOne.action();
        System.out.println("Второй робот:");
        robotTwo.action();
        System.out.println("Третий робот:");
        robotThree.action();

        Robot maxPriceRobot = robotOne;
        if (robotTwo.getPrice() > maxPriceRobot.getPrice()) {
            maxPriceRobot = robotTwo;
        }
        if (robotThree.getPrice() > maxPriceRobot.getPrice()) {
            maxPriceRobot = robotThree;
        }

        System.out.println("Максимальную цену имеет робот с комлектацией: " + maxPriceRobot);
    }
}
