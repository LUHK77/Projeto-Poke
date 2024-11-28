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
public class SocoNormal extends Ataque {

    private final String nome = "Soco Normal";
    private final String efeito = "ofensivo";
    private final int valor = 2;
    private final int custo = 5;
    private int pokeAtaque;

    public SocoNormal(int pokeAtaque) {
        this.pokeAtaque = pokeAtaque;
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

    @Override
    public boolean acao(Poke inimigo) {
        double dano = this.valor + this.pokeAtaque;
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
