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
public class Terreno {

    //declaramos variables en esta clase que serán de tipo privado.
    private double costo;
    private double ancho;
    private double largo;
    private double area;
    private double valorMetroCuadrado;

    // creamos los métodos establecer que recibe los parámetros.
    public void establecerAncho(double n) {
        ancho = n;
    }

    public void establecerLargo(double n) {
        largo = n;
    }

    public void establecerValorMetroCuadrado(double n) {
        valorMetroCuadrado = n;
    }

    public void establecerArea() {
        area = ancho * largo;
    }

    public void calcularCosto() {
        costo = area * valorMetroCuadrado;
    }

    // creamos los métodos obtener que nos retornará el valor que le demos al
    // método establecer.
    public double obtenerCosto() {
        return costo;
    }

    public double obtenerArea() {
        return area;
    }

    public double obtenerAncho() {
        return ancho;
    }

    public double obtenerLargo() {
        return largo;
    }

    public double obtenerValorMetroCuadrado() {
        return valorMetroCuadrado;
    }

}
