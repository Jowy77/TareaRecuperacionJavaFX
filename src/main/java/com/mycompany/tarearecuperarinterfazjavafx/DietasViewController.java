package com.mycompany.tarearecuperarinterfazjavafx;

import com.mycompany.tarearecuperarinterfazjavafx.utils.Utils;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Iproy
 */
public class DietasViewController implements Initializable {

    @FXML
    private MenuItem lunesMenuItem;
    @FXML
    private MenuItem martesMenuItem;
    @FXML
    private MenuItem miercolesMenuItem;
    @FXML
    private MenuItem juevesMenuItem;
    @FXML
    private MenuItem viernesMenuItem;
    @FXML
    private MenuItem sabadoMenuItem;
    @FXML
    private MenuItem domingoMenuItem;
    @FXML
    private ListView<String> listView;
    @FXML
    private AnchorPane root;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<String> items = listView.getItems();

        // Agregar elementos a la lista
        items.add("Arroz con pollo");
        items.add("Papas sanas");
        items.add("Tortilla de claras");
        items.add("Mousse proteico");
        items.add("Bizcocho proteico");
        items.add("Pescado con verduras");
    }

    @FXML
    private void borrarReceta(ActionEvent event) {
        int selectedIndex = listView.getSelectionModel().getSelectedIndex();

        if (selectedIndex != -1) { // Verificar si hay un elemento seleccionado
            // Eliminar el elemento seleccionado
            listView.getItems().remove(selectedIndex);
        }
    }

    @FXML
    private void nuevaReceta(ActionEvent event) {
        String userInput = Utils.showTextInputDialog("Introcude el nombre de la receta:");
        
        if(Utils.isNullOrEmpty(userInput)){
            Utils.showAlert("La operacion se ha cancelado o no has introducido ningun nombre para la receta");
        }else{
            listView.getItems().add(userInput);
            Utils.showAlert("Receta creada con exito");
        }
    }

    @FXML
    private void verReceta(ActionEvent event) {
        Stage stage = new Stage();

        Scene scene;

        try {
            scene = new Scene(loadFXML("verRecetaView"));
            stage.setScene(scene);
            stage.show();

            stage = (Stage) root.getScene().getWindow();
            stage.hide();

            stage.hide();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

}
