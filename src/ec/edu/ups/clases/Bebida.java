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
public class Bebida {

    private String sabor;
    private int expirada;
    private int porLlegar;

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public void setExpirada(int expirada) {
        this.expirada = expirada;
    }

    public void setPorLlegar(int porLlegar) {
        this.porLlegar = porLlegar;
    }

    public String getSabor() {
        return this.sabor;
    }

    public int getExpirada() {
        return this.expirada;
    }

    public int getPorLlegar() {
        return this.porLlegar;
    }
}
