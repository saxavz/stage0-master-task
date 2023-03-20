package com.epam.loops;

import java.util.Scanner;

public class MultiplicationTable {

    public void printTable(int numberTableToPrint) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter number for multiplication table: ");
//        int num = Integer.valueOf(scanner.nextLine());
        for(int m = 1; m <= 10; m++){
            //10 x 2 = 20
            System.out.println(m + " x " + numberTableToPrint + " = " + m *numberTableToPrint);
        }
    }

}
