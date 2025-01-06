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

public abstract class Ataque {
    
    private String nome;
    private String efeito;
    private int valor;
    private int custo;
    private int ataqueBase;

    public Ataque() {
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

    public int getAtaqueBase() {
        return ataqueBase;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEfeito(String efeito) {
        this.efeito = efeito;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setCusto(int custo) {
        this.custo = custo;
    }

    public void setAtaqueBase(int ataqueBase) {
        this.ataqueBase = ataqueBase;
    }
    
    public abstract boolean acao(Poke inimigo);
    
    public abstract int acao();
    
    
    
}
