package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class FacaController {

    @FXML
    private Button btFacaAfiar;

    @FXML
    private Button btFacaInformacoes;

    @FXML
    private TextField txtAfiada;

    @FXML
    private TextField txtComprimento;

    @FXML
    private TextField txtMaterial;

    @FXML
    void exibirInformações(ActionEvent event) {
        Faca testeF = new Faca (txtMaterial.getText(), Double.valueOf(txtComprimento.getText()), txtAfiada.getText());
        txtMaterial.setText(""); txtComprimento.setText(""); txtAfiada.setText("");
        testeF.exibirInformacoes();
    }

}