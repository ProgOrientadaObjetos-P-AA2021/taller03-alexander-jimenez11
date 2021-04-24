/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import paquete2.Terreno;

/**
 *
 * @author Alexander
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear el objeto 1 de tipo Terreno ct
        Terreno ct = new Terreno();
        // Uso los métodos establecer para darle valores a los 
        // atributos del objeto.
        ct.establecerAncho(10);
        ct.establecerLargo(12);
        ct.establecerValorMetroCuadrado(340.00);
        ct.establecerArea();
        ct.calcularCosto();
        // Crear el objeto 2 de tipo Terreno ct2
        Terreno ct2 = new Terreno();
        // Uso los métodos establecer para darle valores a los 
        // atributos del objeto.
        ct2.establecerAncho(10);
        ct2.establecerLargo(10);
        ct2.establecerValorMetroCuadrado(340.00);
        ct2.establecerArea();
        ct2.calcularCosto();
        // Presentamos en pantalla
        System.out.printf("\n<< DETALLES DEL TERRENO 1 >>\nAncho del terreno: "
                + "%.2f mtrs\nLongitud del terreno: %.2f mtrs\nValor por metro "
                + "cuadrado: $ %.2f\nCosto del terreno: $ %.2f\n\n",
                ct.obtenerAncho(), ct.obtenerLargo(),
                ct.obtenerValorMetroCuadrado(), ct.obtenerCosto());

        System.out.printf("\n<< DETALLES DEL TERRENO 2 >>\nAncho del terreno: "
                + "%.2f mtrs\nLongitud del terreno: %.2f mtrs\nValor por metro "
                + "cuadrado: $ %.2f\nCosto del terreno: $ %.2f\n\n",
                ct2.obtenerAncho(), ct2.obtenerLargo(),
                ct2.obtenerValorMetroCuadrado(), ct2.obtenerCosto());

    }
}
