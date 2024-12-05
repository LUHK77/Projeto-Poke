/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.Poke;

import Models.Ataque.ArmaduraDeMadeira;
import Models.Ataque.Ataque;
import Models.Ataque.SocoForte;

/**
 *
 * @author Aluno
 */
public class Papaco extends Poke {

    public Papaco() {
        this.setId(2);
        this.setNome("Papaco");
        this.setTipo("grama");
        this.setAtaqueBase(9);
        this.setStamina(12);
        this.setMaxStamina(12);
        this.setHp(35);
        this.setMaxHp(35);
        this.setCd(6);
        this.setImagePath("/img/poke_02.png");
        this.setAtkPrimario(new SocoForte(this.getAtaqueBase()));
        this.setAtkSecundario(new ArmaduraDeMadeira(this.getCd()));
    }

    @Override
    public boolean atacarPrimario(Poke inimigo) {
        if (this.consumoStamina(atkPrimario.getCusto())) {
            this.atkPrimario.acao(inimigo);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean atacarSecundario(Poke Inimigo) {
        if (this.consumoStamina(atkSecundario.getCusto())) {
            int nCd = this.atkSecundario.acao();
            this.setCd(nCd);
            return true;
        } else {
            return false;
        }
    }
}
