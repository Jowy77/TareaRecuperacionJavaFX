package com.mycompany.tarearecuperarinterfazjavafx.utils;

import java.util.Optional;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;

public class Utils {

    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    public static void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Información");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
    
    public static String showTextInputDialog(String promptText) {
        // Crear un TextInputDialog con el mensaje proporcionado
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Introducir texto");
        dialog.setHeaderText(null);
        dialog.setContentText(promptText);

        // Mostrar el diálogo y esperar a que el usuario introduzca el texto
        Optional<String> result = dialog.showAndWait();

        // Devolver el texto introducido por el usuario, o una cadena vacía si se cancela el diálogo
        return result.orElse("");
    }
}
