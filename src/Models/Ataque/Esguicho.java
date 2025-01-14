package Models.Ataque;

import Models.Poke.Poke;

public class Esguicho extends Ataque{

    public Esguicho(int pokeAtaque) {
        this.setNome("Esguicho");
        this.setEfeito("ofensivo");
        this.setValor(4);
        this.setCusto(6);
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
            if(inimigo.getTipo().equals("fogo")){
            dano *= 2;
            }
            //Chance de dar dano critico
            if (probabilidade == 18) {
                dano *= 2.0;
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

