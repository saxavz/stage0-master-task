package com.epam.conditions;

public class SeasonDeterminer {
    String[] seasonByMonths = { null,
            "Winter", //Jan
            "Winter", //Feb
            "Spring", //March
            "Spring", //Apr
            "Spring", //May
            "Summer", //June
            "Summer", //Jul
            "Summer", //Aug
            "Autumn", //Sep
            "Autumn", //Oct
            "Autumn", //Nov
            "Winter"  //Dev
    };

    public void tellTheSeason(int monthNumber) {
        if(!isValidMonth(monthNumber)){
            System.out.println("Wrong month number");
        } else {
            System.out.println(seasonByMonths[monthNumber]);
        }
    }

    private static boolean isValidMonth(int month){
        return (month > 0 && month < 13);
    }

}
