package org.example;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MenuController {

    public void FacaController() {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("formFaca.fxml"));
                Parent root = loader.load();

                FacaController controller = loader.getController();

                Stage stage = new Stage();
                stage.setTitle("Faca");
                stage.setScene(new Scene(root));
                stage.show();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    public void ArbustoController() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("formArbusto.fxml"));
            Parent root = loader.load();

            ArbustoController controller = loader.getController();

            Stage stage = new Stage();
            stage.setTitle("Arbusto");
            stage.setScene(new Scene(root));
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

        public void ArvoreController() {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("formArvore.fxml"));
                Parent root = loader.load();

                ArvoreController controller = loader.getController();

                Stage stage = new Stage();
                stage.setTitle("Arvore");
                stage.setScene(new Scene(root));
                stage.show();

            } catch (Exception e){
                e.printStackTrace();
            }
    }

}



