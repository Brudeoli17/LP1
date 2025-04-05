package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class FacaController {

    @FXML
    private Button btFaca;

    @FXML
    private TextField txtAfiada;

    @FXML
    private TextField txtComprimento;

    @FXML
    private TextField txtMaterial;

    @FXML
    void adicionarAtributos(ActionEvent event) {
        Faca faca1 = new Faca(txtMaterial.getText(), Double.valueOf(txtComprimento.getText()), Boolean.valueOf(txtAfiada.getText()));
        txtMaterial.setText(""); txtComprimento.setText(""); txtAfiada.setText("");
        faca1.exibirInformacoes();
    }

}
