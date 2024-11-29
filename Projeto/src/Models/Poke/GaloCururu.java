/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.Poke;

import Models.Ataque.Ataque;
import Models.Ataque.GarraDeFogo;
import Models.Ataque.SocoNormal;

/**
 *
 * @author Aluno
 */
public class GaloCururu extends Poke {

    private Ataque atkPrimario = new SocoNormal(this.getAtaqueBase());
    private Ataque atkSecundario = new GarraDeFogo(this.getAtaqueBase());

    public GaloCururu() {
        this.setNome("Galo Cururu");
        this.setTipo("fogo");
        this.setAtaqueBase(8);
        this.setStamina(16);
        this.setMaxStamina(16);
        this.setHp(20);
        this.setMaxHp(20);
        this.setCd(5);
        this.setImagePath("/img/poke_01.png");
    }

    public boolean Atacar1(Poke inimigo) {
        if (this.consumoStamina(atkPrimario.getCusto())) {
            this.atkPrimario.acao(inimigo);
            return true;
        } else {
            return false;
        }
    }

    public boolean Atacar2(Poke inimigo) {
        if (this.consumoStamina(atkSecundario.getCusto())) {
            this.atkSecundario.acao(inimigo);
            return true;
        } else {
            return false;
        }
    }
}
