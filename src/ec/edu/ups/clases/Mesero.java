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
public class Mesero {

    private String turno;
    private String asistente;
    private String nombre;

    @Override
    public String toString() {
        return "Mesero{" + "turno=" + turno + ", asistente=" + asistente + ", nombre=" + nombre + '}';
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setAsistente(String asistente) {
        this.asistente = asistente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTurno() {
        return this.turno;
    }

    public String getAsitente() {
        return this.asistente;
    }

    public String getNombre() {
        return this.nombre;
    }

}
