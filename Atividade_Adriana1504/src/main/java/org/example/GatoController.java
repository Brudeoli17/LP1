package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class GatoController {

    @FXML
    private Button btGato2;

    @FXML
    private Button btGato3;

    @FXML
    private TextField txtNome;

    @FXML
    private TextArea txtRespostaGato;

    @FXML
    private TextField txtTamanhoGarra;

    @FXML
    private TextField txtTamanhoPelo;

    @FXML
    void cortarGarra(ActionEvent event) {
        Gato TesteGato = new Gato (txtNome.getText(), txtTamanhoPelo.getText(), txtTamanhoGarra.getText());
        txtNome.setText("");txtTamanhoPelo.setText("");txtTamanhoGarra.setText("");
        txtRespostaGato.setText(TesteGato.cortarGarra());
    }

    @FXML
    void cortarPelo(ActionEvent event) {
        Gato TesteGato = new Gato (txtNome.getText(), txtTamanhoPelo.getText(), txtTamanhoGarra.getText());
        txtNome.setText("");txtTamanhoPelo.setText("");txtTamanhoGarra.setText("");
        txtRespostaGato.setText(TesteGato.cortarPelo());
    }

}

