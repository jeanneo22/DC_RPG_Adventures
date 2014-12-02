/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Fases;

/**
 *
 * @author Jeanne
 */
public class Ponto {
    private float x;
    private float y;

    public Ponto(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Ponto() {
        this.x = 0.00F;
        this.y = 0.00F;
    }
    
    public Ponto(Ponto pontoOriginal) {
        this.x = pontoOriginal.x;
        this.y = pontoOriginal.y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
    
    public static float distancia(Ponto ponto1,Ponto ponto2) {
        return (float) Math.sqrt(Math.pow((ponto1.x-ponto2.x),2)+Math.pow((ponto1.y-ponto2.y),2));
    }
    
    @Override
    public String toString() {
        String s = "("+x+" , "+y+")";
        return s;
    } 
}
