package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int res = 0;
        for(char c : String.valueOf(number).toCharArray()){
            res += Character.getNumericValue(c);
        }
        System.out.println(res);
    }

}
