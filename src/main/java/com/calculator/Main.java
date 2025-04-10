package com.calculator;

import java.util.Scanner;

/**
 * Main application class to demonstrate the Calculator functionality.
 */
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Simple Calculator Application");
        System.out.println("============================");
        
        boolean running = true;
        
        while (running) {
            System.out.println("\nSelect operation:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Enter choice (1-5): ");
            
            int choice;
            try {
                choice = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Clear the input buffer
                continue;
            }
            
            if (choice == 5) {
                running = false;
                System.out.println("Exiting the calculator. Goodbye!");
                continue;
            }
            
            if (choice < 1 || choice > 4) {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }
            
            System.out.print("Enter first number: ");
            double num1;
            try {
                num1 = scanner.nextDouble();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Clear the input buffer
                continue;
            }
            
            System.out.print("Enter second number: ");
            double num2;
            try {
                num2 = scanner.nextDouble();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Clear the input buffer
                continue;
            }
            
            double result = 0;
            String operation = "";
            
            try {
                switch (choice) {
                    case 1:
                        result = calculator.add(num1, num2);
                        operation = "+";
                        break;
                    case 2:
                        result = calculator.subtract(num1, num2);
                        operation = "-";
                        break;
                    case 3:
                        result = calculator.multiply(num1, num2);
                        operation = "*";
                        break;
                    case 4:
                        result = calculator.divide(num1, num2);
                        operation = "/";
                        break;
                }
                System.out.printf("%.2f %s %.2f = %.2f%n", num1, operation, num2, result);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        
        scanner.close();
    }
}
