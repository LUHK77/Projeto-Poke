package Models.Poke;

import Models.Ataque.Ataque;
import Models.Ataque.SocoNormal;
import Models.Ataque.Esguicho;

public class Piracu extends Poke{

     public Piracu(String apelido,int level,int exp,int hp,int stamina) {
        
        //Parte recebida na classe
        this.setApelido(apelido);
        this.setLevel(level);
        this.setExp(exp);
        this.setHp(hp);
        this.setStamina(stamina);
        //Parte ja setada
        this.setId(3);
        this.setNome("Piracu");
        this.setTipo("agua");
        this.setAtaqueBase(6);
        this.setMaxStamina(25);
        this.setMaxHp(26);
        this.setCd(8);
        this.setImagePath("/img/Piracu/default.gif");
        this.setAtkPrimario(new SocoNormal(this.getAtaqueBase()));
        this.setAtkSecundario(new Esguicho(this.getAtaqueBase()));
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
            this.setStamina(11);
            this.atkSecundario.acao(inimigo);
            return true;
        } else {
            return false;
        }
    }
    
    
}
     

