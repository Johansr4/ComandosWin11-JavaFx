package com.example.comandoswin11;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;

import java.io.IOException;

public class ComandosController {
    @FXML
    private Label Comando1;
    @FXML
    private Label Comando2;
    @FXML
    private Label Comando3;



    public void onComando1Click(ActionEvent event) {
        executeCommand("tasklist > procesos.txt", Comando1);
    }

    public void onComando2Click(ActionEvent event) {
        executeCommand("systeminfo > informacionSistema.txt", Comando2);
    }

    public void onComando3Click(ActionEvent event) {
        executeCommand("dir > directorio.txt", Comando3);
    }

    private void executeCommand(String command, Label label) {
        try {
            Process process = Runtime.getRuntime().exec("cmd.exe /c " + command);
            int exitCode = process.waitFor();
            if (exitCode == 0) {
                label.setText("Comando ejecutado con exito.");
            } else {
                label.setText("Error al ejecutar el comando.");
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            label.setText("Error al ejecutar el comando.");
        }
    }
}
