package ru.haulmont;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import ru.haulmont.Controller.Controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;

public class Main extends Application {
    public Controller controller;

    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/FirstPage.fxml")));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) throws SQLException {
        Connection c = DriverManager.getConnection("jdbc:hsqldb:file:testdb", "SA", "");
        Statement statement = c.createStatement();
        launch(args);
    }

    public void okayClicked(Button button) throws IOException {
        switch (button.getId()) {
            case "firstOK":
                okWindow();
            case "secondOK": ;
        }
    }

    public void getListOfGuests() {
        //statement.execute("SELECT * FROM Client");
    }

    public void addGuestInList() throws IOException {
        Stage firstStage = new Stage();
        firstStage.setTitle("Добавление гостя");
        Parent rootFirst = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/addGuest.fxml")));
        Scene firstScene = new Scene(rootFirst);
        firstStage.setScene(firstScene);
        firstStage.show();

    }

    public void okWindow() throws IOException {
        Stage secondStage = new Stage();
        Parent rootSecond = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/ok.fxml")));
        Scene secondScene = new Scene(rootSecond);
        secondStage.setScene(secondScene);
        secondStage.show();
        //addValueToDataBase();
    }


    public void addValueToDataBase() {
        String name = controller.getName();
        String family = controller.getFamily();
        String patronymic = controller.getPatronymic();
        String number = controller.getNumber();
        String email = controller.getEmail();

    }
}
