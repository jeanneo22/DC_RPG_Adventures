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
    private int height;
    private int width;
    private ArrayList<String> places;
    private ArrayList<String> streets;
    
    private static int NUM_PLACES = 0;
    private static final int MAX_NUM_PLACES = 5;
    private static int NUM_STREETS = 0;
    private static final int MAX_NUM_STREETS = 10;
    private static final int DIST_MAX_PARA_ATAQUE = 5;
    private static final short MAX_HEIGHT = 200;
    private static final short MAX_WIDHT = 200;
    
    public Mapa(String name,int height,int width) {
        this.name = name;
        setHeight(height);
        setWidth(width);
        this.places = new ArrayList<>();
        this.streets = new ArrayList<>();
    }
    
    public Mapa() {
        this.name = "";
        this.height = 0;
        this.width = 0;
        this.places = new ArrayList<>();
        this.streets = new ArrayList<>();
    }
    
    public Mapa(Mapa mapaOriginal) {
        this.name = mapaOriginal.name;
        this.height = mapaOriginal.height;
        this.width = mapaOriginal.width;
        this.places = new ArrayList<>();
        this.streets = new ArrayList<>();
        this.places.addAll(mapaOriginal.places);
        this.streets.addAll(mapaOriginal.streets);
    }
    
    public void inserePlace(String place) {
        if(this.places.size() == Mapa.MAX_NUM_PLACES)
            System.out.println("Nao foi possivel adicionar o lugar");
        else 
            this.places.add(place);
        
    }
    
    public void insereStreet(String street) {
        if(this.streets.size() == Mapa.MAX_NUM_STREETS)
            System.out.println("Nao foi possivel adicionar o lugar");
        else
            this.streets.add(street);
        
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setHeight(int height) {
        this.height = (height > 0 && height <= Mapa.MAX_HEIGHT)?height:0;
    }

    public void setWidth(int width) {
        this.width = (width > 0 && height <= Mapa.MAX_WIDHT)?width:0;
    }

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
    

    
}
