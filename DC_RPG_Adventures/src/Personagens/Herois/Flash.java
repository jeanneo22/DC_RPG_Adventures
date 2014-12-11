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
import java.util.ArrayList;

/**
 *
 * @author Jeanne
 */
public class Flash extends Heroi{
    private ArrayList <String> equipment;

    public Flash(int heroPoints, String name, float height, int reflexes, int physique, int knowledge, int perception, int presence, int speed, int unarmedBDV, int p_l_bonus, int characterPoints, int currentResistence,float x,float y) {
        super(heroPoints, name, height, reflexes, physique, 
              knowledge, perception, presence, speed, unarmedBDV, p_l_bonus, 
              characterPoints, currentResistence,x,y);
        this.equipment = new ArrayList<>();
        inicializaEquipment();
    }

    public Flash() {
        super();
        this.equipment = new ArrayList<>();
    }

    public Flash(Flash flashOriginal) {
        super(flashOriginal);
        this.equipment = new ArrayList<>();
        this.equipment.addAll(flashOriginal.equipment);
    }

    public ArrayList<String> getEquipment() {
        return equipment;
    }

    public void setEquipment(ArrayList<String> equipment) {
        this.equipment = equipment;
    }
    
    public void inicializaEquipment() {
        this.equipment.add("costume");
    }
    
    @Override
    public void atacar(ArrayList <Personagem> timePersonagens) {
        boolean ehVilao = false;
        float dist = 0.0f;
        int i =0;
        while(!ehVilao && dist > Mapa.getDIST_MAX_PARA_ATAQUE() && i < Personagem.MAX_PERSONAGENS_TIME) {
             if(timePersonagens.get(i) instanceof Vilao) {
                 ehVilao = true;
                 dist = Ponto.distancia(this.getPosicao(),timePersonagens.get(i).getPosicao());
             }
             i++;
        }
        if(ehVilao && dist <= Mapa.getDIST_MAX_PARA_ATAQUE()) {
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
        System.out.println("Flash movendo-se");
    }
    
    @Override
    public String toString() {
        String s;
        s = "\nFlash";
        s += super.toString();
        s  += "\nEquipaments: "+this.equipment.toString();
        return s;
    }

    @Override
    public void inicializaPoderes() {
        this.powers.add("Healing");
        this.powers.add("Speed Manipulation");
        this.powers.add("Sustenance");
    }
    
    
}
