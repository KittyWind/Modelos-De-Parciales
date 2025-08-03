/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package modelo5;

/**
 *
 * @author kitty
 */
public class NaveCruiser extends Nave {
    private int pasajeros;

    public NaveCruiser(String planetaOrigen, int tripulacion, int pasajeros) {
        super(planetaOrigen, tripulacion);
        this.pasajeros = pasajeros;
    }

    @Override
    public boolean esApta() {
        return this.pasajeros > 0;
    }

    @Override
    public String devolverManifiesto() {
        return "\nporcentaje de Pasajeros: " + ((double) pasajeros / (this.getTripulacion() + pasajeros)) * 100;
    }
}
