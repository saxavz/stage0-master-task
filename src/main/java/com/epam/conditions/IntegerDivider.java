package com.epam.conditions;

public class IntegerDivider {

    public void printCompletelyDivided(int dividend, int divider) {
        if(divider == 0) {
            System.out.println("division by zero");
            return;
        }

        System.out.println(
                            ( hasReminderAfterDivision(dividend, divider) ? "cannot" : "can" ) + " be divided completely"
                );
    }

    private static boolean hasReminderAfterDivision(int dividend, int divider){
        return !( (dividend / divider) * divider == dividend );
    }

}
