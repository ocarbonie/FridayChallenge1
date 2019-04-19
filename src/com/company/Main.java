package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        int count = 0;
        int j;



        //Ask user input
        System.out.print("Give me a number and I will give you a list of prime numbers" +
                " up to that number: ");
        num = input.nextInt();

        //Loop will create my list
        for (int i = 1; i <= num; i++) {
            for (j = 1; j <= num; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
             if (count == 2) {
                System.out.println(i + " is a prime number");
            } else {
                System.out.println(i + " is not a prime number");
            }

            count = 0;

        }





        }
    }


