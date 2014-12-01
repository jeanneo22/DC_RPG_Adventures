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
public class Eclipso extends Vilao{
    private ArrayList <String> naturalAbilities;
    private ArrayList <String> equipment;

    public Eclipso(int villainPoints, String name, float height, int reflexes, int physique, int knowledge, int perception, int presence, int speed, int unarmedBDV, int p_l_bonus, int characterPoints, int currentResistence) {
        super(villainPoints, name, height, reflexes, physique, knowledge, perception, presence, speed, unarmedBDV, p_l_bonus, characterPoints, currentResistence);
        this.naturalAbilities = new ArrayList<>();
        this.equipment = new ArrayList<>();
        inicializaNaturalAbilities();
        inicializaEquipment();
    }

    public Eclipso() {
        super();
        this.naturalAbilities = new ArrayList<>();
        this.equipment = new ArrayList<>();
        this.naturalAbilities.addAll(null);
        this.equipment.addAll(null);
    }

    public Eclipso(Eclipso eclipsoOriginal) {
        super(eclipsoOriginal);
        this.naturalAbilities = new ArrayList<>();
        this.equipment = new ArrayList<>();
        this.naturalAbilities.addAll(eclipsoOriginal.naturalAbilities);
        this.equipment.addAll(eclipsoOriginal.equipment);
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
        this.naturalAbilities.add("Immortality");
        this.naturalAbilities.add("Invulnerability");
        this.naturalAbilities.add("Simultaneous inhabitation of his Eclipso hosts ");
        this.naturalAbilities.add("Telekinesis ");
    }
    
    public void inicializaEquipment() {
        this.equipment.add("Heart of Darkness Shard");
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
        s = "\nEclipso";
        s += super.toString();
        s  += "\nNatural Abilities: "+this.naturalAbilities.toString()+"\nEquipment: "+this.equipment.toString();
        return s;
    }
    
}
