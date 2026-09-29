package com.example.myapplication.quarter2.practicalexam;
import java.util.Scanner;
public class CinemaTicketingTest {
    public void testCinemaFlow() {
        Scanner scanner = new Scanner(System.in);
        // Ask the user to choose an option first
        System.out.println("=== CINEMA MENU ===");
        System.out.println("1. Buy Ticket");
        System.out.println("2. Snacks"); //step 3
        int ticketChoice = scanner.nextInt();
        // Only ask for age
        if (ticketChoice == 1) { //step 1
            System.out.print("Enter age: ");
            int age = scanner.nextInt();
            if (age < 18) {
                System.out.println("Access Denied");
            } else { //step 2
                System.out.println("Ticket Printed")
            }
        } if else {
            System.out.println("Would you want to buy snack?");
            if ()
        }
        scanner.close();
    }
    public static void main(String[] args) {
        CinemaTicketingTest test = new CinemaTicketingTest();
        test.testCinemaFlow();
    }
}