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

    public GaloCururu(String apelido,int level,int exp,int stamina,double hp) {
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
        this.setStamina(16);
        this.setMaxStamina(16);
        this.setHp(20);
        this.setMaxHp(20);
        this.setCd(5);
        this.setImagePath("poke_01.png");
        this.setAtkPrimario(new SocoNormal(this.getAtaqueBase()));
        this.setAtkPrimario(new GarraDeFogo(this.getAtaqueBase()));
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
