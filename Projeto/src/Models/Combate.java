/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import Models.Poke.Poke;

/**
 *
 * @author Aluno
 */
public class Combate {
    
    private Poke p1;
    private Poke p2;
    private int turnos = 0;

    public Combate(Poke p1, Poke p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Poke getP1() {
        return p1;
    }

    public void setP1(Poke p1) {
        this.p1 = p1;
    }

    public Poke getP2() {
        return p2;
    }

    public void setP2(Poke p2) {
        this.p2 = p2;
    }

    public int getTurnos() {
        return turnos;
    }

    public void setTurnos(int turnos) {
        this.turnos = turnos;
    }
    
    public void startCombat(){
    
    }
    
}
