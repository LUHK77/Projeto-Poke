/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Controllers.PokeController;
import Models.Poke;
import Models.PokeDAO;
import Views.PokeView;
import java.util.Optional;




/**
 *
 * @author Aluno
 */
public class Projeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       //int probabilidade = (int) (Math.random() * 20) + 1;
        //System.out.println(probabilidade);
        
        PokeDAO pokeDAO = new PokeDAO();
        PokeController pokeController = new PokeController(pokeDAO);
        PokeView pokeView = new PokeView(pokeController);
        
        pokeView.listarTodos();
        Poke p1 = pokeController.selecionar(1);
        System.out.println("Nome: " + p1.getNome());
        
                
        
    }
    
}
