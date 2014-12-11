/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Fases;

/**
 *
 * @author Jeanne
 */
public class Fase {
    private int number;
    private Mapa map;
    private static final int MAX_NUM_FASES = 5;

    public Fase(int number, Mapa map) {
            this.number = number;
            this.map = new Mapa(map);
    }

    public Fase() {
            this.number = 0;
            this.map = new Mapa();
    }

    public Fase(Fase faseOriginal) {
            this.number = faseOriginal.number;
            this.map = new Mapa(faseOriginal.map);
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setMap(Mapa map) {
        this.map = map;
    }

    public int getNumber() {
        return number;
    }

    public Mapa getMap() {
        return map;
    }

    public static int getMAX_NUM_FASES() {
        return MAX_NUM_FASES;
    }
    
    @Override
    public String toString() {
        String s;
        s = "Fase "+this.number+"Mapa: "+map.toString();
        return s;
    }
    
    
    
    
}
