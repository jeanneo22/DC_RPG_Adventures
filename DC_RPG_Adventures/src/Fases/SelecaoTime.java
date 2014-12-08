/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Fases;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Jeanne
 */
public class SelecaoTime extends Jogo implements ActionListener{
        
    JLabel jlab;
    JFrame jframe;
    SelecaoTime() {
        
        // Cria um contêiner JFrame.
        jframe = new JFrame("Selecione uma opcao");
        
        //Especifica FlowLayout com gerenciador de leiaute
       jframe.setLayout(new FlowLayout());
       
       // Fornece um tamanho inicial para o quadro
       jframe.setSize(220,90);
       
       // Encerra o programa quando o usuario fecha o aplicativo
       jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       //Cria dois botoes.
       JButton heroi = new JButton("HEROI");
       JButton vilao = new JButton("VILAO");
       
       //Adiciona ouvintes de ação
       heroi.addActionListener(this);
       vilao.addActionListener(this);
       
       //Adiciona dois botões ao painel de conteúdo
       jframe.add(heroi);
       jframe.add(vilao);
       
       //Cria um rotulo
       jlab = new JLabel("Faça uma escolha para sair feche");
       jframe.add(jlab); 
       
       //Adiciona o rótulo ao quadro
       jframe.add(jlab);
       
       // Exibe o quadro
       jframe.setVisible(true);
    }
       
       // Trata eventos de ação
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().equals("HEROI")) {
               jlab.setText("Voce escolheu heroi");
               Jogo.timeEscolhido = Jogo.PersonagemEnum.HEROI;
               jframe.setVisible(false);
               
            }
            else {
               jlab.setText("Voce escolheu vilao");
               Jogo.timeEscolhido = Jogo.PersonagemEnum.VILAO;
               jframe.setVisible(false);
            }
        }
}
