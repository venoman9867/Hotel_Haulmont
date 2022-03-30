package ru.haulmont.client;

import ru.haulmont.cardofregistration.CardOfRegistration;

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

    public String getEmail() {
        return email;
    }

    public String getNumber() {
        return number;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }
}
