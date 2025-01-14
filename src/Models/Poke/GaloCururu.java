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

    public GaloCururu(String apelido,int level,int exp,int hp,int stamina) {
        //Parte recebida na classe
        this.setApelido(apelido);
        this.setLevel(level);
        this.setExp(exp);
        this.setHp(hp);
        this.setStamina(stamina);
        //Parte ja setada
        this.setId(1);
        this.setNome("Galo Cururu");
        this.setTipo("fogo");
        this.setAtaqueBase(8);
        this.setMaxStamina(16);
        this.setMaxHp(70);
        this.setCd(5);
        this.setImagePath("/img/GaloCururu/default.gif");
        this.setAtkPrimario(new SocoNormal(this.getAtaqueBase()));
        this.setAtkSecundario(new GarraDeFogo(this.getAtaqueBase()));
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
    public boolean atacarSecundario(Poke inimigo) {
        if (this.consumoStamina(atkPrimario.getCusto())) {
            this.atkPrimario.acao(inimigo);
            return true;
        } else {
            return false;
        }
    }

}
