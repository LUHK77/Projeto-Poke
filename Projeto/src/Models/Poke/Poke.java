/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.Poke;

import Models.Ataque.Ataque;
import java.util.Random;

/**
 *
 * @author Aluno
 */
public abstract class Poke {

    private int id;
    private String nome;
    private String tipo;
    private int ataqueBase;
    private int stamina;
    private int maxStamina;
    private double hp;
    private double maxHp;
    private int cd;
    private Ataque atkPrimario;
    private Ataque atkSecundario;
    private String imagePath;
    
    public Poke(int id, String nome, String tipo, int ataqueBase, int stamina, double hp, String imagePath) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.ataqueBase = ataqueBase;
        this.stamina = stamina;
        this.hp = hp;
        this.imagePath = imagePath;
        this.maxHp += hp;
        this.maxStamina += stamina;
    }

    public Poke() {
        //Vazio
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMaxStamina() {
        return maxStamina;
    }

    public void setMaxStamina(int maxStamina) {
        this.maxStamina = maxStamina;
    }

    public double getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(double maxHp) {
        this.maxHp = maxHp;
    }

    public int getCd() {
        return cd;
    }

    public void setCd(int cd) {
        this.cd = cd;
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

    public abstract boolean atacar(Poke oponente);
    
    public abstract boolean atacar();

    public boolean descansar() {
        this.stamina += maxStamina * 0.3;
        if (this.stamina > maxStamina) {
            this.stamina = maxStamina;
        } else if (this.stamina == maxStamina) {
            return false;
        }
        return true;
    }

}
