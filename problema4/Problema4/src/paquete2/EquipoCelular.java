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
public class EquipoCelular {

    private String sistemaOperativo;
    private String tamañoPantalla;
    private double costo;
    private String direccionMac;
    private String informacionIME;

    // métodos establecer para cada atributo
    public void establecerSistemaOperativo(String n) {
        sistemaOperativo = n;
    }

    public void establecerTamañoPantalla(String n) {
        tamañoPantalla = n;
    }

    public void establecerCosto(double n) {
        costo = n;
    }

    public void establecerDireccionMac(String n) {
        direccionMac = n;
    }

    public void establecerInformacionIME(String n) {
        informacionIME = n;
    }

    public String obtenerSistemaOperativo() {
        return sistemaOperativo;
    }

    public String obtenerTamañoPantalla() {
        return tamañoPantalla;
    }

    public double obtenerCosto() {
        return costo;
    }

    public String obtenerDireccionMac() {
        return direccionMac;
    }

    public String obtenerInformacionIME() {
        return informacionIME;
    }

}
