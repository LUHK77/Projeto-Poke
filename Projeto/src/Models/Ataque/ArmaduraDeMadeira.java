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
    private final String nome = "Armadura De Madeira";
    private final String efeito = "defensivo";
    private final int valor = 7;
    private final int custo = 10;
    private final int duracaoPorTurno = 5;
    
    private final Poke poke;

    public ArmaduraDeMadeira(Poke poke) {
        this.poke = poke;
    }

    public String getNome() {
        return nome;
    }

    public String getEfeito() {
        return efeito;
    }

    public int getValor() {
        return valor;
    }

    public int getCusto() {
        return custo;
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
        int cd = poke.getCd() + this.valor;
        poke.setCd(cd);
        return true;
    }
    
}

   
    

