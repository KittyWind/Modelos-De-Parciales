/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package modelo3;

/**
 *
 * @author kitty
 */
public class Reclamo {
    private int numero;
    private Infraccion infraccion;

    public Reclamo(int numero, Infraccion infraccion) {
        this.numero = numero;
        this.infraccion = infraccion;
    }

    public int getNumero() {
        return numero;
    }

    public boolean estaVigente() {
        // Implementar lógica para determinar si el reclamo está vigente
        return true; // Placeholder, debe ser reemplazado con la lógica real
    }

}
