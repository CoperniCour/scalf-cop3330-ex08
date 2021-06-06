/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Courtney Scalf-Crickenberger
 */

//Exercise 8 - Pizza Party

package org.example;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner getnum = new Scanner(System.in);
        System.out.print("How many people? ");
        int ppl = getnum.nextInt();

        System.out.print("How many pizzas do you have? ");
        int pizzas = getnum.nextInt();

        System.out.print("How many slices per pizza? ");
        int slices = getnum.nextInt();

        int slice_total = pizzas*slices;
        int slices_each = slice_total / ppl;
        int remainder = slice_total % ppl;

        //Print out
        System.out.println(String.format("%d people with %d pizzas (%d slices)", ppl, pizzas, slice_total));
        System.out.println(String.format("Each person gets %d pieces of pizza.", slices_each));
        System.out.println(String.format("There are %d leftover pieces.", remainder));

    }
}
