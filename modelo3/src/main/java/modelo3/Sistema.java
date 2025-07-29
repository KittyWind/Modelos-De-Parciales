/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package modelo3;

import java.util.ArrayList;

/**
 *
 * @author kitty
 */
public class Sistema {
    private ArrayList<Reclamo> reclamos;

    public Sistema() {
        this.reclamos = new ArrayList<>();
    }

    public void agregarReclamo(Infraccion infraccion) {
        Reclamo reclamo = new Reclamo(obtenerUltimoNumeroReclamo() + 1, infraccion);
        this.reclamos.add(reclamo); 
    }

    public int obtenerUltimoNumeroReclamo() {
        int i = 0; // Valor por defecto si no hay reclamos
        // Si hay reclamos, obtener el número del último reclamo
        if (!this.reclamos.isEmpty()) {
            i = this.reclamos.get(this.reclamos.size() - 1).getNumero();
        }
        return i;
    }

    public ArrayList<Reclamo> getReclamos() {
        return this.reclamos;
    }
}
