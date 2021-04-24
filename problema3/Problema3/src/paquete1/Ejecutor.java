/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import paquete2.InstitucionEducativa;

/**
 *
 * @author Alexander
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        InstitucionEducativa id = new InstitucionEducativa();
        id.establecerNombreInstitucion("Ciudad de Arenillas");
        id.establecerTipoInstitucion("Pública");
        id.establecerNumeroAlumnos(750);
        id.establecerNumeroDocentes(45);
        id.establecerNumeroSede(1);

        InstitucionEducativa id2 = new InstitucionEducativa();
        id2.establecerNombreInstitucion("Santo Thomas de Aquino");
        id2.establecerTipoInstitucion("Privada");
        id2.establecerNumeroAlumnos(550);
        id2.establecerNumeroDocentes(37);
        id2.establecerNumeroSede(1);
        
        System.out.printf("\n<< INSTITUCIÓN EDUCATIVA 1 >>\nNombre: %s\nTipo: %s\n"
                + "Número de alumnos: %d\nNúmero de docentes: %d\nNúmero de sede:"
                + " %d\n\n", id.obtenerNombreInstitucion(),
                id.obtenerTipoInstitucion(), id.obtenerNumeroAlumnos(),
                id.obtenerNumeroDocentes(), id.obtenerNumeroSede());

        System.out.printf("\n<< INSTITUCIÓN EDUCATIVA 2 >>\nNombre: %s\nTipo: %s\n"
                + "Número de alumnos: %d\nNúmero de docentes: %d\nNúmero de sede:"
                + " %d\n\n", id2.obtenerNombreInstitucion(),
                id2.obtenerTipoInstitucion(), id2.obtenerNumeroAlumnos(),
                id2.obtenerNumeroDocentes(), id2.obtenerNumeroSede());
    }

}
