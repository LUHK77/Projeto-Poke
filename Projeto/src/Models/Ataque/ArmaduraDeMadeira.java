/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.Ataque;

import Models.Poke.Poke;

/**
 *
 * @author Aluno
 */
public class ArmaduraDeMadeira extends Ataque {
    private int pokeCd;
    private final int duracaoPorTurno = 5;

    public ArmaduraDeMadeira(int pokeCd) {
        this.setNome("Armadura De Madeira");
        this.setEfeito("defensivo");
        this.setValor(7);
        this.setCusto(10);
        this.setPokeCd(pokeCd);
    }

    public int getPokeCd() {
        return pokeCd;
    }

    public void setPokeCd(int pokeCd) {
        this.pokeCd = pokeCd;
    }
    
    
    public int getDuracaoPorTurno(){
        return duracaoPorTurno;
    }
  
    @Override
    public boolean acao(Poke inimigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean acao() {
        int cd = poke.getCd + this.valor;
        poke.setCd(cd);
        return true;
    }
    
}

   
    

