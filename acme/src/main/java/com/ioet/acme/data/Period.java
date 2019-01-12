package com.ioet.acme.data;

import java.util.Objects;

public class Period implements Comparable<Period> {

    private final Day day;
    private final long from;
    private final long to;
    private final int workedHours;

    public Period(String block) {
        String day = block.substring(0, 2);
        String[] hours = block.split("-");
        String from = hours[0].substring(2);
        String to = hours[1];
        this.day = Day.valueOf(day);
        this.from = parseMilitaryHour(from);
        this.to = parseMilitaryHour(to);
        this.workedHours = hour(to) - hour(from);
    }

    private int hour(String hour) {
        String value = hour.substring(0, 2);
        return Integer.parseInt(value) == 0 ? 24 : Integer.parseInt(value);
    }

    private long parseMilitaryHour(String hour) {
        String value = hour.replace(":", "");
        return Long.parseLong(value);
    }

    public Day day() {
        return day;
    }

    public long from() {
        return from;
    }

    public long to() {
        return to;
    }

    public int workedHours() {
        return workedHours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Period period = (Period) o;
        return from == period.from &&
                to == period.to &&
                day == period.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, from, to);
    }

    @Override
    public int compareTo(Period o) {
        if (day() == o.day()
                && from() == o.from()
                && to() == o.to()) {
            return 0;
        } else {
            if (day().order() < o.day().order()
                    && from() < o.from()
                    && to() < o.to()) {
                return -1;
            }
        }
        return 1;
    }
}
