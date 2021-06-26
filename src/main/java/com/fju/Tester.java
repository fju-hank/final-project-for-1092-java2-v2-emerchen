package com.fju;

import java.sql.SQLOutput;
import java.util.Calendar;
import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        Calendar InTime = Calendar.getInstance();

//進場
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter plate number:");
        String PlateNumber = scan.next();
        Car car1 = new Car(PlateNumber, InTime.getTime());
        System.out.println("Welcome! " + PlateNumber + " Your Enter Time Is : " + InTime.getTime());


//出場
        System.out.println("Please enter your plate number: ");

    }
}
