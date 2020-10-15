package com.assignment3;

import java.util.Scanner;

public class avengers
    {

        String name;
        int age;
        String power;
        String weapon;
        String planet;
        Scanner sc=new Scanner(System.in);

        void getDetails()
        {
            System.out.println("Enter the name:");
            name=sc.nextLine();

            System.out.println("Enter the age:");
            age=sc.nextInt();

            sc.nextLine();

            System.out.println("Enter the power:");
            power=sc.nextLine();

            System.out.println("Enter the weapon:");
            weapon=sc.nextLine();

            System.out.println("Enter the planet:");
            planet=sc.nextLine();
        }

        void displayDetails()
        {
            System.out.println("Enter the name:"+ name);
            System.out.println("Enter the age:"+age);
            System.out.println("Enter the power:"+power);
            System.out.println("Enter the weapon:"+weapon);
            System.out.println("Enter the planet:"+planet);
        }

    }
