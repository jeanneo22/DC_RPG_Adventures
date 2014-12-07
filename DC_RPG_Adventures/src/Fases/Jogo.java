/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Fases;

import Personagens.Personagem;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Jeanne
 */
public class Jogo extends JApplet {
    Mapa mapas[] = new Mapa[5];
    Fase fases[] = new Fase[5];
    Personagem time[] = new Personagem[5];
    String timeEscolhido;
    public void criarJogo() {
        for(int i = 0; i < 5; i++) {
            mapas[i] = new Mapa("Mapa"+Integer.toString(i),200,200);
            fases[i] = new Fase(i,mapas[i]);
         }
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
            setLayout(new FlowLayout());
        
            // Adiciona um Label para o applet
            jlab = new JLabel("Faça uma seleção");
            add(jlab);
            
            // Cria dois botões
            heroi = new JButton("HEROI");
            vilao = new JButton("VILAO");
        
            // Adiciona um ouvinte de acao para o botao heroi
            heroi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlab.setText("Voce escolheu heroi");
                timeEscolhido = "heroi";
            }
        });
        
        // Adiciona um ouvinte de acao para o botao vilao
            vilao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlab.setText("Voce escolheu vilao");
                timeEscolhido = "vilao";
            }
        });
        add(heroi);
        add(vilao);
        
        
        
        // Seleciona os personagens
         
        
        // Enfrentar heroi ou enfrentar vilao
        
        
        //Itens
    }
        
}
