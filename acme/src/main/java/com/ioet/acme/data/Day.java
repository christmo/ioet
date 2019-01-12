package com.ioet.acme.data;

public enum Day {

    MO(1, "Monday"),
    TU(2, "Tuesday"),
    WE(3, "Wednesday"),
    TH(4, "Thursday"),
    FR(5, "Friday"),
    SA(6, "Saturday"),
    SU(7, "Sunday");

    Day(int order, String name) {
        this.order = order;
        this.name = name;
    }

    private final String name;
    private final int order;

    public String englishName() {
        return this.name;
    }

    public int order() {
        return this.order;
    }

}
