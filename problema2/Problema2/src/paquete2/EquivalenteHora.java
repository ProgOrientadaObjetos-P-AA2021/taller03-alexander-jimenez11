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
public class EquivalenteHora {

    private int cantidadHoras;
    private int valorMinutos;
    private int valorSegundos;
    private int valorDias;

    public void establecerCantidadHoras(int c) {
        cantidadHoras = c;
    }

    public void calcularValorMinutos() {
        valorMinutos = cantidadHoras * 60;
    }

    public void calcularValorSegundos() {
        valorSegundos = cantidadHoras * 3600;
    }

    public void calcularValorDias() {
        valorDias = cantidadHoras / 24;
    }

    public int obtenerCantidadHoras() {
        return cantidadHoras;
    }

    public int obtenerValorMinutos() {
        return valorMinutos;
    }

    public int obtenerValorSegundos() {
        return valorSegundos;
    }

    public int obtenerValorDias() {
        return valorDias;
    }
}
