package ru.haulmont.Controller;

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


    public void listOfGuest() {
        main.getListOfGuests();
    }

    public void addGuest() throws IOException {
        main.addGuestInList();
    }

    public void deleteGuest() {
    }

    public void changeGuest() {
    }
}
