package com.jspider.main;

import com.jspider.users.AdminServiceImpl;

import java.util.*;
import java.util.Scanner;

public class TicketPlusApplication {
   static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println();
        System.out.println("=======WELCOME TO TICKETPLUS======");

        System.out.println("Select User Type");
        System.out.println("1. Admin \n"+"2. Customer \n"+ "Any key for Exit \n");
        Integer user = scanner.nextInt();
        switch (user)
        {
            case 1 : System.out.println("ADMIN");
                     AdminServiceImpl adminService = new AdminServiceImpl();

                     System.out.println("1. ADD MOVIE \n"+"2. CREATE SHOW \n"+ "Any key for Exit \n");
                     Integer adminOptns = scanner.nextInt();
                     switch (adminOptns)
                     {
                         case 1 : System.out.println("Add Movie");
                                  adminService.createMovie();
                         break;
                         case 2 : System.out.println("Add Show");
                         break;
                         default: System.exit(0);
                     }















                     break;
            case 2 : System.out.println("CUSTOMER");
                     break;
            default: System.exit(0);
        }

        System.out.println("=======Thanks visit again======");
    }
}
