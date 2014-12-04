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
    private static int FASES = 0;
    private static final int MAX_NUM_FASES = 5;

    public Fase(int number, Mapa map) {
        if(Fase.FASES < Fase.MAX_NUM_FASES) {
            this.number = number;
            this.map = new Mapa(map);
            FASES++;
        }
        else {
            System.out.println("Fase nao pode ser criada");
        }
    }

    public Fase() {
        if(Fase.FASES < Fase.MAX_NUM_FASES) {
            this.number = 0;
            this.map = new Mapa();
            FASES++;
        }
        else {
            System.out.println("Fase nao pode ser criada");
        }
    }

    public Fase(Fase faseOriginal) {
        if(Fase.FASES < Fase.MAX_NUM_FASES) {
            this.number = faseOriginal.number;
            this.map = new Mapa(faseOriginal.map);
            FASES++;
        }
        else {
            System.out.println("Fase nao pode ser criada");
        }
        
    }
    
    
    
}
