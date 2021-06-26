package com.fju;

import java.sql.SQLOutput;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {

        Calendar Time = Calendar.getInstance();
        System.out.println("Please enter plate number or enter [pay] to pay");
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        Car c1 = new Car(s, Time.getTime());

        if (s.equals("pay")) {
//出場
            System.out.println("Please enter your plate number to pay: ");
            String PlateNumberOut = scan.next();
            System.out.println(PlateNumberOut + " Total :");


//時間計算
            Date now = new Date();
            long time = (System.currentTimeMillis() - c1.entertime.getTime()) / 1000 / 60;
            System.out.println(time);
        } else {
//入場
            System.out.println("Welcome! " + s + "\nYour Enter Time Is : " + Time.getTime());

        }
    }
}