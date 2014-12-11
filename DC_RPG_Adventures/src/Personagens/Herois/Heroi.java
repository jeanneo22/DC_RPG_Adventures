/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Personagens.Herois;

import Personagens.Personagem;

/**
 *
 * @author Jeanne
 */
public abstract class Heroi extends Personagem{
    protected int heroPoints;
    protected static final int MIN_HERO_POINTS = 1;
    protected static final int MAX_HERO_POINTS = 30;

    public Heroi(int heroPoints, String name, float height, int reflexes, int physique, int knowledge, int perception, int presence, int speed, int unarmedBDV, int p_l_bonus, int characterPoints, int currentResistence, float x, float y) {
        super(name, height, reflexes, physique, knowledge, perception, presence, 
              speed, unarmedBDV, p_l_bonus, characterPoints, currentResistence, x, y);
        setHeroPoints(heroPoints);
    }

    

    public Heroi() {
        super();
        this.heroPoints = 0;
    }

    public Heroi(Heroi heroiOriginal) {
        super(heroiOriginal);
        this.heroPoints = heroiOriginal.heroPoints;
    }

    public void setHeroPoints(int heroPoints) {
        this.heroPoints = (heroPoints >= MIN_HERO_POINTS && heroPoints <= MAX_HERO_POINTS)?heroPoints:0;
    }

    public int getHeroPoints() {
        return heroPoints;
    }

    public static int getMIN_HERO_POINTS() {
        return MIN_HERO_POINTS;
    }

    public static int getMAX_HERO_POINTS() {
        return MAX_HERO_POINTS;
    }
    
    
    @Override
    public String toString() {
        String s;
        s = super.toString();
        s += "\nHero Points: "+Integer.toString(this.heroPoints);
        return s;
        
    }
    
    
}
