package com.epam.conditions;

public class TriangleSidesValidator {

    public void validate(double firstSide, double secondSide, double thirdSide) {
        //Triangle Inequality Theorem
        boolean isValidTriangle =   firstSide < getSumOfTwo(secondSide, thirdSide) &&
                                    secondSide < getSumOfTwo(firstSide, thirdSide) &&
                                    thirdSide < getSumOfTwo(firstSide, secondSide);
        System.out.println(
                        (isValidTriangle) ? "this is a valid triangle" : "it's not a triangle"
        );
    }

    private static double getSumOfTwo(double a, double b){
        return  a + b;
    }


}
