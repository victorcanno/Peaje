/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peaje;

/**
 *
 * @author s204e3
 */

/*
 * Clase vehiculo la cual es padre de todos los tipos de vehiculos
 */
public class Vehiculo {
    
    private String placa;
    private String marca;
    private int valor;

    public Vehiculo(String placa, String marca, int valor) {
        this.placa = placa;
        this.marca = marca;
        this.valor = valor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        
        return "{\n" + this.getClass().getSimpleName() + ":\n placa:" + placa + "\n,marca:" + marca + "\n,valor:" + valor + "\n}";
    }
  
}
