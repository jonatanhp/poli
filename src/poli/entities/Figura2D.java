/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poli.entities;

/**
 *
 * @author jonatan
 */
public abstract class Figura2D {
     public int x;
    public int y;
    
    public abstract void calArea();

    public void paint() {
        System.out.println("Figura2D.paint()");
    }

}
