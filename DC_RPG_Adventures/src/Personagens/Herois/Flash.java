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
public class Flash extends Heroi{
    private ArrayList <String> equipment;

    public Flash(int heroPoints, String name, float height, int reflexes, int physique, int knowledge, int perception, int presence, int speed, int unarmedBDV, int p_l_bonus, int characterPoints, int currentResistence) {
        super(heroPoints, name, height, reflexes, physique, knowledge, perception, presence, speed, unarmedBDV, p_l_bonus, characterPoints, currentResistence);
        this.equipment = new ArrayList<>();
        inicializaEquipment();
    }

    public Flash() {
        super();
        this.equipment = new ArrayList<>();
        this.equipment.addAll(null);
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
