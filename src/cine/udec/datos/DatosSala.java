/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine.udec.datos;

import cine.udec.DibujarCine;
import java.util.Scanner;


/**
 *
 * @author kenny
 */
public class DatosSala {
    private Scanner teclado;
    
    /**
     * constructor
     */
    public DatosSala(){
        teclado = new Scanner(System.in); 
        tamaSala();
        preguntar();
       
    }
    private void tamaSala(){
        int filas, columnas;
        System.out.print("cuantas filas tendra la sala?:");
        filas = teclado.nextInt();
        System.out.print("cuantas columnas tendra la sala?:");
        columnas = teclado.nextInt();
        DibujarCine dibujarCine= new DibujarCine(filas,columnas);
        dibujarCine.titulo();
        dibujarCine.sala();
    }
    /**
     * metodo que almacena las filas y columnas
     */
   private void preguntar(){
        int silla, edad, nroDocumento;
        String nombre, genero;
        System.out.print("Que silla desea?: ");
        silla = teclado.nextInt();
        System.out.print("Ingrese su nombre: ");
        nombre = teclado.next();
        System.out.print("ingrese su edad: ");
        edad = teclado.nextInt();
        System.out.print("ingrese su numero de documento: ");
        nroDocumento = teclado.nextInt();
        System.out.print("ingrese su genero(masculino/femenino): ");
        genero = teclado.next();
        Sillas silla1 = new Sillas(silla,nombre, edad, nroDocumento, genero);
        System.out.println(silla1.mostrarDato());
        
    }
}
