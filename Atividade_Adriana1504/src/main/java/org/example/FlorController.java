package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;

public class FlorController {

    @FXML
    private Button btFLor3;

    @FXML
    private Button btFlor2;

    @FXML
    private TextField txtCor;

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtPreco;

    @FXML
    private TextArea txtRespostaFLor;

    @FXML
    void ajustarPreco(ActionEvent event) {
        Flor TesteFlor = new Flor (txtCor.getText(), txtNome.getText(), Double.valueOf(txtPreco.getText()));
        txtCor.setText("");txtNome.setText("");txtPreco.setText("");
        txtRespostaFLor.setText(TesteFlor.ajustarPreco());
    }

    @FXML
    void florescer(ActionEvent event) {
        Flor TesteFlor = new Flor (txtCor.getText(), txtNome.getText(), Double.valueOf(txtPreco.getText()));
        txtCor.setText("");txtNome.setText("");txtPreco.setText("");
        txtRespostaFLor.setText(TesteFlor.florescer());
    }

}
