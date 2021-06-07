/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Sebastian Steele
 */
package org.example;
import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int largest_num=0;

        System.out.print("Enter the first number: ");
        Integer first = scan.nextInt();
        System.out.print("Enter the second number: ");
        Integer second = scan.nextInt();
        System.out.print("Enter the third number: ");
        Integer third = scan.nextInt();

        if(first > second && first> third) {
            largest_num = first;
            System.out.println("The largest number is" + largest_num);
        }
        else if(second > third) {
            largest_num = second;
            System.out.println("The largest number is" + largest_num);
        }
        else if(third > second) {
            largest_num = third;
            System.out.println("The largest number is" + largest_num);
        }
        else System.out.println("Your values may be equal");

    }
}
