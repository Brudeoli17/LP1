package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;

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
    private TextArea txtResultado;

    @FXML
    void crescer(ActionEvent event) {
    Arbusto TesteArbusto = new Arbusto(txtEspecie.getText(), Double.valueOf(txtAltura.getText()), txtCorFolha.getText());
    txtAltura.setText(""); txtCorFolha.setText(""); txtEspecie.setText("");
    txtResultado.setText(TesteArbusto.crescer());
    }

    @FXML
    void mudarCorFolhas(ActionEvent event) {
        Arbusto TesteArbusto = new Arbusto(txtEspecie.getText(), Double.valueOf(txtAltura.getText()), txtCorFolha.getText());
        txtAltura.setText(""); txtCorFolha.setText(""); txtEspecie.setText("");
        txtResultado.setText(TesteArbusto.mudarCorFolhas());

    }

}
