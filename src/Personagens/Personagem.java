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
public abstract class Personagem implements Lutavel,Interagivel,Comparable<Personagem>{
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
    /* character points pode ser usado para melhorar habilidades e poderes
       depois que o heroi ou vilao tem sido criado
    */
    protected int characterPoints; 
    protected ArrayList<Poder> power; // Poderes do personagem
    protected int currentResistence; // resistencia atual do personagem
    protected Item itens[];
    
    public abstract void atacar();
    public abstract void defender();
    public abstract void mover();
    public void interagir() {
        
    }
    @Override 
    public int compareTo(Personagem personagemDeFora) {
        int tam = personagemDeFora.name.length();
        if(this.name.length() > personagemDeFora.name.length()) tam = this.name.length();
        for(int i = 0; i < tam; i++)
            if(this.name.charAt(i) > personagemDeFora.name.charAt(i))
               return 1;
        if(this.name.equals(personagemDeFora.name))
                return 0;
        else
            return -1;
    
    }
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Personagem) {
           Personagem personagem  = (Personagem) obj;
           return this.name.equals(personagem.name);
        }
        else 
            return false;
    }
    @Override
    public String toString() {
        String s;
        s = "\nName: "+this.name+"\nHeight: "+Float.toString(this.height)+"\nReflexes: "+Integer.toString(this.reflexes)+"\nPhysique: "+Integer.toString(this.physique)+
                "\nKnowledge: "+Integer.toString(this.knowledge)+"\nPerception: "+Integer.toString(this.perception)+"\nPresence: "+Integer.toString(this.presence)+
                "\nSpeed: "+Integer.toString(this.speed)+"\nUnarmed BDV: "+Integer.toString(this.unarmedBDV)+"\nP/L Bonus: "+Integer.toString(this.p_l_bonus)+
                "\nCharacter Points: "+Integer.toString(this.characterPoints)+"\nCurrent Resistence: "+Integer.toString(this.currentResistence);
        return s;
    }
    
}
