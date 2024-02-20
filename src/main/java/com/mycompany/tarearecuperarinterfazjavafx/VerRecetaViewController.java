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
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Iproy
 */
public class VerRecetaViewController implements Initializable {

    @FXML
    private TextArea textArea;
    @FXML
    private AnchorPane root;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        String recetaArrozConPollo
                = "Receta de Arroz con Pollo:\n\n"
                + "Ingredientes:\n"
                + "- 2 tazas de arroz\n"
                + "- 500 gramos de pechuga de pollo\n"
                + "- 1 cebolla picada\n"
                + "- 2 dientes de ajo picados\n"
                + "- 1 pimiento rojo picado\n"
                + "- 1 zanahoria cortada en cubitos\n"
                + "- 1 taza de guisantes\n"
                + "- 2 tazas de caldo de pollo\n"
                + "- Sal al gusto\n"
                + "- Pimienta al gusto\n"
                + "- Aceite de oliva\n\n"
                + "Instrucciones:\n"
                + "1. En una olla grande, calienta un poco de aceite de oliva a fuego medio. Agrega la cebolla, el ajo y el pimiento rojo, y cocina hasta que estén tiernos.\n"
                + "2. Añade el pollo cortado en trozos y cocina hasta que esté dorado por todos lados.\n"
                + "3. Agrega el arroz a la olla y cocina durante unos minutos, revolviendo constantemente.\n"
                + "4. Incorpora la zanahoria, los guisantes y el caldo de pollo. Condimenta con sal y pimienta al gusto.\n"
                + "5. Lleva la mezcla a ebullición, luego reduce el fuego, tapa la olla y cocina a fuego lento durante aproximadamente 20 minutos, o hasta que el arroz esté cocido y el líquido se haya absorbido por completo.\n"
                + "6. Una vez listo, retira del fuego y deja reposar durante unos minutos antes de servir.\n"
                + "7. ¡Disfruta tu delicioso arroz con pollo!";

        textArea.setText(recetaArrozConPollo);
    }

    @FXML
    private void editar(ActionEvent event) {
        textArea.setText(textArea.getText());
        Utils.showAlert("Receta modificada con exito.");

    }

    @FXML
    private void volver(ActionEvent event) {
        Stage stage = (Stage) root.getScene().getWindow();
        stage.hide();
    }

}
