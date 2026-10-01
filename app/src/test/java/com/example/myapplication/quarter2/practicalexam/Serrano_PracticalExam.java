package com.example.myapplication.quarter2.practicalexam;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Serrano_PracticalExam {

    public static void main(String[] args) {

        // Create members database
        Map<String, Map<String, Object>> members = new HashMap<>();

        Map<String, Object> member1 = new HashMap<>();
        member1.put("name", "John");
        member1.put("active", true);
        members.put("GYM001", member1);

        Map<String, Object> member2 = new HashMap<>();
        member2.put("name", "Maria");
        member2.put("active", true);
        members.put("GYM002", member2);

        Map<String, Object> member3 = new HashMap<>();
        member3.put("name", "Alex");
        member3.put("active", false);
        members.put("GYM003", member3);

        // Display system title
        System.out.println("================================");
        System.out.println("       GYM ACCESS SYSTEM");
        System.out.println("================================");

        // Get member ID
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Member ID: ");
        String memberId = scanner.nextLine().trim().toUpperCase();

        // Check member ID
        if (members.containsKey(memberId)) {

            Map<String, Object> member = members.get(memberId);

            String name = (String) member.get("name");
            boolean active = (boolean) member.get("active");

            // Check membership status
            if (active) {
                System.out.println("\nACCESS GRANTED");
                System.out.println("Welcome, " + name + "!");
            } else {
                System.out.println("\nACCESS DENIED");
                System.out.println("Membership is inactive.");
            }

        } else {
            System.out.println("\nACCESS DENIED");
            System.out.println("Member ID not found.");
        }

        System.out.println("\nThank you for using the Gym Access System.");

        scanner.close();
    }
}
