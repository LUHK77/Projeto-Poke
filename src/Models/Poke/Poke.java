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
    private String apelido;
    private String nome;
    private String tipo;
    private int level;
    private int exp;
    private int ataqueBase;
    private int stamina;
    private int maxStamina;
    private double hp;
    private int maxHp;
    private int cd;
    public Ataque atkPrimario;
    public Ataque atkSecundario;
    private String imagePath;
    
    public Poke() {
     //Vazio
    }

    public Poke(String apelido,int level,int exp,int stamina,double hp) {
        this.apelido = apelido;
        this.level = level;
        this.exp = exp;
        this.stamina = stamina;
        this.hp = hp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }
    
    public int getMaxStamina() {
        return maxStamina;
    }

    public void setMaxStamina(int maxStamina) {
        this.maxStamina = maxStamina;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
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

    public Ataque getAtkPrimario() {
        return atkPrimario;
    }

    public void setAtkPrimario(Ataque atkPrimario) {
        this.atkPrimario = atkPrimario;
    }

    public Ataque getAtkSecundario() {
        return atkSecundario;
    }

    public void setAtkSecundario(Ataque atkSecundario) {
        this.atkSecundario = atkSecundario;
    }
    
    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
    
    public abstract boolean atacarPrimario(Poke inimigo);
   
    public abstract boolean atacarSecundario(Poke inimigo);

    public boolean descansar() {
        this.stamina += maxStamina * 0.3;
        if (this.stamina > maxStamina) {
            this.stamina = maxStamina;
        } else if (this.stamina == maxStamina) {
            return false;
        }
        return true;
    }
    
    public boolean consumoStamina(int custo){
    int staminaR = this.stamina - custo;
        if (staminaR > this.stamina) {
            return false;
    } else {
            this.setStamina(staminaR);
            return true;
        }

    }
}
