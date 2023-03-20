package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        for(int i = 1; i <= cathetusLength; i++){
            System.out.println(printFormattedLine(i, '*', cathetusLength));
        }
    }

    public static String printFormattedLine(int len, char c, int maxLen){
        StringBuilder b = new StringBuilder();
        for(int i = 0; i < maxLen; i++){
            b.append( (i < maxLen - len ) ? " " : c );
        }
        return b.toString();
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
