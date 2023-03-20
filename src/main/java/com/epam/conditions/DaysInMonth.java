package com.epam.conditions;

public class DaysInMonth {

    int[] numberOfDays = {0,
                            31, //Jan
                            28, //Feb
                            31, //March
                            30, //Apr
                            31, //May
                            30, //June
                            31, //Jul
                            31, //Aug
                            30, //Sep
                            31, //Oct
                            30, //Nov
                            31  //Dev
                        };

    public void printDays(int year, int month) {
        if(!isValidYear(year) || !isValidYMonth(month)){
            System.out.println("invalid date");
            return;
        }

        int numOfDays = numberOfDays[month];

        if (month == 2 && isLeapYear(year)){
            numOfDays = 29;
        }
        System.out.println(numOfDays);
    }

    private static boolean isLeapYear(int year){
        return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
    }

    private static boolean isValidYear(int year){
        return (year >= 0);
    }

    private static boolean isValidYMonth(int month){
        return (month > 0 && month < 13);
    }

}
