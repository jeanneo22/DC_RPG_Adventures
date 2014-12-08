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
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * @author Jeanne
 */
public class Jogo extends JApplet, implements ListSelectionListener {
    public enum PersonagemEnum {
        HEROI,VILAO
    }
    Mapa mapas[] = new Mapa[5];
    Fase fases[] = new Fase[5];
    Personagem time[] = new Personagem[4];
    String herois[] = {"Aquaman","Batman","Flash","GreenLatern","Superman","WonderWoman"};
    String viloes[] = {"Amazo","Clayface","Deadshot","Eclipso","EtriganTheDemon","LexLuthor"};
    PersonagemEnum timeEscolhido;
    public void criarJogo() {
        for(int i = 0; i < 5; i++) {
            mapas[i] = new Mapa("Mapa"+Integer.toString(i),200,200);
            mapas[i].inserePlace("lugar "+Integer.toString(i));
            mapas[i].insereStreet("rua "+Integer.toString(i));
            fases[i] = new Fase(i,mapas[i]);
         }
        new MySwingApplet();
    }
        // Seleciona o time: Heroi ou Vilao
        JButton heroi;
        JButton vilao;
        
        JLabel jlab;
        // Inicia o applet.
        @Override
        public void init() {
            try {
                SwingUtilities.invokeAndWait(new Runnable() {
                    @Override
                    public void run () {
                        makeGUI(); // Inicializa a GUI
                    }
                });
            } catch(InterruptedException | InvocationTargetException exc) {
                System.out.println("Nao pode criar por causa de: "+exc);
            }   
        }
        // Esse applet nao precisa sobrepor start(),stop() ou destroy()
        // Configura e inicializa a GUI
        private void makeGUI () {
            // Configura o applet para usar o leiaute de fluxo
            setLayout(null);
            setBounds(new Rectangle(200,200));
            
        
            // Adiciona um Label para o applet
            jlab = new JLabel("Faça uma seleção");
            jlab.setBounds(90,-10,150,50);
            add(jlab);   
            
            // Cria dois botões
            heroi = new JButton("HEROI");
            vilao = new JButton("VILAO");
            heroi.setBounds(90,30,80,30);
            vilao.setBounds(180,30,80,30);
            add(heroi);
            add(vilao);
        
            // Adiciona um ouvinte de acao para o botao heroi
            heroi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlab.setText("Voce escolheu heroi");
                jlab.setBounds(90,50,150,50);
                timeEscolhido = PersonagemEnum.HEROI;
            }
        });
        
        // Adiciona um ouvinte de acao para o botao vilao
            vilao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlab.setText("Voce escolheu vilao");
                jlab.setBounds(90,50,150,50);
                timeEscolhido = PersonagemEnum.VILAO;
            }
        });
            
           // Seleciona os personagens
            remove(heroi);
            remove(vilao);
            JList jList;
            if(timeEscolhido == PersonagemEnum.HEROI) {
                jList = new JList<>(herois);
                jList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                JScrollPane jScrollPane = new JScrollPane(jList);
                jScrollPane.setPreferredSize(new Dimension(200,200));
                add(jList);
                @Override
                public void valueChanged(ListSelectionEvent le) {
                    int idx = jList.getSelectedIndex();
                    switch(idx) {
                        case 0:
                            time[i] = new Aquaman();
                            break;
                        case 1:
                            time[i] = new Batman();
                            break;
                        case 2:
                            time[i] = new Flash();
                            break;
                    }
                }
                
            }
      }
            
        // Seleciona os personagens
            
         
        
        // Enfrentar heroi ou enfrentar vilao
        
        
        //Itens
    }
       
