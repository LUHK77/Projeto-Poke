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
public class GarraDeFogo extends Ataque {

   public GarraDeFogo(int pokeAtaque) {
        this.setNome("Garra de Fogo");
        this.setEfeito("ofensivo");
        this.setValor(7);
        this.setCusto(9);
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
            if(inimigo.getTipo().equals("grama")){
            dano *= 1.5;
            }
            //Chance de dar dano critico
            if (probabilidade == 20) {
                dano *= 2.5;
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
    public int acao() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
    

