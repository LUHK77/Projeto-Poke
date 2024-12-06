/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Models.Poke.Poke;
import Models.PokeDAO;
import java.util.ArrayList;
import java.util.Optional;

/**
 *
 * @author Aluno
 */
public class PokeDaoController {
    private PokeDAO pokeDao;

    public PokeDaoController(PokeDAO pokeDao) {
        this.pokeDao = pokeDao;
    }
    
    public ArrayList<Poke> getAll(){
    return null;
    }
    
    /*public Optional<Poke> selecionarPoke(int id){
     return pokeDao.selectPoke(id);
    } */
    
    public Poke selecionar(int id){
     return pokeDao.selecionarI(id);
    }
 }
