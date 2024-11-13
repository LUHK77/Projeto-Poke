/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Models.Game;
import Controllers.NewGameController;


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
        Game HalfLife2 = new Game();
        Game Terraria = new Game();
        Game DayOfDefeat = new Game();
         
         DayOfDefeat.__construct("Day of Defeat", 
                 "Melhor que Half-Life 2 de acordo com o Carlos",
                 "image_path", 
                 "2003/05/1",
                 "Valve Corporation",
                 20,
                 "link_path");
         
         DayOfDefeat.getName();
         DayOfDefeat.getDescription();
         DayOfDefeat.getPrice();  
       
        HalfLife2.__construct("Half-life 2",
                "Um jogo muito bom de acordo com o gabriel",
                "caminho da imagem",
                "2004/11/16",
                "Gabe Newell",
                33,
                "caminho do instalador");
        
        System.out.println("-------------------------------------------------------");
         
        HalfLife2.getName();
        HalfLife2.getRelaseDate();
        HalfLife2.getPrice();
        
        Terraria.__construct(
                "Terraria",
                "O melhor jogo que tem atualmente",
                "Caminho da imagem",
                "2009/04/18",
                "Loki",
                33,
                "Caminho da Imagem");
        
        System.out.println("-------------------------------------------------------");
        
        Terraria.getName();
        Terraria.getDescription();
        Terraria.getPrice();
        
    }
    
}
