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
public interface Lutavel {
    public abstract void atacar(ArrayList<Personagem> timePersonagens);
    public abstract void defender();
}
