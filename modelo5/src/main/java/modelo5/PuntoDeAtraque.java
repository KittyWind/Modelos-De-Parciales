/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package modelo5;

/**
 *
 * @author kitty
 */
public class PuntoDeAtraque {
    private Nave nave;
    
    public PuntoDeAtraque() {
        this.nave = null; // Inicialmente no hay nave atracada
    }

    public boolean puedeAtracar(Nave nave) {
        return this.nave == null && nave.esApta(); // Puede atracar si no hay nave atracada
    }

    public void atracar(Nave nave) {
        this.nave = nave; // Atraca la nave
    }

    public void mostrarManifiesto() {
        if (this.nave != null) {
            System.out.println("Manifiesto de la nave en el punto de atraque: \nPlaneta de origen: " + nave.getPlanetaOrigen() 
            + "\nTripulacion: " + nave.getTripulacion() + "\nManifiesto: " + nave.devolverManifiesto());
        }
    }
}
