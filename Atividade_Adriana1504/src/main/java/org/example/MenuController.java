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

    public void CachorroController() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("formCachorro.fxml"));
            Parent root = loader.load();

            CachorroController controller = loader.getController();

            Stage stage = new Stage();
            stage.setTitle("Cachorro");
            stage.setScene(new Scene(root));
            stage.show();

        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void CadeiraController() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("formCadeira.fxml"));
            Parent root = loader.load();

            CadeiraController controller = loader.getController();

            Stage stage = new Stage();
            stage.setTitle("Cadeira");
            stage.setScene(new Scene(root));
            stage.show();

        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void ColherController() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("formColher.fxml"));
            Parent root = loader.load();

            ColherController controller = loader.getController();

            Stage stage = new Stage();
            stage.setTitle("Colher");
            stage.setScene(new Scene(root));
            stage.show();

        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void FlorController() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("formFlor.fxml"));
            Parent root = loader.load();

            FlorController controller = loader.getController();

            Stage stage = new Stage();
            stage.setTitle("Flor");
            stage.setScene(new Scene(root));
            stage.show();

        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void GatoController() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("formGato.fxml"));
            Parent root = loader.load();

            GatoController controller = loader.getController();

            Stage stage = new Stage();
            stage.setTitle("Gato");
            stage.setScene(new Scene(root));
            stage.show();

        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void TacaController() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("formTaca.fxml"));
            Parent root = loader.load();

            TacaController controller = loader.getController();

            Stage stage = new Stage();
            stage.setTitle("Taca");
            stage.setScene(new Scene(root));
            stage.show();

        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void VacaController() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("formVaca.fxml"));
            Parent root = loader.load();

            VacaController controller = loader.getController();

            Stage stage = new Stage();
            stage.setTitle("Vaca");
            stage.setScene(new Scene(root));
            stage.show();

        } catch (Exception e){
            e.printStackTrace();
        }
    }


}



