package com.epam.conditions;

import java.util.Locale;

import static com.epam.conditions.CoordinatePane.Answer.*;

public class CoordinatePane {

    public void printQuadrant(int x, int y) {

        Answer res = ZERO;

        if(x > 0) {
            res = (y > 0) ? FIRST : FOURTH;
        }

        if(x < 0) {
            res = (y > 0) ? SECOND : THIRD;
        }

        res.print();
    }

    enum Answer {
        FIRST, SECOND, THIRD, FOURTH, ZERO;

        public void print(){
            System.out.println(this.name().toLowerCase());
        }
    }

}

