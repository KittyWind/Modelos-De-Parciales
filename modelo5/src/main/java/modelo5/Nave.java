/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package modelo5;

/**
 *
 * @author kitty
 */
public abstract class Nave {
    private String planetaOrigen;
    private int tripulacion;

    public Nave(String planetaOrigen, int tripulacion) {
        this.planetaOrigen = planetaOrigen;
        this.tripulacion = tripulacion;
    }

    public abstract boolean esApta();

    public abstract String devolverManifiesto();

    public String getPlanetaOrigen() {
        return planetaOrigen;
    }

    public int getTripulacion() {
        return tripulacion;
    }


}