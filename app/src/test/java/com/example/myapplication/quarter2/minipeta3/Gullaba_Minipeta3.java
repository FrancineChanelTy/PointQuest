package com.example.myapplication.quarter2.minipeta3;

import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class Gullaba_Minipeta3 {
    @Test
    public void testShoplist() {
        shoplist();
    }
    public static void shoplist() {

        Scanner scanner = new Scanner (System.in);
        int shoplist = 100;
        System.out.println("What would you want to buy?");

        String confirm = "";
        //categories
        while (true) {
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
            confirm = scanner.nextLine();

            switch (confirm) {
                case "2":
                    System.out.println("Welcome to broad section!");

                    // Broad section
                    System.out.println("====================================");
                    System.out.println("              cookie(1)             ");
                    System.out.println("====================================");
                    System.out.println("              bread(2)              ");
                    System.out.println("====================================");
                    System.out.println("              candy(3)             ");
                    System.out.println("====================================");
                    System.out.println("             lemonade(4)           ");
                    System.out.println("====================================");
                    System.out.println("             pillows(5)            ");
                    System.out.println("====================================");
                    System.out.println("              water(6)             ");
                    System.out.println("====================================");
                    confirm = scanner.nextLine();
                    break;

                case "3":
                    System.out.println("Welcome to sweet section!");

                    //Sweet section
                    System.out.println("====================================");
                    System.out.println("    Chocolate Chip Cookies(1)      ");
                    System.out.println("====================================");
                    System.out.println("         Gummy bears(2)            ");
                    System.out.println("====================================");
                    System.out.println("           Brownies(3)             ");
                    System.out.println("====================================");
                    System.out.println("            Lolipop(4)             ");
                    System.out.println("====================================");
                    System.out.println("            Macarons(5)            ");
                    System.out.println("====================================");
                    System.out.println("              Caramel(6)           ");
                    System.out.println("====================================");
                    confirm = scanner.nextLine();
                    break;

                case "4":
                    System.out.println("Welcome to sour section!");

                    //Sour section
                    System.out.println("====================================");
                    System.out.println("         Sour Patch Kids(1)        ");
                    System.out.println("====================================");
                    System.out.println("          Skittles Sour(2)         ");
                    System.out.println("====================================");
                    System.out.println("      Warheads Extreme Sour(3)     ");
                    System.out.println("====================================");
                    System.out.println("         Sour Punch Straws(4)      ");
                    System.out.println("====================================");
                    System.out.println("   Trolli Sour Brite Crawlers(5)   ");
                    System.out.println("====================================");
                    System.out.println("          Toxic Waste(6)           ");
                    System.out.println("====================================");
                    confirm = scanner.nextLine();
                    break;

                case "5":
                    System.out.println("Welcome to drink section!");

                    //Drink section
                    System.out.println("====================================");
                    System.out.println("            Lemonade(1)            ");
                    System.out.println("====================================");
                    System.out.println("             Water(2)              ");
                    System.out.println("====================================");
                    System.out.println("             Coffee(3)             ");
                    System.out.println("====================================");
                    System.out.println("              Soda(4)              ");
                    System.out.println("====================================");
                    System.out.println("              Milk(5)              ");
                    System.out.println("====================================");
                    System.out.println("             Juice(6)              ");
                    System.out.println("====================================");
                    confirm = scanner.nextLine();
                    break;

                case "6":
                    System.out.println("Welcome to healthy section!");

                    //Healthy section
                    System.out.println("====================================");
                    System.out.println("          Quinoa Base(1)           ");
                    System.out.println("====================================");
                    System.out.println("     Roasted Sweet Potatoes(2)     ");
                    System.out.println("====================================");
                    System.out.println("        Pan-Seared Salmon(3)       ");
                    System.out.println("====================================");
                    System.out.println("         Steamed Edamame(4)        ");
                    System.out.println("====================================");
                    System.out.println("      ahini Garlic Drizzle(5)      ");
                    System.out.println("====================================");
                    System.out.println("              Apple(6)           ");
                    System.out.println("====================================");
                    confirm = scanner.nextLine();
                    break;

                case "7":
                    System.out.println("Welcome to dessert section!");

                    //Dessert section
                    System.out.println("====================================");
                    System.out.println("         Sliced Cakes(1)           ");
                    System.out.println("====================================");
                    System.out.println("         Chocolate Cake(2)         ");
                    System.out.println("====================================");
                    System.out.println("          Lemon Tart(3)            ");
                    System.out.println("====================================");
                    System.out.println("          Dark Chocolate(4)        ");
                    System.out.println("====================================");
                    System.out.println("       Mexican Brownies(5)         ");
                    System.out.println("====================================");
                    System.out.println("         Berry Sorbet(6)           ");
                    System.out.println("====================================");
                    confirm = scanner.nextLine();
                    break;

                default: System.out.println("Invalid section selected.");
            }
            while (true) {
                System.out.println("\nStill available: " + shoplist + " left");

                if (shoplist == 10) {
                    System.out.println("Almost out of stocks");
                } else if (shoplist == 1) {
                    System.out.println("There's only one left.");
                } else if (shoplist <= 0) {
                    System.out.println("You are out of items! Wait for the restocks.");
                    break;
                }

                System.out.println("Confirm? yes(0), exit(1), or return to sections(2)");
                confirm = scanner.nextLine();

                // Input validation loop
                while (!confirm.equals("0") && !confirm.equals("1") && !confirm.equals("2")) {
                    System.out.println("There's no option for that. Confirm? (yes(0), no(1), or return to sections(2))");
                    confirm = scanner.nextLine();
                }

                // Process choice
                if (confirm.equals("2")) {
                    System.out.println("Progress saved. Returning to the main sections menu...");
                    break; // Breaks out of checkout, returning you to the sections loop
                } else if (confirm.equals("1")) {
                    System.out.println("Have a nice day!");
                    return;
                } else if (confirm.equals("0")) {
                    System.out.println("Purchase Confirm!");
                    shoplist--; // Progress saved by subtracting inventory
                }
            }
        }
    }

}
