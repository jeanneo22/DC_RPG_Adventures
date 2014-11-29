/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Personagens.Herois;

import java.util.ArrayList;

/**
 *
 * @author Jeanne
 */
public class GreenLatern extends Heroi{
    private ArrayList <String> equipment;
    
    public GreenLatern(int heroPoints, String name, float height, int reflexes, int physique, int knowledge, int perception, int presence, int speed, int unarmedBDV, int p_l_bonus, int characterPoints, int currentResistence) {
        super(heroPoints, name, height, reflexes, physique, knowledge, perception, presence, speed, unarmedBDV, p_l_bonus, characterPoints, currentResistence);
        this.equipment = new ArrayList<>();
        inicializaEquipment();
    }

    public GreenLatern() {
        super();
        this.equipment = new ArrayList<>();
        this.equipment.addAll(null);
    }

    public ArrayList<String> getEquipment() {
        return equipment;
    }

    public void setEquipment(ArrayList<String> equipment) {
        this.equipment = equipment;
    }

    public GreenLatern(GreenLatern greenLaternOriginal) {
        super(greenLaternOriginal);
        this.equipment = new ArrayList<>();
        this.equipment.addAll(greenLaternOriginal.equipment);
    }
    
    public void inicializaEquipment() {
        this.equipment.add("Latern Battery");
        this.equipment.add("Power Ring");
    }
    
    @Override
    public void atacar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    public String toString() {
        String s;
        s = "\nGreen Latern";
        s += super.toString();
        s  += "\nEquipaments: "+this.equipment.toString();
        return s;
    }

    @Override
    public void inicializaPoderes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
