/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author Alexander
 */
public class InstitucionEducativa {

    private String nombreInstitucion;
    private String tipoInstitucion;
    private int numeroAlumnos;
    private int numeroDocentes;
    private int numeroSede;

    // métodos establecer para cada atributo
    public void establecerNombreInstitucion(String n) {
        nombreInstitucion = n;
    }

    public void establecerTipoInstitucion(String n) {
        tipoInstitucion = n;
    }

    public void establecerNumeroAlumnos(int n) {
        numeroAlumnos = n;
    }

    public void establecerNumeroDocentes(int n) {
        numeroDocentes = n;
    }

    public void establecerNumeroSede(int n) {
        numeroSede = n;
    }

    public String obtenerNombreInstitucion() {
        return nombreInstitucion;
    }

    public String obtenerTipoInstitucion() {
        return tipoInstitucion;
    }

    public int obtenerNumeroAlumnos() {
        return numeroAlumnos;
    }

    public int obtenerNumeroDocentes() {
        return numeroDocentes;
    }

    public int obtenerNumeroSede() {
        return numeroSede;
    }

}
