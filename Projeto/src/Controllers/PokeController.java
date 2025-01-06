/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Models.Poke.Poke;

/**
 *
 * @author Aluno
 */
public class PokeController {
    private final Poke poke;

    public PokeController(Poke poke) {
        this.poke = poke;
    }
    
    public boolean atacarPrimario(Poke inimigo){
    return poke.atacarPrimario(inimigo);
    }
    
    public boolean atacarSecundario(Poke inimigo){
    return poke.atacarSecundario(inimigo);
    }
    
    public boolean descansar(){
    return poke.descansar();
    }
}
