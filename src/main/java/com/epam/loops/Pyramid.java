package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {

        for(int i = 1; i <= cathetusLength; i++){
            System.out.println(printFormattedLine(i,  cathetusLength));
        }
    }

    public static String printFormattedLine(int maxNum, int maxLen){
        char[] arr = new char[maxLen*2 -1];
        for(int i = 0; i < maxLen; i++){
            int rightPos = arr.length/2 + i;
            int leftPos = arr.length/2 - i;
            char c = (i + 1 > maxNum ) ? ' ' : Character.forDigit(i + 1, 10) ;
            arr[rightPos] = (c == ' ') ? Character.MIN_VALUE : c;
            arr[leftPos] = c;
        }
        return String.valueOf(arr).replaceAll("\0", "");
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
