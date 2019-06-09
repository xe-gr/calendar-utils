package gr.xe.calendarUtils;

import java.time.LocalDate;

public class HolidayCalculator {

    public static Holidays CreateHolidays (int year) {
        Holidays holidays = new Holidays(year);
        holidays.setOrthodoxEasterDay(orthodoxEaster(year));

        return holidays;
    }

    private static LocalDate orthodoxEaster (int year) {
        int a = year % 19;
        int b = year % 7;
        int c = year % 4;

        int d = (19 * a + 16) % 30;
        int e = (2 * c + 4 * b + 6 * d) % 7;
        int f = (19 * a + 16) % 30;

        int key = f + e + 3;
        int month = (key > 30) ? 5 : 4;
        int day = (key > 30) ? key - 30 : key;

        return LocalDate.of(year, month, day);
    }
}
