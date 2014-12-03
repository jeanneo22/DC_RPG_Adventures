/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Personagens.Viloes;

import Personagens.Personagem;

/**
 *
 * @author Jeanne
 */
public abstract class Vilao extends Personagem{
    protected int villainPoints; 
    protected static final int MIN_VILLAIN_POINTS = 1;
    protected static final int MAX_VILLAIN_POINTS = 60;

    public Vilao(int villainPoints, String name, float height, int reflexes, int physique, int knowledge, int perception, int presence, int speed, int unarmedBDV, int p_l_bonus, int characterPoints, int currentResistence, float x, float y) {
        super(name, height, reflexes, physique, knowledge, perception, presence, speed, unarmedBDV, p_l_bonus, characterPoints, currentResistence, x, y);
        setVillainPoints(villainPoints);
    }

    public Vilao() {
        super();
        this.villainPoints = 0;
    }

    public Vilao(Vilao vilaoOriginal) {
        super(vilaoOriginal);
        this.villainPoints = vilaoOriginal.villainPoints;
    }

    public void setVillainPoints(int villainPoints) {
        this.villainPoints = (villainPoints >= Vilao.MIN_VILLAIN_POINTS && villainPoints <= Vilao.MAX_VILLAIN_POINTS)?villainPoints:0;
    }

    public int getVillainPoints() {
        return villainPoints;
    }

    public static int getMIN_VILLAIN_POINTS() {
        return MIN_VILLAIN_POINTS;
    }

    public static int getMAX_VILLAIN_POINTS() {
        return MAX_VILLAIN_POINTS;
    }

    @Override
    public String toString() {
        String s;
        s = super.toString();
        s += "\nHero Points: "+Integer.toString(this.villainPoints);
        return s;
        
    }
    
    
}
