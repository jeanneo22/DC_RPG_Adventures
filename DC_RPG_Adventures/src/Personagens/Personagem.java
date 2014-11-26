/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Personagens;

import java.util.ArrayList;

/**
 *
 * @author Jeanne
 */
public abstract class Personagem implements Lutavel,Interagivel{
    protected String name; // Nome do personagem
    protected float height; // Altura do personagem
    protected int reflexes; // indica reflexos do personagem
    protected int physique; // indica o fisico do personagem
    protected int knowledge; // indica o conhecimento do personagem
    protected int perception; // indica a percepcao do personagem
    protected int presence; // indica a influencia do personagem
    protected int speed; // velocidade do personagem
    protected int unarmedBDV; // valor basico de dano para persoangens desarmados
    protected int p_l_bonus; // bonus de dano dado para persoangens armados
    /* pode ser usado para melhorar habilidades e poderes
       depois que o heroi ou vilao tem sido criado
    */
    protected int characterPoints; 
    protected ArrayList<Poder> power; // Poderes do personagem
    protected int currentResistence; // resistencia atual do personagem
    
    public abstract void atacar();
    public abstract void defender();
    public abstract void mover();
    public void interagir() {
        
    }
    
}
