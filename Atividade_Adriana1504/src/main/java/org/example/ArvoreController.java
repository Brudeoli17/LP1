package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;

public class ArvoreController {

    @FXML
    private Button btArvore2;

    @FXML
    private Button btArvore3;

    @FXML
    private TextField txtAltura;

    @FXML
    private TextField txtEspecie;

    @FXML
    private TextField txtIdade;

    @FXML
    private TextArea txtResultadoArvore;

    @FXML
    void cresceu(ActionEvent event) {
    Arvore testeArvore = new Arvore (txtEspecie.getText(), Double.valueOf(txtAltura.getText()), Integer.valueOf(txtIdade.getText()));
    txtAltura.setText(""); txtEspecie.setText(""); txtIdade.setText("");
    txtResultadoArvore.setText(testeArvore.cresceu());
    }

    @FXML
    void envelhecer(ActionEvent event) {
    Arvore testeArvore = new Arvore (txtEspecie.getText(), Double.valueOf(txtAltura.getText()), Integer.valueOf(txtIdade.getText()));
    txtAltura.setText(""); txtEspecie.setText(""); txtIdade.setText("");
    txtResultadoArvore.setText(testeArvore.envelhecer());

    }

}

