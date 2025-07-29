/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package modelo2;

/**
 *
 * @author kitty
 */
public class MontoMateria {
    private String nombre;
    private double montoTotal;

    public MontoMateria(double montoTotal, String nombre) {
        this.montoTotal = montoTotal;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MontoMateria{");
        sb.append("nombre=").append(nombre);
        sb.append(", montoTotal=").append(montoTotal);
        sb.append('}');
        return sb.toString();
    }

    
}
