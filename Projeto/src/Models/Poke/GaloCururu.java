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
        this.setAtkPrimario(new SocoNormal(this.getAtaqueBase()));
        this.setAtkPrimario(new GarraDeFogo(this.getAtaqueBase()));
    }

    @Override
    public boolean atacarPrimario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean atacarSecundario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
