/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Personagens;

import Fases.Ponto;
import java.util.ArrayList;
import javax.swing.JOptionPane;

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
    protected ArrayList<String> powers; // Poderes do personagem
    protected int currentResistence; // resistencia atual do personagem
    protected Item itens[];
    protected Ponto posicao;
    
    protected static final int MIN_CHARACTER_POINTS = 1;
    protected static final int MAX_CHARACTER_POINTS = 400;
    protected static final int MAX_PERSONAGENS_TIME = 4;
    
    public abstract void atacar(Personagem timePersonagens[]);
    public abstract void defender();

    public abstract void mover();
    public void interagir() {
        byte msg;
        msg = Byte.parseByte(JOptionPane.showInputDialog("Escolha uma mensagem: \n 1. Vou investigar o mapa"    
                    +"2. Vou enfrentar o vilao"));   
        
    }

    public Personagem(String name, float height, int reflexes, int physique, 
                        int knowledge, int perception, int presence, int speed, int unarmedBDV, 
                        int p_l_bonus, int characterPoints, int currentResistence,float x,float y) {
        this.name = name;
        this.height = height;
        this.reflexes = reflexes;
        this.physique = physique;
        this.knowledge = knowledge;
        this.perception = perception;
        this.presence = presence;
        this.speed = speed;
        this.unarmedBDV = unarmedBDV;
        this.p_l_bonus = p_l_bonus;
        this.characterPoints = characterPoints;
        this.currentResistence = currentResistence;
        this.itens = new Item[10];
        this.itens = Item.inicializaItens(this.itens);
        this.powers = new ArrayList<>();
        posicao = new Ponto(x,y);
    }
    
     public Personagem() {
        this.name = "";
        this.height = 0.00F;
        this.reflexes = 0;
        this.physique = 0;
        this.knowledge = 0;
        this.perception = 0;
        this.presence = 0;
        this.speed = 0;
        this.unarmedBDV = 0;
        this.p_l_bonus = 0;
        this.characterPoints = 0;
        this.currentResistence = 0;
        this.itens = new Item[12];
        this.powers = new ArrayList<>();
        this.posicao = new Ponto();
    }

    public Personagem(Personagem personagemOriginal) {
        this.name = personagemOriginal.name;
        this.height = personagemOriginal.height;
        this.reflexes = personagemOriginal.reflexes;
        this.physique = personagemOriginal.physique;
        this.knowledge = personagemOriginal.knowledge;
        this.perception = personagemOriginal.perception;
        this.presence = personagemOriginal.presence;
        this.speed = personagemOriginal.speed;
        this.unarmedBDV = personagemOriginal.unarmedBDV;
        this.p_l_bonus = personagemOriginal.p_l_bonus;
        this.characterPoints = personagemOriginal.characterPoints;
        this.currentResistence = personagemOriginal.currentResistence;
        this.itens = new Item[12];
        this.itens = personagemOriginal.itens;
        this.powers = new ArrayList<>();
        this.powers.addAll(personagemOriginal.powers);
        this.posicao = new Ponto(personagemOriginal.posicao);
        
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setReflexes(int reflexes) {
        this.reflexes = (reflexes >= 1 && reflexes <= 3)?reflexes:0;
    }

    public void setPhysique(int physique) {
        this.physique = (physique >= 1 && physique <= 3)?physique:0;
    }

    public void setKnowledge(int knowledge) {
        this.knowledge = (knowledge >= 1 && knowledge <= 3)?knowledge:0;
    }

    public void setPerception(int perception) {
        this.perception = (perception >= 1 && perception <= 3)?perception:0;
    }

    public void setPresence(int presence) {
        this.presence = (presence >= 1 && presence <= 3)?presence:0;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setUnarmedBDV(int unarmedBDV) {
        this.unarmedBDV = (unarmedBDV >= 1 && unarmedBDV >= 10)?unarmedBDV:0;
    }

    public void setP_l_bonus(int p_l_bonus) {
        this.p_l_bonus = (p_l_bonus >=1 && p_l_bonus <= 10)?p_l_bonus:0;
    }

    public void setCharacterPoints(int characterPoints) {
        this.characterPoints = (characterPoints >= Personagem.MIN_CHARACTER_POINTS && characterPoints <= Personagem.MAX_CHARACTER_POINTS)?characterPoints:0;
    }

    public void setPowers(ArrayList<String> powers) {
        this.powers = powers;
    }

    public void setCurrentResistence(int currentResistence) {
        this.currentResistence = (currentResistence >= 0 && currentResistence <= 100)?currentResistence:0;
    }

    public void setItens(Item[] itens) {
        this.itens = itens;
    }
    
    public String getName() {
        return name;
    }

    public float getHeight() {
        return height;
    }

    public int getReflexes() {
        return reflexes;
    }

    public int getPhysique() {
        return physique;
    }

    public int getKnowledge() {
        return knowledge;
    }

    public int getPerception() {
        return perception;
    }

    public int getPresence() {
        return presence;
    }

    public int getSpeed() {
        return speed;
    }

    public int getUnarmedBDV() {
        return unarmedBDV;
    }

    public int getP_l_bonus() {
        return p_l_bonus;
    }

    public int getCharacterPoints() {
        return characterPoints;
    }

    public ArrayList<String> getPowers() {
        return powers;
    }

    public int getCurrentResistence() {
        return currentResistence;
    }

    public Item[] getItens() {
        return itens;
    }

    public static int getMIN_CHARACTER_POINTS() {
        return MIN_CHARACTER_POINTS;
    }

    public static int getMAX_CHARACTER_POINTS() {
        return MAX_CHARACTER_POINTS;
    }
    
    public Ponto getPosicao() {
        return posicao;
    }

    public static int getMAX_PERSONAGENS_TIME() {
        return MAX_PERSONAGENS_TIME;
    }
    
    public abstract void inicializaPoderes();
    @Override 
    public int compareTo(Personagem personagemDeFora) {
        return this.name.compareTo(personagemDeFora.name);
    
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
