/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import paquete2.EquipoCelular;

/**
 *
 * @author Alexander
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        EquipoCelular ec = new EquipoCelular();
        ec.establecerSistemaOperativo("Android");
        ec.establecerTamañoPantalla("4.8''");
        ec.establecerCosto(750.99);
        ec.establecerDireccionMac("85:3H:27:UJ:24:62");
        ec.establecerInformacionIME("789654123578453");
        
         EquipoCelular ec2 = new EquipoCelular();
        ec2.establecerSistemaOperativo("iOS");
        ec2.establecerTamañoPantalla("3.5''");
        ec2.establecerCosto(455.29);
        ec2.establecerDireccionMac("95:4M:74:WA:37:68");
        ec2.establecerInformacionIME("5489632578965423");
        
        System.out.printf("\n<< EQUIPO CELULAR 1 >>\nSistema operativo: %s\nTamaño "
                + "de pantalla: %s\nCosto: %.2f\nDirección Mac: %s\nInformación IME:"
                + " %s\n", ec.obtenerSistemaOperativo(),
                ec.obtenerTamañoPantalla(), ec.obtenerCosto(),
                ec.obtenerDireccionMac(), ec.obtenerInformacionIME());

        System.out.printf("\n<< EQUIPO CELULAR 2 >>\nSistema operativo: %s\nTamaño "
                + "de pantalla: %s\nCosto: %.2f\nDirección Mac: %s\nInformación IME:"
                + " %s\n", ec2.obtenerSistemaOperativo(),
                ec2.obtenerTamañoPantalla(), ec2.obtenerCosto(),
                ec2.obtenerDireccionMac(), ec2.obtenerInformacionIME());
    }

}
