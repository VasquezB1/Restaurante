/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 *
 * @author Byron
 */
public class Parqueadero {

    private int cliente;
    private String marca;
    private String color;

    @Override
    public String toString() {
        return "Parqueadero{" + "cliente=" + cliente + ", marca=" + marca + ", color=" + color + '}';
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCliente() {
        return this.cliente;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getColor() {
        return this.color;
    }

}
