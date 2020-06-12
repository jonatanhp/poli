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
public class Triangle extends Figura2D {

    public int base=4;
    public int altura=5;
    
    @Override
    public void paint(){
        System.out.println("triangulo");
    }

    @Override
    public void calArea() {
        int area=base*altura/2;
        System.out.println("el area es: "+area);
    }

    
}
