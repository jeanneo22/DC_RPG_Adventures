/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Personagens.Viloes;

import Fases.Mapa;
import Fases.Ponto;
import Personagens.Herois.Heroi;
import Personagens.Personagem;
import java.util.ArrayList;

/**
 *
 * @author Jeanne
 */
public class Amazo extends Vilao{
    private ArrayList <String> naturalAbilities;
    
    public Amazo(int villainPoints, String name, float height, int reflexes, int physique, int knowledge, int perception, int presence, int speed, int unarmedBDV, int p_l_bonus, int characterPoints, int currentResistence,float x,float y) {
        super(villainPoints, name, height, reflexes, physique, knowledge, perception, presence, speed, unarmedBDV, p_l_bonus, characterPoints, currentResistence,x,y);
        this.naturalAbilities = new ArrayList<>();
        inicializaNaturalAbilities();
    }

    public Amazo() {
        super();
        this.naturalAbilities = new ArrayList<>();
    }

    public Amazo(Amazo amazoOriginal) {
        super(amazoOriginal);
        this.naturalAbilities = new ArrayList<>();
        this.naturalAbilities.addAll(amazoOriginal.naturalAbilities);
    }

    public void setNaturalAbilities(ArrayList<String> naturalAbilities) {
        this.naturalAbilities = naturalAbilities;
    }

    public ArrayList<String> getNaturalAbilities() {
        return naturalAbilities;
    }
    
    public void inicializaNaturalAbilities() {
        this.naturalAbilities.add("Android Package");
    }
    
    @Override
    public void atacar(ArrayList <Personagem> timePersonagens) {
        boolean ehHeroi = false;
        float dist = 0.0f;
        int i =0;
        while(!ehHeroi && dist > Mapa.getDIST_MAX_PARA_ATAQUE() && i < Personagem.MAX_PERSONAGENS_TIME) {
             if(timePersonagens.get(i) instanceof Heroi) {
                 ehHeroi = true;
                 dist = Ponto.distancia(this.getPosicao(),timePersonagens.get(i).getPosicao());
             }
             i++;
        }
        if(ehHeroi && dist <= Mapa.getDIST_MAX_PARA_ATAQUE()) {
            System.out.println("Atacar");
            if(!timePersonagens.get(i).isDefesaAtiva()) {
                timePersonagens.get(i).setCurrentResistence(timePersonagens.get(i).getCurrentResistence()-10);
            }
        }
           
    }

    @Override
    public void defender() {
        this.defesaAtiva = true;
        System.out.println("Defendendo-se");
    }

    @Override
    public void mover() {
        this.setPosicaoPersonagem(this.posicaoPersonagem.getX()+10,this.posicaoPersonagem.getY()+10);
        System.out.println("Amazo movendo-se");
    }
    
    @Override
    public void inicializaPoderes() {
        this.powers.add("Mimicry");
    }
    
    @Override
    public String toString() {
        String s;
        s = "\nAmazo";
        s += super.toString();
        s  += "\nPoderes: "+this.powers.toString()+"\nNatural Abilities: "+this.naturalAbilities.toString();
        return s;
    }
    
}
