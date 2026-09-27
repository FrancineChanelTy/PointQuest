package com.example.myapplication.quarter2.practicalexam;

import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class FastFoodTest {

    @Test
    public void testFastFoodFlow() {

        StringBuilder automatedInput = new StringBuilder();

        System.out.println("--- GENERATING FAST FOOD TEST DATA ---");

        // Repeat the ordering process
        automatedInput.append("1\n"); // choose burger
        automatedInput.append("1\n"); // choose combo

        automatedInput.append("1\n"); // choose burger
        automatedInput.append("2\n"); // choose solo

        automatedInput.append("2\n"); // choose fries

        automatedInput.append("3\n"); // choose exit

        System.out.println("--- TEST DATA GENERATION COMPLETE ---\n");

        boolean running = true;

        while (running) {
            System.out.println("\n--- FAST FOOD MENU ---");
            System.out.println("1. Burger");
            System.out.println("2. Fries");
            System.out.println("3. Exit");
        }

        ByteArrayInputStream inputStream = new ByteArrayInputStream(automatedInput.toString().getBytes());
        Scanner scanner = new Scanner(inputStream);

        FastFoodMenu fastFoodSystem = new FastFoodMenu();
        fastFoodSystem.start(scanner);

        }
    }