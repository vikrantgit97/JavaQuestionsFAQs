package com.easy;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2020;
        String result = (((year % 100 != 0) && (year % 4 == 0)) || (year % 400 == 0))? 
        year+ " is a leap year " : year +" is not a leap year ";
        System.out.println(result);
    }
}