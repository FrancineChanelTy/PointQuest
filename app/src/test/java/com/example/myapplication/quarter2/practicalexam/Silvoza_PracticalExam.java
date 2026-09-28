package com.example.myapplication.quarter2.practicalexam;

import java.util.Scanner;

public class Silvoza_PracticalExam {

    public void start(Scanner scanner) {

        boolean running = true;

        while (running) {

            // MENU
            System.out.println("\n===== LIBRARY KIOSK =====");
            System.out.println("1. Borrow Book");
            System.out.println("2. Pay Fines");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\n--- BORROW BOOK ---");

                    System.out.print("Enter number of books: ");
                    int books = scanner.nextInt();

                    double feePerBook = 5.00;
                    double total = books * feePerBook;

                    System.out.println("Books borrowed: " + books);
                    System.out.println("Total fee: " + total);

                    break;

                case 2:
                    System.out.println("\n--- PAY FINES ---");

                    double fine = 15.00;

                    System.out.println("Current fine: " + fine);
                    System.out.print("Enter payment: ");

                    double payment = scanner.nextDouble();

                    if (payment < fine) {

                        double remaining = fine - payment;

                        System.out.println("Insufficient payment.");
                        System.out.println("Remaining fine: " + remaining);

                    } else {

                        double change = payment - fine;

                        System.out.println("Payment accepted.");
                        System.out.println("Change: " + change);
                    }

                    break;

                case 3:
                    System.out.println("\nThank you for using the Library Kiosk!");
                    running = false;
            }
        }
    }
}
