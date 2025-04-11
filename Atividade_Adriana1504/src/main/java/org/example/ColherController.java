package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;

public class ColherController {

    @FXML
    private Button btColher2;

    @FXML
    private Button btColher3;

    @FXML
    private TextField txtComprimento;

    @FXML
    private TextField txtEstado;

    @FXML
    private TextField txtMaterial;

    @FXML
    private TextArea txtRespostaColher;

    @FXML
    void utilizacao(ActionEvent event) {
        Colher TesteColher = new Colher (txtEstado.getText(), txtComprimento.getText(), txtMaterial.getText());
        txtMaterial.setText("");txtComprimento.setText("");txtEstado.setText("");
        txtRespostaColher.setText(TesteColher.utilizacao());

    }

    @FXML
    void utilizavel(ActionEvent event) {
        Colher TesteColher = new Colher (txtEstado.getText(), txtComprimento.getText(), txtMaterial.getText());
        txtMaterial.setText("");txtComprimento.setText("");txtEstado.setText("");
        txtRespostaColher.setText(TesteColher.utilizavel());
    }

}
