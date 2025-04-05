package org.example;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CachorroController {

    @FXML
    private Button btCachorro;

    @FXML
    private TextField txtIdade;

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtRaca;

    @FXML
    void adicionarAtributos(ActionEvent event) {
        Cachorro Cachorro1 = new Cachorro(txtNome.getText(), Integer.valueOf(txtIdade.getText()), txtRaca.getText());
        txtNome.setText(""); txtRaca.setText(""); txtIdade.setText("");
        Cachorro1.exibirInformacoes();
    }

    }
