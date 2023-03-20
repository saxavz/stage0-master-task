package com.epam.loops;

public class Power {

    public void printPower(int numberToPrint, int power) {
        if(power == 0){
            System.out.println(1);
            return;
        }

        int res = numberToPrint;

        for(int i = 2; i <= power; i++){
            res *= numberToPrint;
        }

        System.out.println(res);

    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }

}
