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
public class GaloCururu extends Poke{
    
    private Poke inimigo;
    private Ataque atkPrimario = new SocoNormal(this.getAtaqueBase());
    private Ataque atkSecundario = new GarraDeFogo(this.inimigo);

    public GaloCururu(Poke inimigo) {
        this.inimigo = inimigo;
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
    

    public void Atacar1(){
    this.atkPrimario.acao(inimigo);
    }
    
}
