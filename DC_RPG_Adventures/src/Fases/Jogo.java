/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Fases;

import Applets.MySwingApplet;
import Personagens.Herois.*;
import Personagens.Personagem;
import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * @author Jeanne
 */
public class Jogo extends JApplet {
    public enum PersonagemEnum {
        HEROI,VILAO
    }
    protected Mapa mapas[] = new Mapa[5];
    protected Fase fases[] = new Fase[5];
    protected ArrayList<Personagem> time = new ArrayList<>(4);
    protected String herois[] = {"Aquaman","Batman","Flash","GreenLatern","Superman","WonderWoman"};
    protected String viloes[] = {"Amazo","Clayface","Deadshot","Eclipso","EtriganTheDemon","LexLuthor"};
    protected static PersonagemEnum timeEscolhido;
    public void criarJogo() {
        for(int i = 0; i < 5; i++) {
            mapas[i] = new Mapa("Mapa"+Integer.toString(i),200,200);
            mapas[i].inserePlace("lugar "+Integer.toString(i));
            mapas[i].insereStreet("rua "+Integer.toString(i));
            fases[i] = new Fase(i,mapas[i]);
         }
        new MySwingApplet();
    }
            
         // Seleciona o time heroi ou vilao
         // Seleciona os personagens
        
        // Enfrentar heroi ou enfrentar vilao
        
        
        //Itens
    }
       
