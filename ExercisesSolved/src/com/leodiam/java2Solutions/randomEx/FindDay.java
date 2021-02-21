package com.leodiam.java2Solutions.randomEx;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;

class FindDay {
    /**
     * Return the name of the given numeric week day
     */
    public static String weekDayName(int weekDayNumber) {
        switch (weekDayNumber) {
            case Calendar.MONDAY:
                return "Δευτέρα";
            case Calendar.TUESDAY:
                return "Τρίτη";
            case Calendar.WEDNESDAY:
                return "Τετάρτη";
            case Calendar.THURSDAY:
                return "Πέμπτη";
            case Calendar.FRIDAY:
                return "Παρασκευή";
            case Calendar.SATURDAY:
                return "Σάββατο";
            case Calendar.SUNDAY:
                return "Κυριακή";
        }
        return null;
    }

    public static void main(String args[]) throws Exception {
        // Are appropriate arguments given?
        if (args.length != 3) {
            System.err.println("usage: FindDay year month day");
            System.exit(1);
        }

        // Parse year, month, day
        int year = Integer.parseInt(args[0]);
        int month = Integer.parseInt(args[1]) - 1;
        int monthDay = Integer.parseInt(args[2]);

        // Set the calendar and calculate the day name
        GregorianCalendar d = new GregorianCalendar(year, month, monthDay);
        String dn = weekDayName(d.get(Calendar.DAY_OF_WEEK));

        // Create an output channel for Greek characters
        PrintWriter out = new PrintWriter(
                new OutputStreamWriter(System.out, "utf-8"), true);
        // Print the day name
        out.println(dn);
    }
}