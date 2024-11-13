/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Aluno
 */
public class Poke {
    
    private int id;
    private String nome;
    private String tipo;
    private int ataqueBase;
    private int stamina;
    private double hp;
    private String imagePath;

    public Poke(int id,String nome, String tipo, int ataqueBase, int stamina, double hp,String imagePath) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.ataqueBase = ataqueBase;
        this.stamina = stamina;
        this.hp = hp;
        this.imagePath = imagePath;
    }
    
    public Poke(){
    //Vazio
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAtaqueBase() {
        return ataqueBase;
    }

    public void setAtaqueBase(int ataqueBase) {
        this.ataqueBase = ataqueBase;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }    
}
