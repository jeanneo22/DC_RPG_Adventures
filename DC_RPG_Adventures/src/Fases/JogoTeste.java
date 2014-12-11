package Fases;


import Fases.Jogo.PersonagemEnum;
import Personagens.Herois.Aquaman;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jeanne
 */
public class JogoTeste {
    public static void main(String args[]) {
        Jogo jogo1 = new Jogo();
        jogo1.selecionarTime();
        // Cria o quadro na thread de despacho
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                SelecaoPersonagensTime selecaoPersonagensTime = new SelecaoPersonagensTime();
            }
        });
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                SelecaoBatalha selecaoBatalha = new SelecaoBatalha();
            }
        });
    }
    
}
