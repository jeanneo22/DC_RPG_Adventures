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
public class LexLuthor extends Vilao{
    private ArrayList <String> equipment;

       public LexLuthor(int villainPoints, String name, float height, int reflexes, int physique, int knowledge, int perception, int presence, int speed, int unarmedBDV, int p_l_bonus, int characterPoints, int currentResistence,float x,float y) {
        super(villainPoints, name, height, reflexes, physique, knowledge, 
                perception, presence, speed, unarmedBDV, p_l_bonus, characterPoints, 
                currentResistence,x,y);
        this.equipment = new ArrayList<>();
        inicializaEquipment();
    }

    public LexLuthor() {
        super();
        this.equipment = new ArrayList<>();
    }

    public LexLuthor(LexLuthor lexLuthorOriginal) {
        super(lexLuthorOriginal);
        this.equipment = new ArrayList<>();
        this.equipment.addAll(lexLuthorOriginal.equipment);
    }
    
    public ArrayList<String> getEquipment() {
        return equipment;
    }

    public void setEquipment(ArrayList<String> equipment) {
        this.equipment = equipment;
    }
    
    public void inicializaEquipment() {
        this.equipment.add("Costume Battle Lexoriano");
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
        System.out.println("Lex Luthor movendo-se");
    }
    
    @Override
    public void inicializaPoderes() {
        this.powers.addAll(null);
    }
    
    @Override
    public String toString() {
        String s;
        s = "\nLex Luthor";
        s += super.toString();
        s  += "\nEquipments: "+this.equipment.toString();
        return s;
    }
    
}
