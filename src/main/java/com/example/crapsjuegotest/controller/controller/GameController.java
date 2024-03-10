package com.example.crapsjuegotest.controller.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;


public class GameController {

    @FXML
    private TextField nicknameTextField;

    @FXML
    private TextArea outputTextAre;

    @FXML
    public void onHandleButtonPlay(ActionEvent event){
        nicknameTextField.getText();
        String nickName = nicknameTextField.getText();
        System.out.println(nickName);
        outputTextAre.setText(nickName);
    }
    @FXML
    public void onKeyNicknameTextField(KeyEvent event) {
        System.out.println(event.getText());
    }
}
