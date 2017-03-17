/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine.udec;

/**
 *
 * @author kenny & David 
 */
public class DibujarCine {
   
    /*atributos de las clase*/
    private int filas;
    private int columnas;
    private int general;
    private int prefere;
    private int ejecuti;
    /**
     * constructor
     * @param filas
     * @param columnas
     * @param general
     * @param prefere
     * @param ejecuti
     */
    public DibujarCine(int filas, int columnas, int general, int prefere, int ejecuti){
       this.filas = filas;
       this.columnas = columnas;
       this.general = general;
       this.prefere = prefere;
       this.ejecuti = ejecuti;
    }
    /**
     * este metodo da el mensaje de bienvenida
     */
    public void titulo(){
        System.out.println("-------------- BIENVENIDO------------------");
        System.out.println("---------------CINE UDEC------------------");
    }    
    /**
     * con este metodo dibujamos la sala de cine en consola
     */
    public void sala(){
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
    /*metodos Getter and Setter de los atributos*/
    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    public int getGeneral() {
        return general;
    }

    public void setGeneral(int general) {
        this.general = general;
    }

    public int getPrefere() {
        return prefere;
    }

    public void setPrefere(int prefere) {
        this.prefere = prefere;
    }

    public int getEjecuti() {
        return ejecuti;
    }

    public void setEjecuti(int ejecuti) {
        this.ejecuti = ejecuti;

    }
}

