package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class TacaController {

    @FXML
    private Button btTaca2;

    @FXML
    private Button btTaca3;

    @FXML
    private TextField txtCapacidade;

    @FXML
    private TextField txtMaterial;

    @FXML
    private TextArea txtRespostaTaca;

    @FXML
    private TextField txtTamanho;

    @FXML
    void tacaComun(ActionEvent event) {
        Taca TesteTaca = new Taca(txtMaterial.getText(), Integer.valueOf(txtCapacidade.getText()), txtTamanho.getText());
        txtMaterial.setText("");
        txtCapacidade.setText("");
        txtTamanho.setText("");
        txtRespostaTaca.setText(TesteTaca.tacaComun());
    }

    @FXML
    void verificaCapacidade(ActionEvent event) {
        Taca TesteTaca = new Taca(txtMaterial.getText(), Integer.valueOf(txtCapacidade.getText()), txtTamanho.getText());
        txtMaterial.setText("");
        txtCapacidade.setText("");
        txtTamanho.setText("");
        txtRespostaTaca.setText(TesteTaca.verificaCapacidade());
    }

}

