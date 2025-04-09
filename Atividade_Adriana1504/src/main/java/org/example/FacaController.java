package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;

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
    private TextArea txtResultadoFaca;

    @FXML
    void exibirInformações(ActionEvent event) {
        Faca testeFaca = new Faca (txtMaterial.getText(), Double.valueOf(txtComprimento.getText()), txtAfiada.getText());
        txtMaterial.setText(""); txtComprimento.setText(""); txtAfiada.setText("");
        txtResultadoFaca.setText(testeFaca.exibirInformacoes());
    }

    @FXML
    void afiar(ActionEvent event) {
        Faca testeFaca = new Faca (txtMaterial.getText(), Double.valueOf(txtComprimento.getText()), txtAfiada.getText());
        txtMaterial.setText(""); txtComprimento.setText(""); txtAfiada.setText("");
        txtResultadoFaca.setText(testeFaca.afiar());
    }
}