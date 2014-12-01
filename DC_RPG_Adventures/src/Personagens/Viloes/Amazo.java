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
public class Amazo extends Vilao{
    private ArrayList <String> naturalAbilities;
    
    public Amazo(int villainPoints, String name, float height, int reflexes, int physique, int knowledge, int perception, int presence, int speed, int unarmedBDV, int p_l_bonus, int characterPoints, int currentResistence) {
        super(villainPoints, name, height, reflexes, physique, knowledge, perception, presence, speed, unarmedBDV, p_l_bonus, characterPoints, currentResistence);
        this.naturalAbilities = new ArrayList<>();
        inicializaNaturalAbilities();
    }

    public Amazo() {
        super();
        this.naturalAbilities = new ArrayList<>();
        this.naturalAbilities.addAll(null);
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
