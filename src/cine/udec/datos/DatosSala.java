/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine.udec.datos;

import java.util.Scanner;


/**
 *
 * @author user
 */
public class DatosSala {
    private Scanner teclado;
    
    /**
     * constructor
     */
    public DatosSala(){
        teclado = new Scanner(System.in);
        preguntar();
    }
    /**
     * metodo que almacena las filas y columnas
     */
   private void preguntar(){
        byte silla;
        System.out.print("Que silla desea?: ");
        silla = teclado.nextByte();
        Sillas sillas[] = new Sillas[sillas];
    }
}
