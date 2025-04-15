package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class VacaController {

    @FXML
    private Button btVaca2;

    @FXML
    private Button btVaca3;

    @FXML
    private TextField txtCor;

    @FXML
    private TextField txtIdade;

    @FXML
    private TextField txtNome;

    @FXML
    private TextArea txtRespostaVaca;

    @FXML
    void beberAgua(ActionEvent event) {
        Vaca TesteVaca = new Vaca(txtCor.getText(), Integer.valueOf(txtIdade.getText()), txtNome.getText());
        txtNome.setText("");
        txtIdade.setText("");
        txtCor.setText("");
        txtRespostaVaca.setText(TesteVaca.beberAgua());
    }

    @FXML
    void comer(ActionEvent event) {
        Vaca TesteVaca = new Vaca(txtCor.getText(), Integer.valueOf(txtIdade.getText()), txtNome.getText());
        txtNome.setText("");
        txtIdade.setText("");
        txtCor.setText("");
        txtRespostaVaca.setText(TesteVaca.comer());
    }

}

