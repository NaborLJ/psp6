/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psp6;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nabor
 */
public class Movimientos extends Thread {

    static int DINERO = 10;
    String movimientos;

    public Movimientos(String str) {
        super(str);
        this.movimientos = str;
    }

    synchronized void Ingreso() {
        DINERO++;
        System.out.println("Ingresando");
        System.out.println(DINERO);
        
    }

    synchronized void Retirada() {
        DINERO--;
        System.out.println("Retirando");
        System.out.println(DINERO);
    }

    @Override
    public void run() {
        if ("Ingreso".equals(movimientos)) {
            Ingreso();
           
        }
        if ("Retirada".equals(movimientos)) {
            Retirada();
           
        }

       
    }

}
