package gr.xe.calendarUtils;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Holidays {

    public List<LocalDate> getAllPublicHolidays() {
        List<LocalDate> lst = new ArrayList<LocalDate>();

        addIfNotPresent(lst, getNewYearDay());
        addIfNotPresent(lst, getEpiphany());
        addIfNotPresent(lst, getGreenMonday());
        addIfNotPresent(lst, getMarch25());
        addIfNotPresent(lst, getOrthodoxEasterFriday());
        addIfNotPresent(lst, getOrthodoxEasterDay());
        addIfNotPresent(lst, getOrthodoxEasterMonday());
        addIfNotPresent(lst, getMayDay());
        addIfNotPresent(lst, getHolySpirit());
        addIfNotPresent(lst, getTheAssumption());
        addIfNotPresent(lst, getOctober28());
        addIfNotPresent(lst, getChristmasDay());
        addIfNotPresent(lst, getChristmasNextDay());

        return lst;
    }

    private void addIfNotPresent (List<LocalDate> list, LocalDate date) {
        if (!list.contains(date))
        {
            list.add(date);
        }
    }

    @Getter @Setter(AccessLevel.PROTECTED) private int year;
    @Getter @Setter(AccessLevel.PROTECTED) private LocalDate newYearDay;
    @Getter @Setter(AccessLevel.PROTECTED) private LocalDate epiphany;
    @Getter @Setter(AccessLevel.PROTECTED) private LocalDate greenMonday;
    @Getter @Setter(AccessLevel.PROTECTED) private LocalDate march25;
    @Getter @Setter(AccessLevel.PROTECTED) private LocalDate orthodoxEasterFriday;
    @Getter @Setter(AccessLevel.PROTECTED) private LocalDate orthodoxEasterDay;
    @Getter @Setter(AccessLevel.PROTECTED) private LocalDate orthodoxEasterMonday;
    @Getter @Setter(AccessLevel.PROTECTED) private LocalDate catholicEasterFriday;
    @Getter @Setter(AccessLevel.PROTECTED) private LocalDate catholicEasterDay;
    @Getter @Setter(AccessLevel.PROTECTED) private LocalDate catholicEasterMonday;
    @Getter @Setter(AccessLevel.PROTECTED) private LocalDate mayDay;
    @Getter @Setter(AccessLevel.PROTECTED) private LocalDate holySpirit;
    @Getter @Setter(AccessLevel.PROTECTED) private LocalDate theAssumption;
    @Getter @Setter(AccessLevel.PROTECTED) private LocalDate october28;
    @Getter @Setter(AccessLevel.PROTECTED) private LocalDate christmasDay;
    @Getter @Setter(AccessLevel.PROTECTED) private LocalDate christmasNextDay;
}