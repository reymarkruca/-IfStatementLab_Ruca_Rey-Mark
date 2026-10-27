/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab_1;

import java.util.Scanner;

/**
 *
 * @author Rey Mark S. Ruca
 */
public class Lab_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Problem 1 - Age Category Checker
        System.out.println("AGE CATEGORY CHECKER");
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        if (age < 13) {
            System.out.println("You are a child.");
        } else if (age <= 19) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are an adult.");
        }

        // Problem 2 - Temperature Evaluator
        System.out.println("TEMPERATURE EVALUATOR");
        System.out.print("Enter temperature in Celsius: ");
        double temp = input.nextDouble();

        if (temp < 0) {
            System.out.println("Freezing point.");
        } else if (temp <= 25) {
            System.out.println("Normal weather.");
        } else {
            System.out.println("Hot weather.");
        }

        // Problem 3 - Grade Evaluator
        System.out.println("GRADE EVALUATOR");
        System.out.print("Enter your test score: ");
        int score = input.nextInt();

        if (score >= 90) {
            System.out.println("Excellent");
        } else if (score >= 75) {
            System.out.println("Good");
        } else {
            System.out.println("Needs Improvement");
        }

        // Problem 4 - Circle Calculator
        System.out.println("CIRCLE CALCULATOR");
        System.out.print("Enter the radius: ");
        double radius = input.nextDouble();

        if (radius <= 0) {
            System.out.println("Invalid radius.");
        } else {
            double area = Math.PI * radius * radius;
            double circumference = 2 * Math.PI * radius;

            System.out.printf("Area: %.2f%n", area);
            System.out.printf("Circumference: %.2f%n", circumference);
        }

        // Problem 5 - Even or Odd
        System.out.println("EVEN OR ODD");
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is an Even number.");
        } else {
            System.out.println(number + " is an Odd number.");
        }
    }
}
