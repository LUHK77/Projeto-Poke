/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Models.Ataque;
import Models.Poke;
import Models.PokeDAO;
import java.util.ArrayList;
import java.util.Optional;

/**
 *
 * @author Aluno
 */
public class PokeController {
    private Poke poke;
    private PokeDAO pokeDao;

    public PokeController(Poke poke, PokeDAO pokeDao) {
        this.poke = poke;
        this.pokeDao = pokeDao;
    }
    
    public boolean atacar(Ataque a,Poke oponente){
    return poke.atacar(a, oponente);
    } 
    
    public boolean descansar(){
    return poke.descansar();
    }
    
    public ArrayList<Poke> getStatus(){
    return pokeDao.getStatus();
    }
    
    public Optional<Poke> selecionar(int id){
     return pokeDao.selectPoke(id);
    }
 }
