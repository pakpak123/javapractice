/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAb04;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author fernp
 */
public class lab04 {

    /**
     * Main method
     */
    public static void main(String[] args) {
        // Create a GregorianCalendar object
        int day, month, year, date, day1, month1, year1, date1;
        int second, minute, hour;
        long milli;
        GregorianCalendar DATE = new GregorianCalendar();

        day = DATE.get(GregorianCalendar.DAY_OF_WEEK);
        month = DATE.get(GregorianCalendar.MONTH);
        year = DATE.get(GregorianCalendar.YEAR);
        date = DATE.get(GregorianCalendar.DATE);

        second = DATE.get(GregorianCalendar.SECOND);
        minute = DATE.get(GregorianCalendar.MINUTE);
        hour = DATE.get(GregorianCalendar.HOUR);
        DATE.getTime();

        //month + 1
        System.out.println("Current year, month, date, and day of week");

        // Display the current year, month, and day in format Mth/Day/Year
        System.out.println("Year is " + year);
        System.out.println("Month is " + month);

        System.out.println("Date is " + date);
        System.out.println("Day of week is " + day);
        System.out.println("---------------------------");
        DATE.getTimeInMillis();

        //System.out.println(DATE.getTimeInMillis());
        GregorianCalendar DATE1 = new GregorianCalendar();
        //DATE1.setTimeInMillis(1234567898765L);
        DATE1.setTimeInMillis(DATE.getTimeInMillis() + 86400000);

        day1 = DATE1.get(GregorianCalendar.DAY_OF_WEEK);
        month1 = DATE1.get(GregorianCalendar.MONTH);
        year1 = DATE1.get(GregorianCalendar.YEAR);
        date1 = DATE1.get(GregorianCalendar.DATE);

        System.out.println("After specified the elapsed time of one day after current day");
        System.out.println("Year is " + year1);
        System.out.println("Month is " + month1);

        System.out.println("Date is " + date1);
        System.out.println("Day of week is " + day1);
        System.out.println(DATE1.getTime());
         
    }
}
