import gr.xe.calendarUtils.HolidayCalculator;
import gr.xe.calendarUtils.Holidays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CatholicEasterFridayTests {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 2018, LocalDate.of(2018, 3, 30) },
                { 2019, LocalDate.of(2019, 4, 19) },
                { 2020, LocalDate.of(2020, 4, 10) },
        });
    }

    private int input;
    private LocalDate expected;

    //This constructor must be provided for the parameterized tests to work.
    public CatholicEasterFridayTests(int input, LocalDate expected) {
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void VerifyDates() {
        Holidays holidays = HolidayCalculator.CreateHolidays(input);

        assertEquals(expected, holidays.getCatholicEasterFriday());
    }
}
