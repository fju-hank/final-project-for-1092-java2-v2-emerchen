
package com.fju;

import java.sql.SQLOutput;
import java.sql.Time;
import java.util.*;

public class Tester {

    public static void main(String[] args) {

        Calendar Time = Calendar.getInstance();
        Car c1 = new Car(null,Time.getTime());
        Car c2 = new Car(null,Time.getTime());
        Car c3 = new Car(null,Time.getTime());
        Car c4 = new Car(null,Time.getTime());
        Car c5 = new Car(null,Time.getTime());
        int j = 1;

        for (int i = 0; i > -1; i++) {

            System.out.println("\nPlease enter plate number to park or enter [pay] to pay");
            Scanner scanner = new Scanner(System.in);
            String plateIn = scanner.next();

            if (plateIn.equals("pay") == false) {
//IN
                System.out.println(j);
                System.out.println("\nWelcome! " + plateIn + "\nYour Enter Time Is : " + Time.getTime());
                switch (j){
                    case 1 : c1.plate = plateIn; break;
                    case 2 : c2.plate = plateIn; break;
                    case 3 : c3.plate = plateIn; break;
                    case 4 : c4.plate = plateIn; break;
                    case 5 : c5.plate = plateIn; break;
                } j = j+1;
            } else {
//PAY
                System.out.println("Please enter your plate number to pay: ");
                String PlateOut = scanner.next();

                if (PlateOut.equals(c1.plate) == false) {
                    System.out.println("Sorry there's no this car");
                } else {
                    Date now = new Date();
                    long time = (now.getTime() - c1.entertime.getTime()) / 1000 / 60 / 60;
                    int fee = (int) (time * 30);
                    System.out.println(PlateOut + "   Total :" + fee + " dollars");
                }
            }
        }
    }
}
