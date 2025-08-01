/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package modelo5;

import java.util.ArrayList;
/**
 *
 * @author kitty
 */
public class EstacionEspacial {
    private String nombre;
    private ArrayList<PuntoDeAtraque> puntosDeAtraque;

    public EstacionEspacial() {
        this.nombre = "Atlantis";
        this.puntosDeAtraque = new ArrayList<>();
        agregarPuntosDeAtraque();
    }

    private void agregarPuntosDeAtraque() {
        for (int i = 0; i < 5; i++) {
            puntosDeAtraque.add(new PuntoDeAtraque());
        }
    }

    public void estacionarNave(Nave nave) {
        boolean estaDisponible = false;
        int i = 0;
        while (i < puntosDeAtraque.size() && !estaDisponible) {
            PuntoDeAtraque punto = puntosDeAtraque.get(i);
            if (punto.puedeAtracar(nave)) {
                punto.atracar(nave);
                estaDisponible = true;
            }
            i++;
        }
    }

    public void mostrarManifiestos() {
        for (PuntoDeAtraque punto : puntosDeAtraque) {
            if (punto != null) {
                punto.mostrarManifiesto(); // Asumiendo que PuntoDeAtraque tiene un método mostrarManifiesto
            }
        }
    }
}
