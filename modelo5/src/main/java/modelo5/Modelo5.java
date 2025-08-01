/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package modelo5;

/**
 *
 * @author kitty
 */
public class Modelo5 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        EstacionEspacial estacion = new EstacionEspacial();
        NaveCargo naveCargo = new NaveCargo("Tierra", 5, new Carga("Carga General", 100));
        estacion.estacionarNave(naveCargo);
        estacion.mostrarManifiestos();
    }
}
