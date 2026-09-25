package com.example.myapplication.quarter2.minipeta3;

import java.util.Scanner;
import org.junit.Test;

public class Gullaba_Minipeta3 {

    public static void main(String[] args) {
        new Gullaba_Minipeta3().Shop();
    }

    @Test
    public void Shop() {
        Scanner scanner = new Scanner (System.in);
        System.out.println("What would you want to buy?");
        String confirm = "";
        //categories
        if (scanner.hasNextLine()) {
            confirm = scanner.nextLine();
        }
        System.out.println("====================================");
        System.out.println("         broad section(2)           ");
        System.out.println("====================================");
        System.out.println("         sweet section(3)           ");
        System.out.println("====================================");
        System.out.println("         sour section(4)            ");
        System.out.println("====================================");
        System.out.println("         drink section(5)           ");
        System.out.println("====================================");
        System.out.println("         healthy section(6)         ");
        System.out.println("====================================");
        System.out.println("         dessert section(7)         ");
        System.out.println("====================================");
        if (scanner.hasNextLine()) {
            confirm = scanner.nextLine();
        }

        if (confirm.equalsIgnoreCase("2")) {
            System.out.println("Welcome to broad section!");
        } else if (confirm.equalsIgnoreCase("3")) {
            System.out.println("Welcome to sweet section!");
        } else if (confirm.equalsIgnoreCase("4")) {
            System.out.println("Welcome to sour section!");
        } else if (confirm.equalsIgnoreCase("5")) {
            System.out.println("Welcome to drink section!");
        } else if (confirm.equalsIgnoreCase("6")) {
            System.out.println("Welcome to healthy section!");
        } else if (confirm.equalsIgnoreCase("7")) {
            System.out.println("Welcome to dessert section!");
            if (scanner.hasNextLine()) {
                confirm = scanner.nextLine();
            }
        }

        //broad section
        System.out.println("====================================");
        System.out.println("              cookie(8)             ");
        System.out.println("====================================");
        System.out.println("              bread(9)              ");
        System.out.println("====================================");
        System.out.println("              candy(10)             ");
        System.out.println("====================================");
        System.out.println("             lemonade(11)           ");
        System.out.println("====================================");
        System.out.println("             pillows(12)            ");
        System.out.println("====================================");
        System.out.println("              water(13)             ");
        System.out.println("====================================");
        if (scanner.hasNextLine()) {
            confirm = scanner.nextLine();
        }




        // The availabilty
        for (int shoplist = 100; shoplist >= 1; shoplist--) {
            System.out.println("Still available " + shoplist + " left");
            if (shoplist == 10) {
                System.out.println("Almost out of stocks");
            } else if  (shoplist == 1) {
                System.out.println("Theres only one left.");
            } else if (shoplist == 0) {
                System.out.println("You are out of item");
                System.out.println("Wait for the restocks");
            } else {
                System.out.println("Confirm? yes(0) or no(1)");

               if (scanner.hasNextLine()) {
                confirm = scanner.nextLine();
            } else {
                break;
            }

            // confirmation
            while (!confirm.equalsIgnoreCase("0") && !confirm.equalsIgnoreCase("1")) {
                System.out.println("Confirm? (yes(0) or no(1))");
                if (scanner.hasNextLine()) {
                    confirm = scanner.nextLine();
                } else {
                    break;
                }
                }

                if (!confirm.equalsIgnoreCase("0") && !confirm.equalsIgnoreCase("1")) {
                    System.out.println("Theres no option for that.");
                }
            }

            if (confirm.equalsIgnoreCase("1")) {
                System.out.println("Have a nice day!");
                break;
            } else if (confirm.equalsIgnoreCase("0")) {
                System.out.println("Purchase Confirm");
            }

        }
    }
}
