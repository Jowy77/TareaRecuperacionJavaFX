/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.tarearecuperarinterfazjavafx;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Iproy
 */
public class MainViewController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void abrirPerfil(ActionEvent event) {
        Stage stage = new Stage();

                Scene scene;
                try {
                    scene = new Scene(loadFXML("perfilView"));
                    stage.setScene(scene);
                    stage.show();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
    }

    @FXML
    private void abrirEntrenamientos(ActionEvent event) {
        
        Stage stage = new Stage();

                Scene scene;
                try {
                    scene = new Scene(loadFXML("entrenamientosView"));
                    stage.setScene(scene);
                    stage.show();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
        
    }

    @FXML
    private void abrirDietas(ActionEvent event) {
        
        Stage stage = new Stage();

                Scene scene;
                try {
                    scene = new Scene(loadFXML("DietasView"));
                    stage.setScene(scene);
                    stage.show();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
        
    }

    @FXML
    private void salir(ActionEvent event) {
        System.exit(0);
    }
    
    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }
    
}
