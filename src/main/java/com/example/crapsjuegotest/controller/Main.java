package com.example.crapsjuegotest.controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.io.IOException;

public class Main extends Application {

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/crapsjuegotest/welcome-view.fxml"));
        Parent root = loader.load();
        primaryStage.setTitle("Craps game");
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();

        Image icon = new Image("C:\\Users\\User\\OneDrive\\Documents\\zelda_icon.png");
        primaryStage.getIcons().add(icon);
    }
}
