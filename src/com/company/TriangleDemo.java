package com.company;

import java.util.Scanner;

public class TriangleDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base, height, area;

        System.out.print("Enter base: ");
        base = input.nextFloat();

        System.out.print("Enter height: ");
        height = input.nextFloat();

        area = 0.5 * base * height;
        System.out.println("The area of triangle = "+area);
    }
}
