/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.Poke;

import Models.Ataque.ArmaduraDeMadeira;
import Models.Ataque.Ataque;
import Models.Ataque.PataDeGrama;
import Models.Ataque.SocoForte;

/**
 *
 * @author Aluno
 */
public class Papaco extends Poke {

    public Papaco(String apelido,int level,int exp,int hp,int stamina) {
        //Parte recebida na classe
        this.setApelido(apelido);
        this.setLevel(level);
        this.setExp(exp);
        this.setHp(hp);
        this.setStamina(stamina);
        //Parte ja setada
        this.setId(2);
        this.setNome("Papaco");
        this.setTipo("grama");
        this.setAtaqueBase(9);
        this.setMaxStamina(12);
        this.setMaxHp(120);
        this.setCd(6);
        this.setImagePath("/img/Papaco/default.gif");
        this.setAtkPrimario(new SocoForte(this.getAtaqueBase()));
        this.setAtkSecundario(new PataDeGrama(this.getAtaqueBase()));
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
       if (this.consumoStamina(atkSecundario.getCusto())) {
            this.atkSecundario.acao(inimigo);
            return true;
        } else {
            return false;
        }
     }
    }

