/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine.udec.datos;

import cine.udec.DibujarCine;
import java.util.Scanner;


/**
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
        if(cont<filas){
            System.out.print("cuantas filas preferenciales desea?: ");
            prefere = teclado.nextInt();
            cont=cont+prefere;
            validarFilas(cont, filas);
        }else{
            prefere=0;
        }
        DibujarCine dibujarCine= new DibujarCine(filas,columnas,general,prefere);
        dibujarCine.titulo();
        dibujarCine.sala();
        sillasTotales=filas*columnas;
    }
    /**
     * metodo que efectua la compra de la silla
     */
   private void preguntar(){
        Sillas[] sillas = new Sillas[sillasTotales];
        int silla= sillasTotales+1;
        String nombre;
        boolean error = true;
        do{
            while(error){
                System.out.print("Que silla desea?: ");
                 silla = teclado.nextInt();
                 error = silla>sillasTotales;
                 if(silla>sillasTotales)
                     System.out.println("error esta silla no existe");
            }
            sillas[silla] = new Sillas(silla);
            sillas[silla].datosSilla();
            System.out.println("Desea ingresar otra compra?(si/no): ");
             }while("si".equals(teclado.next()));
        System.out.println("vuelva pronto");
    }
   /*metodo que valida si hay filas disponibles*/
    private void validarFilas(int cont, int filas){
        if(cont>filas){
            System.out.println("Ha excedido la cantidad de filas disponibles");
        }

    }
}
