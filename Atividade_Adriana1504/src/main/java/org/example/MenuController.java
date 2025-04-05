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
                stage.setTitle("Informações");
                stage.setScene(new Scene(root));
                stage.show();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


