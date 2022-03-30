package ru.haulmont;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;

public class Main extends Application {
    @Override
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
    public void getListOfGuests() {
        //statement.execute("SELECT * FROM Client");
    }
    public void addGuestInList() throws IOException {
        Stage stage=new Stage();
        stage.setTitle("Добавление гостя");
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/addGuest.fxml")));
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
