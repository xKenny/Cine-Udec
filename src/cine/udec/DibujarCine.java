/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine.udec;

import java.util.Scanner;

/**
 *
 * @author kenny
 */
public class DibujarCine {
    private Scanner teclado;
    /**
     * constructor
     */
    public DibujarCine(){
        teclado = new Scanner(System.in);
        titulo();
    }
    /**
     * este metodo da el mensaje de bienvenida
     */
    private void titulo(){
        byte filas,columnas;
        System.out.println("-------------- BIENVENIDO------------------");
        System.out.println("---------------CINE UDEC------------------");
        System.out.println("\nIngrese el numero de filas:");
        filas = teclado.nextByte();
        System.out.println("\nIngrese el numero de columnas:");
        columnas = teclado.nextByte();
        sala(filas,columnas);
    }    
    /**
     * con este metodo dibujamos la sala de cine en consola
     */
    private void sala(byte filas, byte columnas){
        byte cont= 1, i, j;
        System.out.println();
        System.out.println("          ____________________          ");
        System.out.println("         |     PANTALLA       |        \n\n ");
        
        for(i=1; i<=filas; i++){
            for(j=1; j<=columnas; j++){
                if(cont<10){
                    System.out.print(" ||" + cont + " || ");
                }else{
                    System.out.print(" ||" + cont + "|| ");
                }
                cont = (byte) (cont+1);
            }
            System.out.println();
            System.out.println();
           }
        }
    }

