/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Personagens;

/**
 *
 * @author Jeanne
 */
public class Item implements Coletavel{
    private String name;
    private String description;

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
    
    public static Item[] inicializaTodosItens(int tam) {
        Item itens[] = new Item[tam];
        for(int i = 0; i < tam; i++) {
            itens[i].name = "Item"+Integer.toString(i);
            switch(i) {
                case 1:
                    itens[i].description = "Aumenta Reflexos temporariamente";
                case 2:
                    itens[i].description = "Aumenta forca fisica temporariamente";
                case 3:
                    itens[i].description = "Aumenta conhecimento temporariamente";
                case 4:
                    itens[i].description = "Aumenta percepcao temporariamente";
                case 5:
                    itens[i].description = "Aumenta presenca temporariamente";
                case 6:
                    itens[i].description = "Aumenta velocidade temporariamente";
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
    
    public static Item[] inicializaItens(Item itens[]) {
        for(int i = 0; i < itens.length; i++) {
            itens[i].name = "";
            itens[i].description = "";
        }
        return itens;
    }
    @Override
    public void coletar(int i,Item itens[]) {
        Item todosItens[] = new Item[10];
        todosItens = inicializaTodosItens(todosItens.length);
        itens[i] = todosItens[i];
    }
    
}
