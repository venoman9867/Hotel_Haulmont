package ru.haulmont.Controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import ru.haulmont.Main;

import javax.swing.text.View;
import java.io.IOException;
import java.util.ArrayDeque;

public class Controller {
    public Main main = new Main();
    public TextField Name;
    public TextField Family;
    public TextField Patronymic;
    public TextField Number;
    public TextField Email;
    public Button firstOK;
    public Button secondOK;

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

    public void  isOkayButtonClicked(ActionEvent actionEvent) throws IOException {//вот тут классную штуку сделал
        Button btn = (Button) actionEvent.getSource();// метод сам определяет какая кнопка его нажала и отправляет в мейн
        main.okayClicked(btn);
    }

    public void deleteGuest() {
    }

    public void changeGuest() {
    }
}
