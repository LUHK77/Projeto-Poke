/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Main;

import Controllers.PokeDaoController;
import Models.Poke.Poke;
import Models.PokeDAO;
import Views.ControllerMenu;
import java.util.Optional;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
/**
 *
 * @author Aluno
 */
public class Projeto extends Application {
   // --module-path "C:\Users\Aluno\Documents\Java libries\javafx-sdk-23.0.1\lib" --add-modules javafx.controls,javafx.fxml
    private static Scene scene;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/Views/FXML.fxml"));
        AnchorPane root = (AnchorPane) loader.load();
        
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        
        
        primaryStage.setTitle("TesteView");
         
        primaryStage.show();
      
    }
    
}