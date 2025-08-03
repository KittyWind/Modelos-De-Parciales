/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package modelo2;

/**
 *
 * @author kitty
 */
public class Estudiante {
    private static final int CUOTA = 25000;
    private String dni;
    private String nombre;

    public Estudiante(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public double devolverCuota(){
        return CUOTA;
    }

    public double calcularDescuento(double porcentaje){
        return CUOTA * porcentaje;
    }

    public boolean verificarDni(String dni){
        return this.dni.equals(dni);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Estudiante{");
        sb.append("dni=").append(dni);
        sb.append(", nombre=").append(nombre);
        sb.append('}');
        return sb.toString();
    }


}
