/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Personagens;

import javax.swing.JOptionPane;

/**
 *
 * @author Jeanne
 */
public class Item implements Coletavel,Interagivel{
    private String name;
    private String description;
    private static final short MAX_ITENS = 10;
    

    public Item(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Item() {
        this.name = "";
        this.description = "";
    }

    public Item(Item itemOriginal) {
        this.name = itemOriginal.name;
        this.description = itemOriginal.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public static Item[] inicializaTodosItens() {
        Item itens[] = new Item[Item.MAX_ITENS];
        for(int i = 0; i < Item.MAX_ITENS; i++) {
            itens[i].name = "Item"+Integer.toString(i);
            switch(i) {
                case 1:
                    itens[i].description = "Aumenta Reflexos";
                case 2:
                    itens[i].description = "Aumenta forca fisica";
                case 3:
                    itens[i].description = "Aumenta conhecimento";
                case 4:
                    itens[i].description = "Aumenta percepcao";
                case 5:
                    itens[i].description = "Aumenta presenca";
                case 6:
                    itens[i].description = "Aumenta velocidade";
                case 7:
                    itens[i].description = "Aumenta pontos de Personagem";
                case 8: 
                    itens[i].description = "Aumenta pontos de Heroi ou de Vilao";
                case 9:
                    itens[i].description = "Aumenta resistencia atual";
                case 10:
                    itens[i].description = "Traz um membro de volta";
                
            }
        }
        return itens;
            
    }

    public static short getMAX_ITENS() {
        return MAX_ITENS;
    }
    
    public static Item[] inicializaItens(Item itens[]) {
        for(int i = 0; i < itens.length; i++) {
            itens[i].name = "";
            itens[i].description = "";
        }
        return itens;
    }
    @Override
    public void coletar(int i,Item itens[]) {
        if(i >= 0 && i < Item.MAX_ITENS) {
            Item todosItens[] = new Item[Item.MAX_ITENS];
            todosItens = inicializaTodosItens();
            itens[i] = todosItens[i];
        }
    }
    
    public void usarItem(int i,Item itens[]) {
        if(i >=0 && i < Item.MAX_ITENS)
           itens[i] = null; 
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Item) { 
            Item I = (Item) obj;
            return (this.name.equals(I.name) && this.description.equals(I.description));
        }
        return false;
    
    }
    
    @Override
    public String toString() {
        String s;
        s = "Nome: "+this.name+"Descricao: "+this.description+"\n";
        return s;
    }
    

    @Override
    public void interagir() {
        byte msg;
        msg = Byte.parseByte(JOptionPane.showInputDialog("Interagir com o item? 1- sim 2- nao"));
    }
    
}
