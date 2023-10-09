package pl.javastart.task;

import java.util.Scanner;

public class CoordinateSystem {

    Point point = new Point();

    void run(Scanner scanner) {
        System.out.println("Podaj X");
        int x = scanner.nextInt();
        point.setX(x);
        System.out.println("Podaj Y");
        int y = scanner.nextInt();
        point.setY(y);
        printInfo();
    }

    private void printInfo() {
        if (firstQuarter()) {
            System.out.println("Punkt (" + point.getX() + ", " + point.getY() + ") leży w I ćwiartce układu współrzędnych");
        } else if (secondQuarter()) {
            System.out.println("Punkt (" + point.getX() + ", " + point.getY() + ") leży w II ćwiartce układu współrzędnych");
        } else if (thirdQuarter()) {
            System.out.println("Punkt (" + point.getX() + ", " + point.getY() + ") leży w III ćwiartce układu współrzędnych");
        } else if (fourthQuarter()) {
            System.out.println("Punkt (" + point.getX() + ", " + point.getY() + ") leży w IV ćwiartce układu współrzędnych");
        } else if (onMiddle()) {
            System.out.println("Punkt (" + point.getX() + ", " + point.getY() + ") leży na środku układu współrzędnych");
        } else if (onX()) {
            System.out.println("Punkt (" + point.getX() + ", " + point.getY() + ") leży na osi X");
        } else {
            System.out.println("Punkt (" + point.getX() + ", " + point.getY() + ") leży na osi Y");
        }
    }

    private boolean firstQuarter() {
        return point.getX() > 0 && point.getY() > 0;
    }

    private boolean secondQuarter() {
        return point.getX() < 0 && point.getY() > 0;
    }

    private boolean thirdQuarter() {
        return point.getX() < 0 && point.getY() < 0;
    }

    private boolean fourthQuarter() {
        return point.getX() > 0 && point.getY() < 0;
    }

    private boolean onMiddle() {
        return point.getX() == 0 && point.getY() == 0;
    }

    private boolean onX() {
        return point.getX() != 0 && point.getY() == 0;
    }

    private boolean onY() {
        return point.getX() == 0 && point.getY() != 0;
    }

}
