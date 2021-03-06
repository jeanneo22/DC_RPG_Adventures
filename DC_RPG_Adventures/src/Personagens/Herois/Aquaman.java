/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Personagens.Herois;

import Personagens.Personagem;
import Personagens.Viloes.Vilao;
import Fases.*;
import java.util.ArrayList;

/**
 *
 * @author Jeanne
 */
public class Aquaman extends Heroi{
    private ArrayList <String> naturalAbilities;
    private ArrayList <String> equipment;

    public Aquaman(int heroPoints, String name, float height, int reflexes, int physique, int knowledge, int perception, int presence, int speed, int unarmedBDV, int p_l_bonus, int characterPoints, int currentResistence, float x, float y) {
        super(heroPoints, name, height, reflexes, physique, knowledge, perception, presence, speed, unarmedBDV, p_l_bonus, characterPoints, currentResistence, x, y);
        this.naturalAbilities = new ArrayList<>();
        this.equipment = new ArrayList<>();
        inicializaNaturalAbilities();
        inicializaEquipment();
    }
    
    public Aquaman() {
        super();
        this.naturalAbilities = new ArrayList<>();
        this.equipment = new ArrayList<>();
    }

    public Aquaman(Aquaman aquamanOriginal) {
        super(aquamanOriginal);
        this.naturalAbilities = new ArrayList<>();
        this.equipment = new ArrayList<>();
        this.naturalAbilities.addAll(aquamanOriginal.naturalAbilities);
        this.equipment.addAll(aquamanOriginal.equipment);
    }

    public void setNaturalAbilities(ArrayList<String> naturalAbilities) {
        this.naturalAbilities = naturalAbilities;
    }

    public void setEquipment(ArrayList<String> equipment) {
        this.equipment = equipment;
    }

    public ArrayList<String> getNaturalAbilities() {
        return naturalAbilities;
    }

    public ArrayList<String> getEquipment() {
        return equipment;
    }
    
    public void inicializaNaturalAbilities() {
        this.naturalAbilities.add("Darkness Vision");
        this.naturalAbilities.add("Water Breathing ");
        this.naturalAbilities.add("Underwater Mobility ");
        this.naturalAbilities.add("Water Breathing ");
    }
    
    public void inicializaEquipment() {
        this.equipment.add("Atlantean Cybernetic Left Hand");
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
        System.out.println("Aquaman movendo-se");
    }

    @Override
    public void inicializaPoderes() {
        this.powers.add("Speak with Animals (aquatic)");
        this.powers.add("Supersenses (nightvision");
        this.powers.add("Telepathy (aquatic lifeforms) ");
    }
    @Override
    public String toString() {
        String s;
        s = "\nAquaman";
        s += super.toString();
        s  += "\nPoderes: "+this.powers.toString()+"\nNatural Abilities: "+this.naturalAbilities.toString()+"\nEquipaments: "+this.equipment.toString();
        return s;
    }

    
}
