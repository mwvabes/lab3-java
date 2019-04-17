/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp;

/**
 *
 * @author student
 */
public class JavaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello world");
        Pomieszczenie p1 = new Pomieszczenie();
        p1.x = 5;
        p1.y = 10;
        p1.pietro = 1;
        //ElementPietra zm;
        //zm = p1;
        //ElementPietra zm = new ElementPietra();

        
        
        ElementPietra [] tab1 = new ElementPietra[2];
        
        tab1[0] = p1;
        tab1[1] = new Pomieszczenie();
        
        System.out.println("Iksde1");
        System.out.println("Iksde2");
        System.out.println("Iksde3");
        System.out.println("Iksde4");
        System.out.println("Iksde5");
        
        System.out.println("All right that's all");
        
        
    }
    
}
