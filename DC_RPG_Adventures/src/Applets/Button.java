/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Applets;

import javax.swing.SwingUtilities;

/**
 *
 * @author Jeanne
 */
public class Button {
    public static void main(String args[]) {
        // Cria o quadro na thread de despacho
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                 new ListDemo();
                 ButtonDemo buttonDemo = new ButtonDemo();
            }
        });
    }
    
}
