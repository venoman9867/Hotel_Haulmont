package ru.haulmont.cardofregistration;

import ru.haulmont.apartments.Apartments;
import ru.haulmont.client.Client;

import java.time.LocalDate;

public class CardOfRegistration {
    private final Client client;
    private final Apartments apartments;
    private final LocalDate dateOfArrival;
    private final LocalDate dateOfDeparture, dateOfPayment, dateOfPrepayment;
    private final boolean payment, prepayment, resultOfTestOnCovid;

    public CardOfRegistration(Client client, Apartments apartments, LocalDate dateOfArrival, LocalDate dateOfDeparture, LocalDate dateOfPayment, LocalDate dateOfPrepayment, boolean payment, boolean prepayment, boolean resultOfTestOnCovid) {
        this.client = client;
        this.apartments = apartments;
        this.dateOfArrival = dateOfArrival;
        this.dateOfDeparture = dateOfDeparture;
        this.dateOfPayment = dateOfPayment;
        this.dateOfPrepayment = dateOfPrepayment;
        this.payment = payment;
        this.prepayment = prepayment;
        this.resultOfTestOnCovid = resultOfTestOnCovid;
    }
}
