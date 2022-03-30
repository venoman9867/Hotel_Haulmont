package ru.haulmont.Controller;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import ru.haulmont.Main;

import java.io.IOException;

public class Controller {
    public Main main = new Main();
    public TextField Name;
    public TextField Family;
    public TextField Patronymic;
    public TextField Number;
    public TextField Email;
    public Button first_Ok;
    public Button second_Ok;

    public String getName() {
        return Name.getText();
    }

    public String getFamily() {
        return Family.getText();
    }

    public String getPatronymic() {
        return Patronymic.getText();
    }

    public String getNumber() {
        return Number.getText();
    }

    public String getEmail() {
        return Email.getText();
    }

    public void listOfGuest() {
        main.getListOfGuests();
    }

    public void addGuest() throws IOException {
        main.addGuestInList();
    }
    public void ifOkayButtonClicked() throws IOException {
        main.okWindow();
    }

    public void deleteGuest() {
    }

    public void changeGuest() {
    }
}
