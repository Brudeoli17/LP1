package org.example.atividade_adriana2403;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import classes.model.Animal;
import classes.model.Planta;
import classes.model.Utensilio;

public class TestaClasseController {

    @FXML private Button metodo1Animal;
    @FXML private Button metodo2Animal;
    @FXML private Button metodo3Animal;

    @FXML private Button metodo1Planta;
    @FXML private Button metodo2Planta;
    @FXML private Button metodo3Planta;

    @FXML private Button metodo1Utensilio;
    @FXML private Button metodo2Utensilio;
    @FXML private Button metodo3Utensilio;

    private Animal animal = new Animal("Cachorro","Macho","Azul",4);
    private Planta planta = new Planta("orquidea", "Azul", 1.62, 1.90);
    private Utensilio utensilio = new Utensilio("Ferro",90,"Faca");

    @FXML
    private void chamarMetodo1Animal() {
        animal.beberAgua();
    }

    @FXML
    private void chamarMetodo2Animal() {
        animal.comer();
    }

    @FXML
    private void chamarMetodo3Animal() {
        animal.verificarIdade(4);
    }

    @FXML
    private void chamarMetodo1Planta() {
        planta.crescimento(1.62,1.90);
    }

    @FXML
    private void chamarMetodo2Planta() {
        planta.possuiFlor("orquidea");
    }

    @FXML
    private void chamarMetodo3Planta() {
        planta.aguar();
    }

    @FXML
    private void chamarMetodo1Utensilio() {
        utensilio.verificarDurabilidade("Ferro");
    }

    @FXML
    private void chamarMetodo2Utensilio() {
        utensilio.lavar();
    }

    @FXML
    private void chamarMetodo3Utensilio() {
        utensilio.quantidadeDisponivel(10);
    }
}
