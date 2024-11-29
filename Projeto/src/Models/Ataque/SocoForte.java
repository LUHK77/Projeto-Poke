/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.Ataque;

import Models.Ataque.Ataque;
import Models.Poke.Poke;

/**
 *
 * @author Aluno
 */
public class SocoForte extends Ataque {

    public SocoForte(int pokeAtaque) {
        this.setNome("Soco Forte");
        this.setEfeito("ofensivo");
        this.setValor(6);
        this.setCusto(8);
        this.setAtaqueBase(pokeAtaque);
    }

    @Override
    public boolean acao(Poke inimigo) {
        double dano = this.getValor() + this.getAtaqueBase();
        double hpInimigo = inimigo.getHp();
        int probabilidade = (int) (Math.random() * 20) + 1;
        //Chance de Errar o  ataque
        if (probabilidade < inimigo.getCd()) {
            return false;
        } else {
            //Chance de dar dano critico
            if (probabilidade == 20) {
                dano *= 2;
            }
            inimigo.setHp(hpInimigo - dano);
            //Caso o oponente seja derrotado
            if (hpInimigo < 0) {
                inimigo.setHp(0);
            }
            return true;
        }
    }

    @Override
    public boolean acao() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}