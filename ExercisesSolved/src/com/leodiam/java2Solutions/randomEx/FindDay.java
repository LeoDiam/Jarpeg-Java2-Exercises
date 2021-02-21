package com.leodiam.java2Solutions.randomEx;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Calendar;
import java.util.GregorianCalendar;

class FindDay {
    /**
     * Return the name of the given numeric week day
     */
    public static String weekDayName(int weekDayNumber) {
        return switch (weekDayNumber) {
            case Calendar.MONDAY -> "Δευτέρα";
            case Calendar.TUESDAY -> "Τρίτη";
            case Calendar.WEDNESDAY -> "Τετάρτη";
            case Calendar.THURSDAY -> "Πέμπτη";
            case Calendar.FRIDAY -> "Παρασκευή";
            case Calendar.SATURDAY -> "Σάββατο";
            case Calendar.SUNDAY -> "Κυριακή";
            default -> null;
        };
    }

    public static void main(String[] args) {
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
                new OutputStreamWriter(System.out, StandardCharsets.UTF_8), true);
        // Print the day name
        out.println(dn);
    }
}