package pckg_zadatak2;

import java.text.ParseException;

public class App {
    public static void main(String[] args) throws ParseException {
        Robot rob = new Robot("RoboBobo");
        rob.setName("Roby");
        rob.setId(45126);
        Person prs = new Person("Roberta");

        prs.think("Life");
        rob.think("Life");
        prs.walk("North", 50);
        rob.walk("South", 123);
        System.out.println("********** Calculations **************");

        System.out.println(prs.calculate(9));
        System.out.println(rob.calculate(9));

        rob.infoRobot();
        prs.infoPerson();

    }
}
