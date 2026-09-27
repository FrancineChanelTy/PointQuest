package com.example.myapplication.quarter2.practicalexam;

import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class FastFoodTest {

    @Test
    public void testFastFoodFlow() {

        StringBuilder automatedInput = new StringBuilder();

        System.out.println("--- GENERATING FAST FOOD TEST DATA ---");

        // Step 1: Order Burger as Combo (Nested option 1)
        automatedInput.append("1\n"); // Choose Order Burger
        automatedInput.append("1\n"); // Choose Combo upgrade

        // Step 2: Order Burger as Solo (Nested option 2)
        automatedInput.append("1\n"); // Choose Order Burger
        automatedInput.append("2\n"); // Choose Solo

        // Step 3: Order Fries option
        automatedInput.append("2\n"); // Choose Order Fries

        // Step 4: Exit system
        automatedInput.append("3\n"); // Choose Exit

        System.out.println("--- TEST DATA GENERATION COMPLETE ---\n");


        ByteArrayInputStream inputStream = new ByteArrayInputStream(automatedInput.toString().getBytes());
        Scanner scanner = new Scanner(inputStream);

        FastFoodTest fastFoodSystem = new FastFoodTest();
        fastFoodSystem.start(scanner);

        boolean running = true;

        while (running) {
            System.out.println("\n--- FAST FOOD MENU ---");
            System.out.println("1. Burger");
            System.out.println("2. Fries");
            System.out.println("3. Exit");

            String choice = scanner.nextLine();

            switch (choice) {

                case "1":
                    System.out.println("You selected Burger.");

                    System.out.println("Choose Burger option:");
                    System.out.println("1. Combo");
                    System.out.println("2. Solo");

                    String burgerChoice = scanner.nextLine();

                    switch (burgerChoice) {

                        case "1":
                            System.out.println("You selected Burger Combo.");
                            break;

                        case "2":
                            System.out.println("You selected Burger Solo.");
                            break;

                        default:
                            System.out.println("Invalid burger option.");
                            break;
                    }

                    break;

                case "2":
                    System.out.println("You selected Fries.");
                    break;

                case "3":
                    System.out.println("Exiting Fast Food Menu...");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice.");
                    break;
            }

        }
    }