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
public class Caja {

    private double dinero;
    private double cambio;
    private double propina;

    @Override
    public String toString() {
        return "Caja{" + "dinero=" + dinero + ", cambio=" + cambio + ", propina=" + propina + '}';
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public void setCambio(double cambio) {
        this.cambio = cambio;
    }

    public void setPropina(double propina) {
        this.propina = propina;
    }

    public double getDinero() {
        return this.dinero;
    }

    public double getCambio() {
        return this.cambio;
    }

    public double getPropina() {
        return this.propina;
    }

}
