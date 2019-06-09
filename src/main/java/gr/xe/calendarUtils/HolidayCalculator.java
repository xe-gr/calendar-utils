package gr.xe.calendarUtils;

import java.time.LocalDate;

public class HolidayCalculator {

    public static Holidays CreateHolidays (int year) {
        Holidays holidays = new Holidays();

        holidays.setYear(year);

        holidays.setNewYearDay(LocalDate.of(year, 1, 1));

        holidays.setEpiphany(LocalDate.of(year, 1, 8));

        holidays.setGreenMonday(orthodoxEaster(year).minusDays(48));

        holidays.setMarch25(LocalDate.of(year, 3, 25));

        holidays.setOrthodoxEasterFriday(orthodoxEaster(year).minusDays(2));
        holidays.setOrthodoxEasterDay(orthodoxEaster(year));
        holidays.setOrthodoxEasterMonday(orthodoxEaster(year).plusDays(1));

        holidays.setCatholicEasterFriday(catholicEaster(year).minusDays(2));
        holidays.setCatholicEasterDay(catholicEaster(year));
        holidays.setCatholicEasterMonday(catholicEaster(year).plusDays(1));

        holidays.setMayDay(LocalDate.of(year, 5, 1));

        holidays.setHolySpirit(orthodoxEaster(year).plusDays(50));

        holidays.setTheAssumption(LocalDate.of(year, 8, 15));

        holidays.setOctober28(LocalDate.of(year, 10, 28));

        holidays.setChristmasDay(LocalDate.of(year, 12, 25));
        holidays.setChristmasNextDay(LocalDate.of(year, 12, 26));

        return holidays;
    }

    //
    // Kudos to https://blog.georgekosmidis.net/2013/04/28/c-calculating-orthodox-and-catholic-easter/
    //
    
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

    private static LocalDate catholicEaster (int year) {
        int m = 3;
        int a = year % 19 + 1;
        int b = year / 100 + 1;
        int c = (3 * b) / 4 - 12;
        int d = (8 * b + 5) / 25 - 5;
        int e = (5 * year) / 4 - c - 10;

        int f = (11 * a + 20 + d - c) % 30;
        if (f == 24)
            f++;
        if ((f == 25) && (a > 11))
            f++;

        int g = 44 - f;
        if (g < 21)
            g = g + 30;

        int day = (g + 7) - ((e + g) % 7);
        if (day > 31)
        {
            day = day - 31;
            m = 4;
        }

        return LocalDate.of(year, m, day);
    }
}
