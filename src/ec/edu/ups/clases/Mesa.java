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
public class Mesa {

    private String mesaLibre;
    private int codigo;
    private int mesaDañada;

    @Override
    public String toString() {
        return "Mesa{" + "mesaLibre=" + mesaLibre + ", codigo=" + codigo + ", mesaDa\u00f1ada=" + mesaDañada + '}';
    }

    public void setMesaLibre(String mesaLibre) {
        this.mesaLibre = mesaLibre;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setMesaDañda(int mesaDañada) {
        this.mesaDañada = mesaDañada;
    }

    public String getMesaLibre() {
        return this.mesaLibre;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public int getMesaDañada() {
        return this.mesaDañada;
    }
}
