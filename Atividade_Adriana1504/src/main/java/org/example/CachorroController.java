package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class CachorroController {

    @FXML
    private Button btCachorro3;

    @FXML
    private Button txtCahorro2;

    @FXML
    private TextField txtIdade;

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtRaca;

    @FXML
    private TextArea txtResultadoCachorro;

    @FXML
    void ajustarIdade(ActionEvent event) {
        Cachorro TesteCachorro = new Cachorro (txtNome.getText(), txtRaca.getText(), Integer.valueOf(txtIdade.getText()));
        txtNome.setText(""); txtRaca.setText(""); txtIdade.setText("");
        txtResultadoCachorro.setText(TesteCachorro.ajustarIdade());

    }

    @FXML
    void mudarRaca(ActionEvent event) {
        Cachorro TesteCachorro = new Cachorro (txtNome.getText(), txtRaca.getText(), Integer.valueOf(txtIdade.getText()));
        txtNome.setText(""); txtRaca.setText(""); txtIdade.setText("");
        txtResultadoCachorro.setText(TesteCachorro.mudarRaca());
    }

}

