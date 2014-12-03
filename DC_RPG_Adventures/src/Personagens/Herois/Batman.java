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
public class Batman extends Heroi{
    private ArrayList <String> equipment;
    
    public Batman(int heroPoints, String name, float height, int reflexes, int physique, int knowledge, int perception, int presence, int speed, int unarmedBDV, int p_l_bonus, int characterPoints, int currentResistence,float x,float y) {
        super(heroPoints, name, height, reflexes, physique, knowledge, perception, presence, speed, unarmedBDV, p_l_bonus, characterPoints, currentResistence,x,y);
        this.equipment = new ArrayList<>();
        inicializaEquipment();
    }

    public Batman() {
        super();
        this.equipment = new ArrayList<>();
        this.equipment.addAll(null);
    }

    public Batman(Batman batmanOriginal) {
        super(batmanOriginal);
        this.equipment = new ArrayList<>();
        this.equipment.addAll(batmanOriginal.equipment);
    }
    
    public void inicializaEquipment() {
        this.equipment.add("Batrang");
        this.equipment.add("Batcuffs");
        this.equipment.add("Batmobile");
        this.equipment.add("Batsuit");
        this.equipment.add("De-Cel Monofilament Jumplines");
        this.equipment.add("Launching Grappling Hook");
        this.equipment.add("Nerve Agent-Rated Gas Mask");
        this.equipment.add("Rebreather");
        this.equipment.add("Smoke Capsules");
        this.equipment.add("Universal Tool");
        this.equipment.add("Utility Belt");
    }

    public ArrayList<String> getEquipment() {
        return equipment;
    }

    public void setEquipment(ArrayList<String> equipment) {
        this.equipment = equipment;
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
        if(ehVilao && dist <= Mapa.getDIST_MAX_PARA_ATAQUE()) System.out.println("Atacar");
    }

    @Override
    public void defender() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mover() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void inicializaPoderes() {
        this.powers.addAll(null);
    }
    
    @Override
    public String toString() {
        String s;
        s = "\nBatman";
        s += super.toString();
        s  += "\nEquipaments: "+this.equipment.toString();
        return s;
    }
}
    
    
    
