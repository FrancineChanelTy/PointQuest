package com.example.myapplication.quarter2.minipeta3;

import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class Ty_MiniPeta3 {

    @Test
    public void pointquest() {

       // staff creates quest

        String staffInput =
                "staff\n" +
                        "Clean in library\n" +
                        "Clean the library for 30 minutes\n";

        Scanner scanner = new Scanner(staffInput);

        System.out.println("===== STAFF =====");
        String role = scanner.nextLine();

        if (role.equalsIgnoreCase("staff")) {

            System.out.print("Enter quest name: ");
            String quest = scanner.nextLine();

            System.out.print("Enter quest description: ");
            String description = scanner.nextLine();

            System.out.println("\nQuest created!");
            System.out.println("Quest: " + quest);
            System.out.println("Description: " + description);
            System.out.println("Quest is now visible to students.");

            scanner.close();


            String studentInput = "student\nyes\n";

            scanner = new Scanner(studentInput);

            System.out.println("\n===== STUDENT =====");

            System.out.print("Enter role: ");
            String studentRole = scanner.nextLine();

            System.out.println("Available Quest: " + quest);
            System.out.println("Description: " + description);

            System.out.print("Complete quest? (yes/no): ");
            String answer = scanner.nextLine();

            int points = 0;

            if (studentRole.equalsIgnoreCase("student")
                    && answer.equalsIgnoreCase("yes")) {

                points = points + 1;

                System.out.println("\nQuest completed!");
                System.out.println("Student earned 1 point.");
                System.out.println("Total points: " + points);
            }

            scanner.close();

            assertEquals("staff", role);
            assertEquals("Clean in library", quest);
            assertEquals(
                    "Clean the library for 30 minutes",
                    description
            );

            assertEquals("student", studentRole);
            assertEquals("yes", answer);

            // 1 quest = 1 point
            assertEquals(1, points);

            System.out.println("\n===== QUEST COMPLETED =====");
            System.out.println("Student completed the quest.");
            System.out.println("Reward: 1 point.");
        }
    }
}