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
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Iproy
 */
public class NuevoUsuarioViewController implements Initializable {

    @FXML
    private TextField nombreTextField;
    @FXML
    private TextField usuarioTextField;
    @FXML
    private TextField contrasenaTextField;
    @FXML
    private Slider edadSlider;
    @FXML
    private Slider pesoSlider;
    @FXML
    private AnchorPane root;
    @FXML
    private Label edadLabel;
    @FXML
    private Label pesoLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        edadLabel.textProperty().bind(edadSlider.valueProperty().asString("%.0f años"));
        pesoLabel.textProperty().bind(pesoSlider.valueProperty().asString("%.0f kg"));
    }

    @FXML
    private void salir(ActionEvent event) {
        Stage stage = (Stage) root.getScene().getWindow();

        stage.hide();
    }

    @FXML
    private void alta(ActionEvent event) {

        if (Utils.isNullOrEmpty(nombreTextField.getText())) {
            Utils.showAlert("El nombre no puede estar vacio.");
        } else if (Utils.isNullOrEmpty(usuarioTextField.getText())) {
            Utils.showAlert("El usuario no puede estar vacio.");
        } else if (Utils.isNullOrEmpty(contrasenaTextField.getText())) {
            Utils.showAlert("La contraseña no puede estar vacia");
        } else {
            Utils.showAlert("Usuario creado con exito");
            Stage stage = (Stage) root.getScene().getWindow();

            stage.hide();
        }
    }

}
