/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Applets;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.InvocationTargetException;

/**
 *
 * @author Jeanne
 */
public class MySwingApplet extends JApplet{
    JButton esquerda;
    JButton direita;
    JButton cima;
    JButton abaixo;
    
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
        
        // Cria dois botões
        esquerda = new JButton("ESQUERDA");
        direita = new JButton("DIREITA");
        cima = new JButton("CIMA");
        abaixo = new JButton("ABAIXO");
        
        // Adiciona um ouvinte de acao para o botao esquerda
        esquerda.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlab.setText("Voce pressionou esquerda");
            }
        });
        
        // Adiciona um ouvinte de acao para o botao direita
        direita.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlab.setText("Voce pressionou direita");
            }
        });
        
        // Adiciona um ouvinte de acao para o botao esquerda
        cima.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlab.setText("Voce pressionou cima");
            }
        });
        
        // Adiciona um ouvinte de acao para o botao esquerda
        abaixo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlab.setText("Voce pressionou baixo");
            }
        });
        
    
        add(esquerda);
        add(direita);
        add(cima);
        add(abaixo);
        
        jlab = new JLabel("Pressione um botao");
        add(jlab);
    }
    
}
