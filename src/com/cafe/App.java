package com.cafe;
import java.util.List;
import java.util.Scanner;

import com.cafe.dao.cafeDaoimp;
import com.cafe.pojo.cafe;

public class App {

    public static void main(String[] args) {

        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

        cafeDaoimp cafe = new cafeDaoimp();

        int ch;

        do {

            System.out.println("**** Cafe Management System ****");
            System.out.println("1. Add item");
            System.out.println("2. Read All items");
            System.out.println("3. Update item Details");
            System.out.println("4. Delete item");
            System.out.println("5. Exit");

            System.out.println("Enter choice:");
            ch = sc.nextInt();

            switch (ch) {

            
            case 1:

                System.out.println("Enter item Name:");
                String name = sc.next();

                System.out.println("Enter item Price:");
                double price = sc.nextDouble();

                System.out.println("Enter item Quantity:");
                int quantity = sc.nextInt();

                System.out.println("Enter item Category:");
                String category = sc.next();

                cafe item = new cafe(name, price, quantity, category);
                System.out.println("---------------------------------------");
                cafe.addcafe(item);
                
                System.out.println("Total="+ quantity*price);
                System.out.println("---------------------------------------");
                break;


            
            case 2:

                List<cafe> cafes = cafe.getAllCafe();

                for (cafe c : cafes) {

                    System.out.println(c);

                }

                break;


            
            case 3:

                System.out.println("Enter item Id:");
                int id = sc.nextInt();

                System.out.println("Enter new item Name:");
                String uname = sc.next();

                System.out.println("Enter new Price:");
                double uprice = sc.nextDouble();

                System.out.println("Enter new Quantity:");
                int uquantity = sc.nextInt();

                System.out.println("Enter new Category:");
                String ucategory = sc.next();

                cafe updatedCafe =
                        new cafe(id, uname, uprice, uquantity, ucategory);
                System.out.println("---------------------------------------");
                cafe.updateCafe(updatedCafe);
               
                System.out.println("Total="+ uquantity*uprice);
                System.out.println("---------------------------------------");
                break;


            
            case 4:

                System.out.println("Enter Cafe Id which you want to delete:");

                int deletedId = sc.nextInt();

                cafe.deleteCafe(deletedId);

                break;


            
            case 5:

                System.out.println("Exit");

                break;


            default:

                System.out.println("Wrong choice.........");
            }

        } while (ch != 5);

    }
}
