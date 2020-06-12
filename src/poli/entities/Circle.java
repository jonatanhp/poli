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
public class Circle extends Figura2D {
    public int radius=10;

    @Override
    public void paint() {
        super.paint();
        System.out.println("Circle.paint()");
    }

    @Override
    public void calArea(){
        System.out.println("Circle.calArea()="+ 3.1416*radius*radius);
    }
}
