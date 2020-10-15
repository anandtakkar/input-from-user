package com.assignment3;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {

            avengers[] a = new avengers[3];

            for (int i = 0; i < 2; i++) {
                a[i] = new avengers();
                System.out.println("Avenger number" + i);
                a[i].getDetails();
                System.out.println("\n");
            }
            for (int i = 0; i < 2; i++) {
                a[i].displayDetails();
            }

        }
        }

