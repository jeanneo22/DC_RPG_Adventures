/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Personagens.Herois;

/**
 *
 * @author Jeanne
 */
public class Superman extends Heroi{

    public Superman(int heroPoints, String name, float height, int reflexes, int physique, int knowledge, int perception, int presence, int speed, int unarmedBDV, int p_l_bonus, int characterPoints, int currentResistence) {
        super(heroPoints, name, height, reflexes, physique, knowledge, perception, presence, speed, unarmedBDV, p_l_bonus, characterPoints, currentResistence);
    }

    public Superman() {
        super();
    }

    public Superman(Superman supermanOriginal) {
        super(supermanOriginal);
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
        s = "\nSuperman";
        s += super.toString();
        return s;
    }

    @Override
    public void inicializaPoderes() {
        this.powers.add("Flight");
        this.powers.add("Ice Manipulation");
        this.powers.add("Immunity");
        this.powers.add("Invulnerability");
        this.powers.add("Microwave Projection");
        this.powers.add("Speed Manipulation (supermobility, superactions)");
        this.powers.add("X-Ray Vision");   
    }
    
}
