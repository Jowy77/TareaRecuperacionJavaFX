package com.mycompany.tarearecuperarinterfazjavafx;

import com.mycompany.tarearecuperarinterfazjavafx.utils.Utils;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Iproy
 */
public class LoginViewController implements Initializable {

    @FXML
    private Label aquiLabel;
    @FXML
    private TextField usuarioTextField;
    @FXML
    private PasswordField contrasenaField;
    @FXML
    private AnchorPane root;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        aquiLabel.setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent event) {

                // Aquí abrimos la nueva ventana
                Stage stage = new Stage();

                Scene scene;
                try {
                    scene = new Scene(loadFXML("NuevoUsuarioView"));
                    stage.setScene(scene);
                    stage.show();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            }
        });
    }

    @FXML
    private void abrirCrearUsuario(MouseEvent event) {
    }

    @FXML
    private void salir(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    private void login(ActionEvent event) throws IOException {
        if (Utils.isNullOrEmpty(usuarioTextField.getText())) {
            Utils.showAlert("El campo de usuario no puede estar vacio.");
        } else if (Utils.isNullOrEmpty(contrasenaField.getText())) {
            Utils.showAlert("La contraseña no puede estar vacia.");
        } else {
            Utils.showAlert("Usuario logeado con exito.");
            Stage stage = new Stage();

            Scene scene;

            try {
                scene = new Scene(loadFXML("MainView"));
                stage.setScene(scene);
                stage.show();
                
                stage = (Stage) root.getScene().getWindow();
                stage.hide();

            stage.hide();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

}
