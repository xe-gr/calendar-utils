package gr.xe.calendarUtils;

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

    public int getYear() {
        return year;
    }

    protected void setYear(int year) {
        this.year = year;
    }

    public LocalDate getNewYearDay() {
        return newYearDay;
    }

    protected void setNewYearDay(LocalDate newYearDay) {
        this.newYearDay = newYearDay;
    }

    public LocalDate getEpiphany() {
        return epiphany;
    }

    protected void setEpiphany(LocalDate epiphany) {
        this.epiphany = epiphany;
    }

    public LocalDate getGreenMonday() {
        return greenMonday;
    }

    protected void setGreenMonday(LocalDate greenMonday) {
        this.greenMonday = greenMonday;
    }

    public LocalDate getMarch25() {
        return march25;
    }

    protected void setMarch25(LocalDate march25) {
        this.march25 = march25;
    }

    public LocalDate getOrthodoxEasterFriday() {
        return orthodoxEasterFriday;
    }

    protected void setOrthodoxEasterFriday(LocalDate orthodoxEasterFriday) {
        this.orthodoxEasterFriday = orthodoxEasterFriday;
    }

    public LocalDate getOrthodoxEasterDay() {
        return orthodoxEasterDay;
    }

    protected void setOrthodoxEasterDay(LocalDate orthodoxEasterDay) {
        this.orthodoxEasterDay = orthodoxEasterDay;
    }

    public LocalDate getOrthodoxEasterMonday() {
        return orthodoxEasterMonday;
    }

    protected void setOrthodoxEasterMonday(LocalDate orthodoxEasterMonday) {
        this.orthodoxEasterMonday = orthodoxEasterMonday;
    }

    public LocalDate getCatholicEasterFriday() {
        return catholicEasterFriday;
    }

    protected void setCatholicEasterFriday(LocalDate catholidEasterFriday) {
        this.catholicEasterFriday = catholidEasterFriday;
    }

    public LocalDate getCatholicEasterDay() {
        return catholicEasterDay;
    }

    protected void setCatholicEasterDay(LocalDate catholicEasterDay) {
        this.catholicEasterDay = catholicEasterDay;
    }

    public LocalDate getCatholicEasterMonday() {
        return catholicEasterMonday;
    }

    protected void setCatholicEasterMonday(LocalDate catholicEasterMonday) {
        this.catholicEasterMonday = catholicEasterMonday;
    }

    public LocalDate getMayDay() {
        return mayDay;
    }

    protected void setMayDay(LocalDate mayDay) {
        this.mayDay = mayDay;
    }

    public LocalDate getHolySpirit() {
        return holySpirit;
    }

    protected void setHolySpirit(LocalDate holySpirit) {
        this.holySpirit = holySpirit;
    }

    public LocalDate getTheAssumption() {
        return theAssumption;
    }

    protected void setTheAssumption(LocalDate theAssumption) {
        this.theAssumption = theAssumption;
    }

    public LocalDate getOctober28() {
        return october28;
    }

    protected void setOctober28(LocalDate october28) {
        this.october28 = october28;
    }

    public LocalDate getChristmasDay() {
        return christmasDay;
    }

    protected void setChristmasDay(LocalDate christmasDay) {
        this.christmasDay = christmasDay;
    }

    public LocalDate getChristmasNextDay() {
        return christmasNextDay;
    }

    protected void setChristmasNextDay(LocalDate christmasNextDay) {
        this.christmasNextDay = christmasNextDay;
    }

    private int year;
    private LocalDate newYearDay;
    private LocalDate epiphany;
    private LocalDate greenMonday;
    private LocalDate march25;
    private LocalDate orthodoxEasterFriday;
    private LocalDate orthodoxEasterDay;
    private LocalDate orthodoxEasterMonday;
    private LocalDate catholicEasterFriday;
    private LocalDate catholicEasterDay;
    private LocalDate catholicEasterMonday;
    private LocalDate mayDay;
    private LocalDate holySpirit;
    private LocalDate theAssumption;
    private LocalDate october28;
    private LocalDate christmasDay;
    private LocalDate christmasNextDay;
}