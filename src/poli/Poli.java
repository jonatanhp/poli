/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poli;
import java.util.Scanner;

import poli.entities.*;
/**
 *
 * @author jonatan
 */
public class Poli {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        Figura2D fig = null;
        int opt = 0;
        do {
            System.out.println("***** PAINT *****");
            System.out.println("1 Circle ");
            System.out.println("2 Rectangle ");
            System.out.println("3 Triangle ");
            System.out.println("0 exit. Choice option: ");
            opt = input.nextInt();
            input.nextLine(); // Limpiar el buffer
            switch (opt) {
                case 1:
                    System.out.println("****** 1 Circle *****");
                    fig = new Circle();
                    fig.paint();
                    fig.calArea();
                    break;
                case 2:
                    System.out.println("**** 2 Rectangle ****");
                    fig = new Rectangle();
                    fig.paint();
                    fig.calArea();
                    break;
                case 3:
                    System.out.println("**** 3 Triangle ****");
                    fig = new Triangle();

                    fig.paint();
                    fig.calArea();
                    break;
                case 0:
                    System.out.println("**** Gracias ****");
                    break;
                default:
                    System.out.println("OT Incorrecto");
                    break;
            }
            
        } while (opt != 0);
    }
    
}
