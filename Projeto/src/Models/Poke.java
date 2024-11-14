/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.Random;

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
    private int maxStamina;
    private double hp;
    private int maxHp;
    private String imagePath;
    private int esquiva = 5;

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

    public boolean atacar(Ataque a, Poke oponente) {
        this.stamina -= a.getCusto();
        switch (a.getEfeito()) {
            case "ofensivo" -> {
                double dano = a.getValor() + this.ataqueBase;
                double hpOponente = oponente.getHp();
                int probabilidade = (int) (Math.random() * 20) + 1;
                //Chance de Errar o  ataque
                if (probabilidade < this.esquiva) {
                    return false;
                }
                //Chance de dar dano critico
                if (probabilidade == 20) {
                    dano *= 2;
                }
                oponente.setHp(hpOponente - dano);
                //Caso o oponente seja derrotado
                if (hpOponente < 0) {
                    oponente.setHp(0);
                }
            }
            case "cura" -> {
                this.hp += a.getValor();
                if(this.hp > this.maxHp){
                this.hp = this.maxHp;
                }
            }
            case "defensivo" -> {
                this.esquiva += a.getValor();
            }
            case "suporte" -> {
                this.ataqueBase += a.getValor();
            }

        }
        return true;
    }

    public boolean descansar() {
        this.stamina = +5;
        if (this.stamina > maxStamina) {
            this.stamina = maxStamina;
        }
        return true;
    }

}
