/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Fases;

import java.util.ArrayList;

/**
 *
 * @author Jeanne
 */
public class Mapa {
    private String name;
    private ArrayList<String> places;
    private ArrayList<String> streets;
    
    private static int NUM_PLACES = 0;
    private static final int MAX_NUM_PLACES = 5;
    private static int NUM_STREETS = 0;
    private static final int MAX_NUM_STREETS = 10;
    private static final int DIST_MAX_PARA_ATAQUE = 5;

    public String getName() {
        return name;
    }

    public ArrayList<String> getPlaces() {
        return places;
    }

    public ArrayList<String> getStreets() {
        return streets;
    }

    public static int getDIST_MAX_PARA_ATAQUE() {
        return DIST_MAX_PARA_ATAQUE;
    }
    
    public void inserePlace(String place) {
        
    }
    
    public void insereStreet(String street) {
        
    }
    
}
