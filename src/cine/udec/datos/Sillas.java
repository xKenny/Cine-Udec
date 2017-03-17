/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine.udec.datos;

/**
 *
 * @author kenny
 */
public class Sillas {
    
    /**
     * Atributos de la clase
     */
    private int nroSilla;
    private String nombre;
    private int edad;
    private int nroDocumento;
    private String genero;
    
    /**
     *constructor
     * @param nroSilla
     * @param nombre
     * @param edad
     * @param nroDocumento
     * @param genero
     */
    public Sillas(int nroSilla, String nombre, int edad, int nroDocumento, String genero){
        this.nroSilla = nroSilla;
        this.nombre = nombre;
        this.edad = edad;
        this.nroDocumento = nroDocumento;
        this.genero = genero;
    }
    public String mostrarDato(){
        return "La silla "+nroSilla+" ha sido comprada por "+nombre+" de edad "+edad+" identificado con el numero de documento "+nroDocumento+" de genero "+genero+"";
    }
    
    
    
    /*Metodos Getter and Setter*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public int getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(int nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getNroSilla() {
        return nroSilla;
    }

    public void setNroSilla(byte nroSilla) {
        this.nroSilla = nroSilla;
    }
    
}
