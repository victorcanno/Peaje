/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peaje.principal;

import peaje.Auto;
import peaje.Camion2Eje;
import peaje.CamionEje;
import peaje.Moto;
import peaje.Vehiculo;

/**
 *
 * @author s204e3
 */
public class Peaje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Vehiculo[] lista = new Vehiculo[4];
        lista[0] = new Auto("132-ABC", "Renault");
        lista[1] = new Moto("134-ABC", "Yamaha");
        lista[2] = new CamionEje("142-ABC", "Toyota");
        lista[3] = new Camion2Eje("152-ABC", "Toyota");
        
        for (Vehiculo lista1 : lista) {
            System.out.println("=================="); //Solo utilizado para distinguir entre los json de los vehiculos
            System.out.println(lista1.toString());
        }
        
        
    }

}
