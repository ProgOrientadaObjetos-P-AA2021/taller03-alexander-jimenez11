/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import paquete2.EquivalenteHora;

/**
 *
 * @author Alexander
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        EquivalenteHora eh = new EquivalenteHora();
        eh.establecerCantidadHoras(48);
        eh.calcularValorMinutos();
        eh.calcularValorSegundos();
        eh.calcularValorDias();

        EquivalenteHora eh2 = new EquivalenteHora();
        eh2.establecerCantidadHoras(120);
        eh2.calcularValorMinutos();
        eh2.calcularValorSegundos();
        eh2.calcularValorDias();

        System.out.printf("\n<< CONVERSIÓN 1 >>\nHoras: %d\nMinutos: %d\n"
                + "Segundos: %d\nDías: %d\n\n", eh.obtenerCantidadHoras(),
                eh.obtenerValorMinutos(), eh.obtenerValorSegundos(),
                eh.obtenerValorDias());

        System.out.printf("\n<< CONVERSIÓN 2 >>\nHoras: %d\nMinutos: %d\n"
                + "Segundos: %d\nDías: %d\n\n", eh2.obtenerCantidadHoras(),
                eh2.obtenerValorMinutos(), eh2.obtenerValorSegundos(),
                eh2.obtenerValorDias());
    }
}
