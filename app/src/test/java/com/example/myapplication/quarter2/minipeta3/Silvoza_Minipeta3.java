package com.example.myapplication.quarter2.minipeta3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Silvoza_Minipeta3 {

    // Store usernames and passwords
    static Map<String, String> users = new HashMap<>();

    // Store user roles
    static Map<String, String> roles = new HashMap<>();

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Sample accounts
        users.put("student", "1234");
        roles.put("student", "CLASS");

        users.put("staff", "1234");
        roles.put("staff", "STAFF");

        users.put("admin", "admin123");
        roles.put("admin", "ADMIN");

        boolean running = true;

        System.out.println("=================================");
        System.out.println("       SCHOOL LOGIN SYSTEM");
        System.out.println("=================================");

        while (running) {

            System.out.println("\nMain Menu");
            System.out.println("1. Login");
            System.out.println("2. Google Login");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            String choice = scanner.nextLine();

            switch (choice) {

                case "1":
                    login();
                    break;

                case "2":
                    googleLogin();
                    break;

                case "3":
                    running = false;
                    System.out.println("Program closed. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }

    // Username and password login
    public static void login() {

        System.out.println("\n===== LOGIN =====");

        System.out.print("Username: ");
        String username = scanner.nextLine();

        System.out.print("Password: ");
        String password = scanner.nextLine();

        if (users.containsKey(username)
                && users.get(username).equals(password)) {

            String role = roles.get(username);

            System.out.println("\nLogin successful!");
            System.out.println("Welcome, " + username);
            System.out.println("Role: " + role);

            userMenu(username, role);

        } else {
            System.out.println("Invalid username or password.");
        }
    }

    // Google login
    public static void googleLogin() {

        System.out.println("\n===== GOOGLE LOGIN =====");

        System.out.print("Enter Google email: ");
        String email = scanner.nextLine();

        if (email.endsWith("@gmail.com")) {

            System.out.println("\nGoogle login successful!");
            System.out.println("Welcome, " + email);

            // Google users are treated as CLASS users
            userMenu(email, "CLASS");

        } else {
            System.out.println("Invalid Google email.");
        }
    }

    // Menu after login
    public static void userMenu(String username, String role) {

        boolean loggedIn = true;

        while (loggedIn) {

            System.out.println("\n=================================");
            System.out.println("Logged in as: " + username);
            System.out.println("Role: " + role);
            System.out.println("=================================");

            if (role.equals("ADMIN")) {

                System.out.println("1. Admin Dashboard");
                System.out.println("2. Manage Users");
                System.out.println("3. Logout");

                System.out.print("Choose an option: ");
                String choice = scanner.nextLine();

                switch (choice) {

                    case "1":
                        System.out.println("Welcome to Admin Dashboard.");
                        break;

                    case "2":
                        System.out.println("User management opened.");
                        break;

                    case "3":
                        logout(username);
                        loggedIn = false;
                        break;

                    default:
                        System.out.println("Invalid choice.");
                }

            } else if (role.equals("STAFF")) {

                System.out.println("1. Staff Dashboard");
                System.out.println("2. View Classes");
                System.out.println("3. Logout");

                System.out.print("Choose an option: ");
                String choice = scanner.nextLine();

                switch (choice) {

                    case "1":
                        System.out.println("Welcome to Staff Dashboard.");
                        break;

                    case "2":
                        System.out.println("Class list opened.");
                        break;

                    case "3":
                        logout(username);
                        loggedIn = false;
                        break;

                    default:
                        System.out.println("Invalid choice.");
                }

            } else if (role.equals("CLASS")) {

                System.out.println("1. Class Dashboard");
                System.out.println("2. View Grades");
                System.out.println("3. Logout");

                System.out.print("Choose an option: ");
                String choice = scanner.nextLine();

                switch (choice) {

                    case "1":
                        System.out.println("Welcome to Class Dashboard.");
                        break;

                    case "2":
                        System.out.println("Grades opened.");
                        break;

                    case "3":
                        logout(username);
                        loggedIn = false;
                        break;

                    default:
                        System.out.println("Invalid choice.");
                }

            } else {
                System.out.println("Unknown user role.");
                loggedIn = false;
            }
        }
    }

    // Logout / Signout
    public static void logout(String username) {

        System.out.println("\nSigning out " + username + "...");
        System.out.println("Logout successful!");
        System.out.println("You have been signed out.");
    }
}
