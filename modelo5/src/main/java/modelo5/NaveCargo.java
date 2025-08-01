/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package modelo5;

/**
 *
 * @author kitty
 */
public class NaveCargo extends Nave {
    private Carga carga;

    public NaveCargo(String planetaOrigen, int tripulacion, Carga carga) {
        super(planetaOrigen, tripulacion);
        this.carga = carga;
    }

    @Override
    public boolean esApta() {
        return carga.tienePesoAdecuado(); // Ejemplo de condición de aptitud
    }

    @Override
    public String devolverManifiesto() {
        return "\n" + carga.devolverDetalles();
    }
}
