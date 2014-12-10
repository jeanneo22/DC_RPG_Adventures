/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Personagens;

import Fases.Ponto;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeanne
 */
public abstract class Personagem implements Lutavel,Interagivel,Comparable<Personagem>,ActionListener{
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
    protected boolean defesaAtiva; // indica se o personagem esta se defendendo
    protected ArrayList<String> powers; // Poderes do personagem
    protected int currentResistence; // resistencia atual do personagem
    protected Item itens[];
    protected Ponto posicaoPersonagem;
    
    protected static final int MIN_CHARACTER_POINTS = 1;
    protected static final int MAX_CHARACTER_POINTS = 400;
    protected static final int MAX_PERSONAGENS_TIME = 4;
    protected static final int MIN_CURRENT_RESISTENCE = 0;
    protected static final int MAX_CURRENT_RESISTENCE = 100;
    
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
        this.posicaoPersonagem = new Ponto(x,y);
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
        this.posicaoPersonagem = new Ponto();
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
        this.posicaoPersonagem = new Ponto(personagemOriginal.posicaoPersonagem);
        
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

    public void setDefesaAtiva(boolean defesaAtiva) {
        this.defesaAtiva = (defesaAtiva == true || defesaAtiva==false)?defesaAtiva:false;
    }

    public void setPowers(ArrayList<String> powers) {
        this.powers = powers;
    }

    public void setCurrentResistence(int currentResistence) {
        this.currentResistence = (currentResistence >= Personagem.MIN_CURRENT_RESISTENCE && currentResistence <= Personagem.MAX_CURRENT_RESISTENCE)?currentResistence:0;
    }

    public void setItens(Item[] itens) {
        this.itens = itens;
    }
    
    public void setPosicaoPersonagem(float x,float y) {
        this.posicaoPersonagem.setX(x);
        this.posicaoPersonagem.setY(y);
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

    public boolean isDefesaAtiva() {
        return defesaAtiva;
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
        return posicaoPersonagem;
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
    
    private JLabel jlab;
    private JFrame jframe;
    public void mostraItens() {

        
        // Cria um contêiner JFrame.
        jframe = new JFrame("Selecione uma opcao");
        
        //Especifica FlowLayout com gerenciador de leiaute
       jframe.setLayout(new FlowLayout());
       
       // Fornece um tamanho inicial para o quadro
       jframe.setSize(220,90);
       
       // Encerra o programa quando o usuario fecha o aplicativo
       jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       //Cria dois botoes.
       JButton cltItem = new JButton("COLETAR ITEM");
       JButton vItem = new JButton("VER ITENS");
       JButton uItem = new JButton("USAR ITEM");
       
       
       //Adiciona ouvintes de ação
       cltItem.addActionListener((ActionListener) this);
       vItem.addActionListener((ActionListener) this);
       uItem.addActionListener((ActionListener) this);
       
       //Adiciona dois botões ao painel de conteúdo
       jframe.add(cltItem);
       jframe.add(vItem);
       jframe.add(uItem);
       
       //Cria um rotulo
       jlab = new JLabel("Faça uma escolha para sair feche");
       jframe.add(jlab); 
       
       //Adiciona o rótulo ao quadro
       jframe.add(jlab);
       
       // Exibe o quadro
       jframe.setVisible(true);
    }
       
       // Trata eventos de ação
        @Override
        public void actionPerformed(ActionEvent e) {
            byte i;
            if(e.getActionCommand().equals("COLETAR ITEM")) {
               i = Byte.parseByte(JOptionPane.showInputDialog("Digite um valor inteiro para o item(1-10)\n"));
               this.itens[i].coletar(i-1,itens);
               jframe.setVisible(false);
               
            }
            else if(e.getActionCommand().equals("VER ITENS")) {
                 JOptionPane.showMessageDialog(null,itens);
                 jframe.setVisible(false);
            }
            else if(e.getActionCommand().equals("USAR ITEM")) {
                 i = Byte.parseByte(JOptionPane.showInputDialog("Digite um valor inteiro para o item(1-10)\n"));
                 this.itens[i].usarItem(i-1,itens);
            }
        }
}
