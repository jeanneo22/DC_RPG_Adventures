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
public class Clayface extends Vilao{
    private ArrayList <String> naturalAbilities;
    
    public Clayface(int villainPoints, String name, float height, int reflexes, int physique, int knowledge, int perception, int presence, int speed, int unarmedBDV, int p_l_bonus, int characterPoints, int currentResistence) {
        super(villainPoints, name, height, reflexes, physique, knowledge, perception, presence, speed, unarmedBDV, p_l_bonus, characterPoints, currentResistence);
        this.naturalAbilities = new ArrayList<>();
        inicializaNaturalAbilities();
    }

    public Clayface() {
        super();
        this.naturalAbilities = new ArrayList<>();
        this.naturalAbilities.addAll(null);
    }

    public Clayface(Clayface clayfaceOriginal) {
        super(clayfaceOriginal);
        this.naturalAbilities = new ArrayList<>();
        this.naturalAbilities.addAll(clayfaceOriginal.naturalAbilities);
    }

    public void setNaturalAbilities(ArrayList<String> naturalAbilities) {
        this.naturalAbilities = naturalAbilities;
    }

    public ArrayList<String> getNaturalAbilities() {
        return naturalAbilities;
    }
    
    public void inicializaNaturalAbilities() {
        this.naturalAbilities.add("Elasticity");
        this.naturalAbilities.add("Natural Armor");
        this.naturalAbilities.add("Shapechanging");
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
        s = "\nClayface";
        s += super.toString();
        s  += "\nNatural Abilities: "+this.naturalAbilities.toString();
        return s;
    }
    
    
    
}
