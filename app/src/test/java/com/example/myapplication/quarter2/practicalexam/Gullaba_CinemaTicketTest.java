package com.example.myapplication.quarter2.practicalexam;
import java.util.Scanner;
import org.junit,Test;
public class CinemaTicketingTest {
    @Test
    public void testCinemaFlow() {
        Scanner scanner = new Scanner(System.in);
        // Ask the user to choose an option first
        System.out.println("=== CINEMA MENU ===");
        System.out.println("1. Buy Ticket");
        System.out.println("2. Snacks");
        int ticketChoice = scanner.nextInt();
        // Step 1: Buy Ticket
        if (ticketChoice == 1) {
            System.out.print("Enter age: ");
            int age = scanner.nextInt();
            if (age < 18) {
                System.out.println("Access Denied");
            } else {
                // Step 2: Allow legal-age customers to buy a ticket
                System.out.println("Ticket Printed");
            }
            // Step 3: Buy Snacks
        } else if (ticketChoice == 2) {
            System.out.print("Would you want to buy snacks? (yes/no): ");
            String snackChoice = scanner.next();
            if (snackChoice.equalsIgnoreCase("yes")) {
                System.out.println("Snacks purchased successfully.");
            } else if (snackChoice.equalsIgnoreCase("no")) {
                System.out.println("No snacks purchased.");
            } else {
                System.out.println("Invalid snack choice.");
            }
        } else {
            System.out.println("Invalid choice.");
        }
        scanner.close();
    }
    public static void main(String[] args) {
        CinemaTicketingTest test = new CinemaTicketingTest();
        test.testCinemaFlow();
    }
}