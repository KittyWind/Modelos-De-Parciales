/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package modelo3;

/**
 *
 * @author kitty
 */
public class Infraccion {
    private Fecha fecha;

    public Infraccion(Fecha fecha) {
        this.fecha = fecha;
    }

    public boolean estaVigente() {
        return this.fecha.estaVigente();
    }
}
