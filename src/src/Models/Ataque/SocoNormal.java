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
public class SocoNormal extends Ataque {

    public SocoNormal(int pokeAtaque) {
        this.setNome("Soco Normal");
        this.setEfeito("ofensivo");
        this.setValor(2);
        this.setCusto(5);
        this.setAtaqueBase(pokeAtaque);
    }

    @Override
    public boolean acao(Poke inimigo) {
        int dano = this.getValor() + this.getAtaqueBase();
        int hpInimigo = inimigo.getHp();
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
    public int acao() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
