package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        char[] num = String.valueOf(number).toCharArray();
        char tmp = num[0];
        num[0] = num[2];
        num[2] = tmp;

        System.out.println(String.valueOf(num));
    }

}
