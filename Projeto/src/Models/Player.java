/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import Models.Ataque.Ataque;
import Models.Poke.Poke;

/**
 *
 * @author Aluno
 */
public class Player {
    
    public Poke poke;
    public Ataque ataquePrimario;
    public Ataque ataqueSecundario;

    public Player(Poke poke, Ataque ataquePrimario, Ataque ataqueSecundario) {
        this.poke = poke;
        this.ataquePrimario = ataquePrimario;
        this.ataqueSecundario = ataqueSecundario;
    }
    
}
