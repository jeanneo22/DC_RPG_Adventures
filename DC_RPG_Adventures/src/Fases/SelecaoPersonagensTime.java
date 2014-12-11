/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Fases;

import Personagens.Herois.*;
import Personagens.Viloes.*;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.event.*;
/**
 *
 * @author Jeanne
 */
public class SelecaoPersonagensTime extends Jogo implements ListSelectionListener{
    private JList<String> jList;
    private JLabel jlab;
    private JScrollPane jScrollPane;
    private JFrame jframe;
    
    private static int i = 0;
    
    SelecaoPersonagensTime() {
        // Aloca memoria para selecionados
        this.selecionados = new ArrayList<>(4);
        
        
        // Cria um contêiner JFrame.
        jframe = new JFrame("Selecao dos personagens do time");
        
        // Especifica um leiaute de fluxo.
        jframe.setLayout(new FlowLayout());
        
        // Fornece um tamanho inicial para o quadro
        jframe.setSize(200,160);
        
        // Encerra o programa quando o usuario fecha o aplicativo
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Cria uma JList.
        if(Jogo.timeEscolhido == Jogo.PersonagemEnum.HEROI)
           jList = new JList<>(this.herois);
        else
            jList = new JList<>(this.viloes);
        
        // Define o modo de seleção da lista omo seleção simples
        jList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
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
            // Obtem o indice do item alterado
            int idx = jList.getSelectedIndex();
        
            // Exibe a seleção se um item foi selecionado
            if(Jogo.getTimeEscolhido() == Jogo.PersonagemEnum.HEROI && idx != -1 && !this.selecionados.contains(herois[idx]) && i < 4) {
                jlab.setText("Seleção atual: "+herois[idx]);
                selecionados.add(herois[idx]);
                switch(idx) {
                        case 0:
                            Aquaman a = new Aquaman();
                            time.add(a);
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
            if(Jogo.timeEscolhido == Jogo.PersonagemEnum.VILAO && idx != -1 && !this.selecionados.contains(viloes[idx]) && i < 4) {
                jlab.setText("Seleção atual: "+viloes[idx]);
                selecionados.add(viloes[idx]);
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
            else
                jlab.setText("Por favor escolha um personagem");
        if(i==4) jframe.setVisible(false);
    }
    
    
}
    
