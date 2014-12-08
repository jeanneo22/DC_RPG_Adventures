/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Applets;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Jeanne
 */
public class ListDemo implements ListSelectionListener{
    JList<String> jList;
    JLabel jlab;
    JScrollPane jScrollPane;
    JFrame jframe;
    
    // Cria um array de nomes.
    String names[] = {"Sherry","Jon","Rachel"};
    
    ListDemo() {
        // Cria um contêiner JFrame.
        jframe = new JFrame("JList Demo");
        
        // Especifica um leiaute de fluxo.
        jframe.setLayout(new FlowLayout());
        jframe.setSize(200,160);
        
        // Fornece um tamanho inicial para o quadro
        
        // Encerra o programa quando o usuario fecha o aplicativo
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Cria uma JList.
        jList = new JList<>(names);
        
        // Define o modo de seleção da lista omo seleção simples
        jList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        // Adiciona a lista a um painel de rolagem
        jScrollPane = new JScrollPane(jList);
        
        // Define um tamanho para o painel de rolagem
        jScrollPane.setPreferredSize(new Dimension(120,90));
        
        // Cria um rotulo para exibir a seleção
        jlab = new JLabel("Por favor selecione um nome");
        
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
        if(idx != -1) {
            jlab.setText("Seleção atual: "+names[idx]);
            jframe.setVisible(false);
        }
        else
            jlab.setText("Por favor selecione um nome");
    }
    
    
}
