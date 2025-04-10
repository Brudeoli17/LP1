package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class CadeiraController {

    @FXML
    private Button btCadeira2;

    @FXML
    private Button btCadeira3;

    @FXML
    private TextField txtCor;

    @FXML
    private TextField txtMaterial;

    @FXML
    private TextField txtQtdPernas;

    @FXML
    private TextArea txtRespostaCadeira;

    @FXML
    void ajustarNumeroDePernas(ActionEvent event) {
        Cadeira TesteCadeira = new Cadeira (txtCor.getText(), txtMaterial.getText(), Integer.valueOf(txtQtdPernas.getText()));
        txtCor.setText(""); txtMaterial.setText(""); txtQtdPernas.setText("");
        txtRespostaCadeira.setText(TesteCadeira.ajustarNumeroDePernas());

    }

    @FXML
    void novaCor(ActionEvent event) {
        Cadeira TesteCadeira = new Cadeira (txtCor.getText(), txtMaterial.getText(), Integer.valueOf(txtQtdPernas.getText()));
        txtCor.setText(""); txtMaterial.setText(""); txtQtdPernas.setText("");
        txtRespostaCadeira.setText(TesteCadeira.novaCor());

    }

}

