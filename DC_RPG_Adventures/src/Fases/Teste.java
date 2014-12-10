package Fases;


import Fases.Jogo.PersonagemEnum;
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
public class Teste {
    public static void main(String args[]) {
         Jogo jogo1 = new Jogo();
         jogo1.criarJogo();
        final byte op = Byte.parseByte(JOptionPane.showInputDialog("Selecione uma opcao: 1:Heroi 2:Vilao\n"
                + "Qualquer outra opção sera considerada Heroi"));
        if(op != 2) Jogo.setTimeEscolhido(PersonagemEnum.HEROI);
        else Jogo.setTimeEscolhido(PersonagemEnum.VILAO);
        // Cria o quadro na thread de despacho
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SelecaoPersonagensTime();
            }
        });
        jogo1.time.get(1).mostraItens();
    }
    
}
