package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {

        for(int i = 1; i <= cathetusLength; i++){
            System.out.println(printFormattedLine(i,  cathetusLength));
        }
    }

    public static String printFormattedLine(int maxNum, int maxLen){
        StringBuilder b = new StringBuilder();
        for(int i = 1; i <= maxLen; i++){
            String s = (i > maxNum ) ? " " : String.valueOf(i) ;
            b.insert(0, (i==1) ? "" : s);
            b.append(s.trim());
        }
        return b.toString();
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
