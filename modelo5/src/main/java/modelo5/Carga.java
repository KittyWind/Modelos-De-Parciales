/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package modelo5;

/**
 *
 * @author kitty
 */
public class Carga {
    private static final double PESO_MAXIMO = 100.0; // Peso máximo permitido
    
    
    private String descripcion;
    private double peso;

    public Carga(String descripcion, double peso) {
        this.descripcion = descripcion;
        this.peso = peso;
    }

    public boolean tienePesoAdecuado() {
        return peso <= PESO_MAXIMO; // Verifica si el peso de la carga es adecuado
    }

    public String devolverDetalles() {
        return "Descripcion: " + descripcion + ", Peso: " + peso + " kg";
    }
}
