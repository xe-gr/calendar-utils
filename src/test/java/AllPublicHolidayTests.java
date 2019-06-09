import gr.xe.calendarUtils.HolidayCalculator;
import gr.xe.calendarUtils.Holidays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

public class AllPublicHolidayTests {

    @Test
    public void VerifyDates() {
        Holidays holidays = HolidayCalculator.CreateHolidays(2019);

        List<LocalDate> list = holidays.getAllPublicHolidays();

        assertTrue(list.contains(LocalDate.of(2019, 1, 1)));
        assertTrue(list.contains(LocalDate.of(2019, 1, 6)));
        assertTrue(list.contains(LocalDate.of(2019, 3, 11)));
        assertTrue(list.contains(LocalDate.of(2019, 3, 25)));
        assertTrue(list.contains(LocalDate.of(2019, 4, 26)));
        assertTrue(list.contains(LocalDate.of(2019, 4, 28)));
        assertTrue(list.contains(LocalDate.of(2019, 4, 29)));
        assertTrue(list.contains(LocalDate.of(2019, 5, 1)));
        assertTrue(list.contains(LocalDate.of(2019, 6, 17)));
        assertTrue(list.contains(LocalDate.of(2019, 8, 15)));
        assertTrue(list.contains(LocalDate.of(2019, 10, 28)));
        assertTrue(list.contains(LocalDate.of(2019, 12, 25)));
        assertTrue(list.contains(LocalDate.of(2019, 12, 26)));

        assertEquals(13, list.size());
    }

    @Test
    public void VerifyNoDuplicates() {
        Holidays holidays = HolidayCalculator.CreateHolidays(1994);  // May first on easter day.

        List<LocalDate> list = holidays.getAllPublicHolidays();

        assertEquals(12, list.size());
    }
}
