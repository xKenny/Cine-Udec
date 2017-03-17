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
 * @author kenny & David
 */
public class DatosSala {
    private Scanner teclado;
    private int sillasTotales;
    /**
     * constructor
     */
    public DatosSala(){
        teclado = new Scanner(System.in); 
        tamaSala();
        preguntar();
       
    }
    /*metodo que pide los datos principales para dibujar la sala*/
    private void tamaSala(){
        int filas, columnas, general, prefere, ejecuti, cont = 0;
        System.out.print("cuantas filas tendra la sala?:");
        filas = teclado.nextInt();
        System.out.print("cuantas columnas tendra la sala?:");
        columnas = teclado.nextInt();
        System.out.print("cuantas filas generales desea?");
        general = teclado.nextInt();
        cont=cont+general;
        validarFilas(cont, filas);
        System.out.print("cuantas filas preferenciales desea?: ");
        prefere = teclado.nextInt();
        cont=cont+prefere;
        validarFilas(cont, filas);
        System.out.print("cuantas filas ejecutivas desea?: ");
        ejecuti = teclado.nextInt();
        cont=cont+ejecuti;
        validarFilas(cont, filas);
        DibujarCine dibujarCine= new DibujarCine(filas,columnas,general,prefere,ejecuti);
        dibujarCine.titulo();
        dibujarCine.sala();
        sillasTotales=filas*columnas;
    }
    /**
     * metodo que almacena los datos del usuario y efectua la compra
     */
   private void preguntar(){
        Sillas[] sillas = new Sillas[sillasTotales];
        int silla, edad, nroDocumento;
        String nombre, genero, comprar, error;
        do{
        System.out.print("Que silla desea?: ");
        silla = teclado.nextInt();
        if(silla>sillasTotales){
            System.out.print("numero de silla no valido");
            break;
        }
        System.out.print("Ingrese su nombre: ");
        nombre = teclado.next();
        System.out.print("ingrese su edad: ");
        edad = teclado.nextInt();
        System.out.print("ingrese su numero de documento: ");
        nroDocumento = teclado.nextInt();
        System.out.print("ingrese su genero(masculino/femenino): ");
        genero = teclado.next();
        sillas[silla] = new Sillas(silla,nombre, edad, nroDocumento, genero);
        System.out.println(sillas[silla].pelicula());
        System.out.println("El valor de la boleta es de"+sillas[silla].validarPrecio()+"");
        System.out.println("Desea confirmar la compra?(si/no): ");
        comprar = teclado.next();
        if("si".equals(comprar))
            System.out.println(sillas[silla].mostrarDato());
        System.out.println("Desea realizar otra compra?(si/no): ");
        error = teclado.next();
        }while("si".equals(error));   
    }
   /*metodo que valida si hay filas disponibles*/
    private void validarFilas(int cont, int filas){
        if(cont>filas){
            System.out.println("Ha excedido la cantidad de filas disponibles");
        }
    }
}
