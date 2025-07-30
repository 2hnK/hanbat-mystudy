package org.example.myapp;

import java.util.Scanner;

/**
 * This is a simple Java application that prompts the user for their name
 * and greets them.
 *
 * @author 2hnK
 */
public class App {
    /*
     * This is a simple Java application that prompts the user for their name
     */

    public static void main(String[] args) { // entry point
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name + "!");
        sc.close();
    }
}