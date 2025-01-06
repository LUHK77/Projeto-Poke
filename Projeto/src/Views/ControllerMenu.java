/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Views;

import Controllers.PokeDaoController;
import java.awt.event.ActionEvent;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author Aluno
 */
public class ControllerMenu {
    @FXML
    private Label lblNome;   
    @FXML
    private Button btnSelecionar;
    
    public void trocarNome(ActionEvent event)throws IOException{
        System.out.println("Meu pai ta duro");
     }
}
