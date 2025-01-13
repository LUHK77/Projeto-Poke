package Models.Ataque;

import Models.Poke.Poke;



public class SoproDeRaio extends Ataque{
    
 public SoproDeRaio(int pokeAtaque) {
        this.setNome("Sopro de Raio");
        this.setEfeito("ofensivo");
        this.setValor(7);
        this.setCusto(8);
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
            if(inimigo.getTipo().equals("agua")){
            dano *= 2;
            }
            //Chance de dar dano critico
            if (probabilidade == 20) {
                dano *= 2.5;
            }
            inimigo.setHp(hpInimigo - dano);
            //eu nao sei cade o errokkkkkkkkk ta dizendo que tu alterou hp de double pra int, e a img dos poke n ta funcionando e eu nao sei o pq
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
   

