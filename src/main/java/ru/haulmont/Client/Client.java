package ru.haulmont.Client;

import ru.haulmont.CardOfRegistration.CardOfRegistration;

import java.util.List;

public class Client {
    private final String family, name, patronymic, number, email;
    private final List<CardOfRegistration> listCardOfRegistration;
    public Client(String family, String name, String patronymic, String number, String email, List<CardOfRegistration> listCardOfRegistration) {
        this.family = family;
        this.name = name;
        this.patronymic = patronymic;
        this.number = number;
        this.email = email;
        this.listCardOfRegistration = listCardOfRegistration;
    }
}
