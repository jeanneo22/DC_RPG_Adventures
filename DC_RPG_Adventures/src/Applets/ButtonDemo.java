/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Applets;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Jeanne
 */
public class ButtonDemo implements ActionListener{
        
    JLabel jlab;
    JFrame jframe;
    ButtonDemo() {
        
        // Cria um contêiner JFrame.
        jframe = new JFrame("A Button Example");
        
        //Especifica FlowLayout com gerenciador de leiaute
       jframe.setLayout(new FlowLayout());
       
       // Fornece um tamanho inicial para o quadro
       jframe.setSize(220,90);
       
       // Encerra o programa quando o usuario fecha o aplicativo
       jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       //Cria dois botoes.
       JButton esquerda = new JButton("ESQUERDA");
       JButton direita = new JButton("DIREITA");
       
       //Adiciona ouvintes de ação
       esquerda.addActionListener(this);
       direita.addActionListener(this);
       
       //Adiciona dois botões ao painel de conteúdo
       jframe.add(esquerda);
       jframe.add(direita);
       
       //Cria um rotulo
       jlab = new JLabel("Pressione um botão para sair feche");
       
       //Adiciona o rótulo ao quadro
       jframe.add(jlab);
       
       // Exibe o quadro
       jframe.setVisible(true);
    }
       
       // Trata eventos de ação
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().equals("ESQUERDA")) {
               jlab.setText("Voce pressionou esquerda");
               jframe.setVisible(false);
               
            }
            else {
               jlab.setText("Voce pressionou direita");
               jframe.setVisible(false);
            }
        }
        
    
}
