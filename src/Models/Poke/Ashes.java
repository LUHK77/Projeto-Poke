package Models.Poke;

import Models.Ataque.Ataque;
import Models.Ataque.SocoNormal;
import Models.Ataque.SoproDeRaio;

public class Ashes extends Poke{

    public Ashes(String apelido,int level,int exp,int hp,int stamina) {
        
        //Parte recebida na classe
        this.setApelido(apelido);
        this.setLevel(level);
        this.setExp(exp);
        this.setHp(hp);
        this.setStamina(stamina);
        //Parte ja setada
        this.setId(4);
        this.setNome("Ashes");
        this.setTipo("eletrico");
        this.setAtaqueBase(11);
        this.setMaxStamina(20);
        this.setMaxHp(15);
        this.setCd(5);
        this.setImagePath("/img/Ashes/default.gif");
        this.setAtkPrimario(new SocoNormal(this.getAtaqueBase()));
        this.setAtkSecundario(new SoproDeRaio(this.getAtaqueBase()));
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
