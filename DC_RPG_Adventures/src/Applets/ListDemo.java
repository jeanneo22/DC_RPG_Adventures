/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Applets;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Jeanne
 */
public class ListDemo {
        // Cria uma JList
        JFrame jfrm = new JFrame("JList Demo");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(130,100);
        jfrm.setVisible(true);
        String names[] = {"Jeanne","Pereira"};
        JList jList;
        jList = new JList<>(names);
        jList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane jScrollPane = new JScrollPane(jList);
        jScrollPane.setPreferredSize(new Dimension(200,200));
        jfrm.add(jList);
        jfrm.add(jScrollPane);
        
    
}
