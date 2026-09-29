package com.example.myapplication.quarter2.practicalexam;
import java.util.Scanner;
public class Gullaba_CinemaTicketingTest {
    public void testCinemaFlow() {
        Scanner scanner = new Scanner(System.in);
        // Step 1: Ask the user to choose an option first
        System.out.println("=== CINEMA MENU ===");
        System.out.println("1. Buy Ticket");
        int ticketChoice = scanner.nextInt();
        // Only ask for age after Buy Ticket is selected
        if (ticketChoice == 1) { // step 1
            System.out.print("Enter age: ");
            int age = scanner.nextInt();
            if (age < 18) {
                System.out.println("Access Denied");
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