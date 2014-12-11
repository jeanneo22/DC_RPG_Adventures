/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Fases;

import Personagens.Herois.*;
import Personagens.Personagem;
import Personagens.Viloes.*;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

/**
 *
 * @author Jeanne
 */
public class Jogo {
    public enum PersonagemEnum {
        HEROI,VILAO
    }
    protected Mapa mapas[];
    protected Fase fases[];
    protected ArrayList<Personagem> time;
    protected String herois[] = {"Aquaman","Batman","Flash","GreenLatern","Superman","WonderWoman"};
    protected String viloes[] = {"Amazo","Clayface","Deadshot","Eclipso","EtriganTheDemon","LexLuthor"};
    protected static PersonagemEnum timeEscolhido;
    protected static ArrayList<Personagem> timeComputador;
    protected ArrayList<String> selecionados;


    public Jogo(Mapa[] mapas, Fase[] fases, ArrayList<Personagem> time, ArrayList<String> selecionados) {
        this.time = new ArrayList<Personagem>(4);
        this.timeComputador = new ArrayList<Personagem>(4);
        this.selecionados = new ArrayList<String>(4);
        this.mapas = new Mapa[Mapa.getMAX_NUM_MAPAS()];
        this.fases = new Fase[Fase.getMAX_NUM_FASES()];
        for(int i = 0; i < 5; i++) {
            this.mapas[i] = new Mapa(mapas[i]);
            this.fases[i] = new Fase(fases[i]);
        }
        this.time.addAll(time);
        this.selecionados = selecionados;
    }
    
    public Jogo(Jogo jogoOriginal) {
         this.time = new ArrayList<Personagem>(4);
        this.timeComputador = new ArrayList<Personagem>(4);
        this.selecionados = new ArrayList<String>(4);
        this.mapas = new Mapa[Mapa.getMAX_NUM_MAPAS()];
        this.fases = new Fase[Fase.getMAX_NUM_FASES()];
        for(int i = 0; i < 5; i++) {
            this.mapas[i] = new Mapa(jogoOriginal.mapas[i]);
            this.fases[i] = new Fase(jogoOriginal.fases[i]);
        }
        this.time.addAll(jogoOriginal.time);
    }
    
    public Jogo() {
        time = new ArrayList<Personagem>(4);
        timeComputador = new ArrayList<Personagem>(4);
        selecionados = new ArrayList<String>(4);
        mapas = new Mapa[Mapa.getMAX_NUM_MAPAS()];
        fases = new Fase[Fase.getMAX_NUM_FASES()];
        selecionarPersonagensComputador();
        for(int i = 0; i < 5; i++) {
            mapas[i] = new Mapa("Mapa"+Integer.toString(i),200,200);
            mapas[i].inserePlace("lugar "+Integer.toString(i));
            mapas[i].insereStreet("rua "+Integer.toString(i));
            fases[i] = new Fase(i,mapas[i]);
         }
    }
    
    // Seleciona o time heroi ou vilao
    public void selecionarTime() {
        final byte op = Byte.parseByte(JOptionPane.showInputDialog("Selecione uma opcao: 1:Heroi 2:Vilao\n"
                + "Qualquer outra opção sera considerada Heroi"));
        if(op != 2) Jogo.setTimeEscolhido(PersonagemEnum.HEROI);
        else Jogo.setTimeEscolhido(PersonagemEnum.VILAO);
    }
     // Seleciona os personagens do computador
    public void selecionarPersonagensComputador() {
        Random gerador = new Random();
        for(int i = 0; i < 6; i++) {
            int rnd;
            gerador.setSeed(i);
            // Gera um randomico entre 0 e 5
            rnd = Math.abs(gerador.nextInt()%6);
            if(this.timeEscolhido == PersonagemEnum.HEROI)
                switch(rnd) {
                        case 0:
                            timeComputador.add(new Amazo());
                            break;
                        case 1:
                            timeComputador.add(new Clayface());
                            break;
                        case 2:
                            timeComputador.add(new Deadshot());
                            break;
                        case 3:
                            timeComputador.add(new Eclipso());
                            break;
                        case 4:
                            timeComputador.add(new EtriganTheDemon());
                            break;
                        case 5:
                            timeComputador.add(new LexLuthor());
                            break;
                }
            else
                switch(rnd) {
                        case 0:
                            timeComputador.add(new Aquaman());
                            break;
                        case 1:
                            timeComputador.add(new Batman());
                            break;
                        case 2:
                            timeComputador.add(new Flash());
                            break;
                        case 3:
                            timeComputador.add(new GreenLatern());
                            break;
                        case 4:
                            timeComputador.add(new Superman());
                            break;
                        case 5:
                            timeComputador.add(new WonderWoman());
                            break;
            }
        }
        
    }
    // Seleciona os personagens
        
    // Enfrentar heroi ou enfrentar vilao
        
        
    //Itens

    public static PersonagemEnum getTimeEscolhido() {
        return timeEscolhido;
    }

    public static void setTimeEscolhido(PersonagemEnum timeEscolhido) {
        Jogo.timeEscolhido = timeEscolhido;
    }

    public ArrayList<String> getSelecionados() {
        return selecionados;
    }
    
    public String getSelecionado(int i) {
        return selecionados.get(i);
    }

    public void setSelecionados(ArrayList<String> selecionados) {
        this.selecionados = selecionados;
    }
    
    @Override
    public String toString() {
        String s;
        s = "Fases\n"+this.fases.toString()+"Seu time "+this.selecionados;
        return s;
    }
    
}

       
