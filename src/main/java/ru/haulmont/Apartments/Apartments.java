package ru.haulmont.Apartments;

public class Apartments {
    private final int number;
    private final boolean booking, isBusy;

    public Apartments(int number, boolean booking, boolean isBusy) {
        this.number=number;
        this.booking = booking;
        this.isBusy = isBusy;
    }
}
