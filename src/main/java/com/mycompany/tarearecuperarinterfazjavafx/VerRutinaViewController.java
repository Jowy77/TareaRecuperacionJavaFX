/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.tarearecuperarinterfazjavafx;

import com.mycompany.tarearecuperarinterfazjavafx.utils.Utils;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Iproy
 */
public class VerRutinaViewController implements Initializable {

    @FXML
    private AnchorPane root;
    @FXML
    private TextArea textArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        String entrenamientoPecho = 
        "Entrenamiento de Pecho (4x12):\n\n" +
        "1. Press de Banca:\n" +
        "   - 4 series de 12 repeticiones\n" +
        "   - Descanso: 60-90 segundos entre series\n\n" +
        "2. Press de Banca Inclinado:\n" +
        "   - 4 series de 12 repeticiones\n" +
        "   - Descanso: 60-90 segundos entre series\n\n" +
        "3. Aperturas con Mancuernas:\n" +
        "   - 4 series de 12 repeticiones\n" +
        "   - Descanso: 60-90 segundos entre series\n\n" +
        "4. Fondos en Paralelas:\n" +
        "   - 4 series de 12 repeticiones\n" +
        "   - Descanso: 60-90 segundos entre series\n";
        
        textArea.setText(entrenamientoPecho);
    }    

    @FXML
    private void editar(ActionEvent event) {
        textArea.setText(textArea.getText());
        Utils.showAlert("Rutina modificado con exito");
    }

    @FXML
    private void volver(ActionEvent event) {
        Stage stage = (Stage) root.getScene().getWindow();
        stage.hide();
    }
    
}
