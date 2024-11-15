/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Aluno
 */
public class Ataque {
    private int id;
    private String nome;
    private String efeito;
    private int valor;
    private int custo;
    private int pokeId;

    public Ataque(int id, String nome, String efeito, int valor, int custo, int pokeId) {
        this.id = id;
        this.nome = nome;
        this.efeito = efeito;
        this.valor = valor;
        this.custo = custo;
        this.pokeId = pokeId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEfeito() {
        return efeito;
    }

    public void setEfeito(String efeito) {
        this.efeito = efeito;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getCusto() {
        return custo;
    }

    public void setCusto(int custo) {
        this.custo = custo;
    }

    public int getPokeId() {
        return pokeId;
    }

    public void setPokeId(int pokeId) {
        this.pokeId = pokeId;
    }
    
    
    
}
