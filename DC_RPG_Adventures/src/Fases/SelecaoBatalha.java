/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Fases;

import static Fases.Jogo.timeComputador;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Jeanne
 */
public class SelecaoBatalha extends Jogo implements ActionListener{
        
    JLabel jlab;
    JFrame jframe;
    SelecaoBatalha() {
        
        // Cria um contêiner JFrame.
        jframe = new JFrame("Selecione uma opcao");
        
        //Especifica FlowLayout com gerenciador de leiaute
       jframe.setLayout(new FlowLayout());
       
       // Fornece um tamanho inicial para o quadro
       jframe.setSize(220,90);
       
       // Encerra o programa quando o usuario fecha o aplicativo
       jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       //Cria um botao.
       JButton adversario;
       if(Jogo.getTimeEscolhido() == PersonagemEnum.VILAO)
          adversario = new JButton("ENFRENTAR HEROI");
       else adversario = new JButton("ENFRENTAR VILAO");
       
       //Adiciona ouvintes de ação
       adversario.addActionListener(this);
       
       //Adiciona dois botões ao painel de conteúdo
       jframe.add(adversario);
       
       //Cria um rotulo
       jlab = new JLabel("Faça uma escolha para sair feche");
       
       //Adiciona o rótulo ao quadro
       jframe.add(jlab);
       
       // Exibe o quadro
       jframe.setVisible(true);
    }
       
       // Trata eventos de ação
        @Override
        public void actionPerformed(ActionEvent e) {
            byte op,i;
            if(e.getActionCommand().equals("ENFRENTAR VILAO")) {
               i = Byte.parseByte(JOptionPane.showInputDialog("Personagem "+
                       "1- "+this.selecionados.get(0)+
                       "2- "+this.selecionados.get(1) +
                       "3- "+this.selecionados.get(2) +
                       "4- "+this.selecionados.get(3)));
               op = Byte.parseByte(JOptionPane.showInputDialog("1- Atacar "+
                       "\n2- defender"));
               switch(op) {
                   case 1:
                       this.time.get(i).atacar(timeComputador);
                       break;
                   case 2:
                       this.time.get(i).defender();
                       break;
               }
               jframe.setVisible(false);
               
            }
            else {
               i = Byte.parseByte(JOptionPane.showInputDialog("Personagem "+
                       "1- "+this.selecionados.get(0)+
                       "2- "+this.selecionados.get(1) +
                       "3- "+this.selecionados.get(2) +
                       "4- "+this.selecionados.get(3)));
               op = Byte.parseByte(JOptionPane.showInputDialog("1- Atacar "+
                       "\n2- defender"));
               switch(op) {
                   case 1:
                       this.time.get(i).atacar(timeComputador);
                       break;
                   case 2:
                       this.time.get(i).defender();
                       break;
               }
               jframe.setVisible(false);
            }
        }
}