package com.cafe;

import java.util.List;
import java.util.Scanner;

import com.cafe.dao.cafeDaoimp;
import com.cafe.pojo.cafe;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        cafeDaoimp cafe = new cafeDaoimp();

        int ch;

        System.out.println("---------------------------------------");
        System.out.println("       WELCOME TO OUR CAFE!");
        System.out.println("   Fresh Taste, Happy Moments!");
        System.out.println("---------------------------------------");

        do {

            System.out.println("\n******** CAFE MANAGEMENT SYSTEM ********");
            System.out.println("1. Add Item");
            System.out.println("2. Read All Items");
            System.out.println("3. Update Item Details");
            System.out.println("4. Delete Item");
            System.out.println("5. Exit");
            System.out.println("---------------------------------------");

            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

            switch (ch) {

            case 1:

                System.out.println("\n---------- ADD CAFE ITEM ----------");

                System.out.print("Enter item Name: ");
                String name = sc.next();

                System.out.print("Enter item Price: ");
                double price = sc.nextDouble();

                System.out.print("Enter item Quantity: ");
                int quantity = sc.nextInt();

                System.out.print("Enter item Category: ");
                String category = sc.next();

                cafe item = new cafe(name, price, quantity, category);

                System.out.println("---------------------------------------");

                cafe.addcafe(item);

                System.out.println("Item Total Value = ₹" + (quantity * price));

                System.out.println("Item added successfully!");
                System.out.println("---------------------------------------");

                break;

            case 2:

                System.out.println("\n---------- CAFE MENU ----------");

                List<cafe> cafes = cafe.getAllCafe();

                if (cafes == null || cafes.isEmpty()) {

                    System.out.println("No cafe items available.");

                } else {

                    for (cafe c : cafes) {
                        System.out.println(c);
                    }

                }

                System.out.println("---------------------------------------");

                break;

            case 3:

                System.out.println("\n---------- UPDATE CAFE ITEM ----------");

                System.out.print("Enter item Id: ");
                int id = sc.nextInt();

                System.out.print("Enter new item Name: ");
                String uname = sc.next();

                System.out.print("Enter new Price: ");
                double uprice = sc.nextDouble();

                System.out.print("Enter new Quantity: ");
                int uquantity = sc.nextInt();

                System.out.print("Enter new Category: ");
                String ucategory = sc.next();

                cafe updatedCafe =
                        new cafe(id, uname, uprice, uquantity, ucategory);

                System.out.println("---------------------------------------");

                cafe.updateCafe(updatedCafe);

                System.out.println("Updated Item Total Value = ₹"
                        + (uquantity * uprice));

                System.out.println("Update operation completed.");
                System.out.println("---------------------------------------");

                break;

            case 4:

                System.out.println("\n---------- DELETE CAFE ITEM ----------");

                System.out.print("Enter Cafe Id which you want to delete: ");
                int deletedId = sc.nextInt();

                cafe.deleteCafe(deletedId);

                System.out.println("---------------------------------------");

                break;

            case 5:

                System.out.println("\n========================================");
                System.out.println("       THANK YOU FOR VISITING!");
                System.out.println("          VISIT US AGAIN!");
                System.out.println("========================================");
                System.out.println("   We hope you have a wonderful day!");
                System.out.println("");

                break;

            default:

                System.out.println("Invalid choice! Please try again.");

            }

        } while (ch != 5);

        sc.close();

    }
}
