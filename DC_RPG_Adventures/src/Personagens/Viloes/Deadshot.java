/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Personagens.Viloes;

import java.util.ArrayList;
/**
 *
 * @author Jeanne
 */
public class Deadshot extends Vilao{
    private ArrayList <String> equipment;
    
    public Deadshot(int villainPoints, String name, float height, int reflexes, int physique, int knowledge, int perception, int presence, int speed, int unarmedBDV, int p_l_bonus, int characterPoints, int currentResistence) {
        super(villainPoints, name, height, reflexes, physique, knowledge, perception, presence, speed, unarmedBDV, p_l_bonus, characterPoints, currentResistence);
        this.equipment = new ArrayList<>();
        inicializaEquipment();
    }

    public Deadshot() {
        super();
        this.equipment = new ArrayList<>();
        this.equipment.addAll(null);
    }

    public Deadshot(Deadshot deadshotOriginal) {
        super(deadshotOriginal);
        this.equipment = new ArrayList<>();
        this.equipment.addAll(deadshotOriginal.equipment);
    }
    
    public ArrayList<String> getEquipment() {
        return equipment;
    }

    public void setEquipment(ArrayList<String> equipment) {
        this.equipment = equipment;
    }
    
    public void inicializaEquipment() {
        this.equipment.add("Helmet");
        this.equipment.add("Wrist Magnums");
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
    public void inicializaPoderes() {
        this.powers.addAll(null);
    }
    
    @Override
    public String toString() {
        String s;
        s = "\nDeadshot";
        s += super.toString();
        s  += "\nEquipaments: "+this.equipment.toString();
        return s;
    }
}
