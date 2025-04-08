package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ArbustoController {

    @FXML
    private Button btArbusto2;

    @FXML
    private Button btCrescer;

    @FXML
    private TextField txtAltura;

    @FXML
    private TextField txtCorFolha;

    @FXML
    private TextField txtEspecie;

    @FXML
    void crescer(ActionEvent event) {
    Arbusto TesteArbusto = new Arbusto(txtEspecie.getText(), Double.valueOf(txtAltura.getText()), txtCorFolha.getText());
    txtAltura.setText(""); txtCorFolha.setText(""); txtEspecie.setText("");
    TesteArbusto.crescer();
    }

    @FXML
    void mudarCorFolhas(ActionEvent event) {
        Arbusto TesteArbusto = new Arbusto(txtEspecie.getText(), Double.valueOf(txtAltura.getText()), txtCorFolha.getText());
        txtAltura.setText(""); txtCorFolha.setText(""); txtEspecie.setText("");
        TesteArbusto.mudarCorFolhas();

    }

}
