/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Fases;

import Personagens.Herois.*;
import Personagens.Viloes.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
/**
 *
 * @author Jeanne
 */
public class SelecaoPersonagensTime extends Jogo implements ListSelectionListener{
    JList<String> jList;
    JLabel jlab;
    JScrollPane jScrollPane;
    JFrame jframe;
    
    SelecaoPersonagensTime() {
        // Cria um contêiner JFrame.
        jframe = new JFrame("Selecao do personagens do time");
        
        // Especifica um leiaute de fluxo.
        jframe.setLayout(new FlowLayout());
        jframe.setSize(200,160);
        
        // Fornece um tamanho inicial para o quadro
        
        // Encerra o programa quando o usuario fecha o aplicativo
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Cria uma JList.
        if(Jogo.timeEscolhido == PersonagemEnum.HEROI)
           jList = new JList<>(this.herois);
        else
            jList = new JList<>(this.viloes);
        
        // Define o modo de seleção da lista omo seleção simples
        jList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        
        // Adiciona a lista a um painel de rolagem
        jScrollPane = new JScrollPane(jList);
        
        // Define um tamanho para o painel de rolagem
        jScrollPane.setPreferredSize(new Dimension(120,90));
        
        // Cria um rotulo para exibir a seleção
        jlab = new JLabel("Por favor escolha um personagem");
        
        //Adiciona o tratador da seleção
        jList.addListSelectionListener(this);
        
        // Adiciona a lista e o rotulo ao painel de conteudo
        jframe.add(jScrollPane);
        jframe.add(jlab);
        
        //Exibe o quadro.
        jframe.setVisible(true);
        
    }

    // Trata os valores de seleção na lista
    @Override
    public void valueChanged(ListSelectionEvent e) {
        int i = 0;
        while(i < 4) {
            // Obtem o indice do item alterado
            int idx = jList.getSelectedIndex();
        
            // Exibe a seleção se um item foi selecionado
            if(Jogo.timeEscolhido == PersonagemEnum.HEROI && idx != -1 && !this.time.contains(herois[idx])) {
                jlab.setText("Seleção atual: "+herois[idx]);
                switch(idx) {
                        case 0:
                            time.add(new Aquaman());
                            i++;
                            break;
                        case 1:
                            time.add(new Batman());
                            i++;
                            break;
                        case 2:
                            time.add(new Flash());
                            i++;
                            break;
                        case 3:
                            time.add(new GreenLatern());
                            i++;
                            break;
                        case 4:
                            time.add(new Superman());
                            i++;
                            break;
                        case 5:
                            time.add(new WonderWoman());
                            break;
                }
            }
            else
                jlab.setText("Por favor escolha um personagem");
        }
        i = 0;
        while( i < 4) {
            // Obtem o indice do item alterado
            int idx = jList.getSelectedIndex();
            if(Jogo.timeEscolhido == PersonagemEnum.VILAO && idx != -1 && !this.time.contains(viloes[idx])) {
                jlab.setText("Seleção atual: "+viloes[idx]);
                switch(idx) {
                        case 0:
                            time.add(new Amazo());
                            i++;
                            break;
                        case 1:
                            time.add(new Clayface());
                            i++;
                            break;
                        case 2:
                            time.add(new Deadshot());
                            i++;
                            break;
                        case 3:
                            time.add(new Eclipso());
                            i++;
                            break;
                        case 4:
                            time.add(new EtriganTheDemon());
                            i++;
                            break;
                        case 5:
                            time.add(new LexLuthor());
                            i++;
                            break;
                }
            }
        }
        jframe.setVisible(false);
    }
    
    
}
    
