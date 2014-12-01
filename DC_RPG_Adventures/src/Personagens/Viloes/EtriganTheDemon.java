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
public class EtriganTheDemon extends Vilao{
    private ArrayList <String> naturalAbilities;
    
    public EtriganTheDemon(int villainPoints, String name, float height, int reflexes, int physique, int knowledge, int perception, int presence, int speed, int unarmedBDV, int p_l_bonus, int characterPoints, int currentResistence) {
        super(villainPoints, name, height, reflexes, physique, knowledge, perception, presence, speed, unarmedBDV, p_l_bonus, characterPoints, currentResistence);
        this.naturalAbilities = new ArrayList<>();
        inicializaNaturalAbilities();
    }

    public EtriganTheDemon() {
        super();
        this.naturalAbilities = new ArrayList<>();
        this.naturalAbilities.addAll(null);
    }

    public EtriganTheDemon(EtriganTheDemon etriganTheDemonOriginal) {
        super(etriganTheDemonOriginal);
        this.naturalAbilities = new ArrayList<>();
        this.naturalAbilities.addAll(etriganTheDemonOriginal.naturalAbilities);
    }

    public void setNaturalAbilities(ArrayList<String> naturalAbilities) {
        this.naturalAbilities = naturalAbilities;
    }

    public ArrayList<String> getNaturalAbilities() {
        return naturalAbilities;
    }
    
    public void inicializaNaturalAbilities() {
        this.naturalAbilities.add("Helfire");
        this.naturalAbilities.add("Immortality");
        this.naturalAbilities.add("Natural Weaponry");
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
        this.powers.add("Energy Projection");
        this.powers.add("Precognition");
        this.powers.add("Sorcery");
    }
    
    @Override
    public String toString() {
        String s;
        s = "\nEtrigan The Demon";
        s += super.toString();
        s  += "\nPoderes: "+this.powers.toString()+"\nNatural Abilities: "+this.naturalAbilities.toString();
        return s;
    }
    
}
