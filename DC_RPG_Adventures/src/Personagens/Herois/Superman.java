/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Personagens.Herois;

import Fases.Mapa;
import Fases.Ponto;
import Personagens.Personagem;
import Personagens.Viloes.Vilao;

/**
 *
 * @author Jeanne
 */
public class Superman extends Heroi{

    public Superman(int heroPoints, String name, float height, int reflexes, int physique, int knowledge, int perception, int presence, int speed, int unarmedBDV, int p_l_bonus, int characterPoints, int currentResistence,float x,float y) {
        super(heroPoints, name, height, reflexes, physique, knowledge, perception, presence, speed, unarmedBDV, p_l_bonus, characterPoints, currentResistence,x,y);
    }

    public Superman() {
        super();
    }

    public Superman(Superman supermanOriginal) {
        super(supermanOriginal);
    }
    
    @Override
    public void atacar(Personagem timePersonagens[]) {
        boolean ehVilao = false;
        float dist = 0.0f;
        int i =0;
        while(!ehVilao && dist > Mapa.getDIST_MAX_PARA_ATAQUE() && i < Personagem.MAX_PERSONAGENS_TIME) {
             if(timePersonagens[i] instanceof Vilao) {
                 ehVilao = true;
                 dist = Ponto.distancia(this.getPosicao(),timePersonagens[i].getPosicao());
             }
             i++;
        }
        if(ehVilao && dist <= Mapa.getDIST_MAX_PARA_ATAQUE()) {
            System.out.println("Atacar");
            if(!timePersonagens[i].isDefesaAtiva()) {
                timePersonagens[i].setCurrentResistence(timePersonagens[i].getCurrentResistence()-10);
            }
        }
           
    }

    @Override
    public void defender() {
        this.setDefesaAtiva(true);
        System.out.println("Defendendo-se");
    }
    
    @Override
    public void mover() {
        this.setPosicaoPersonagem(this.posicaoPersonagem.getX()+10,this.posicaoPersonagem.getY()+10);
        System.out.println("Superman movendo-se");
    }
    
    @Override
    public String toString() {
        String s;
        s = "\nSuperman";
        s += super.toString();
        return s;
    }

    @Override
    public void inicializaPoderes() {
        this.powers.add("Flight");
        this.powers.add("Ice Manipulation");
        this.powers.add("Immunity");
        this.powers.add("Invulnerability");
        this.powers.add("Microwave Projection");
        this.powers.add("Speed Manipulation (supermobility, superactions)");
        this.powers.add("X-Ray Vision");   
    }
    
}
