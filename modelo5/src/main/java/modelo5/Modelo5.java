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
        Nave nave1 = new NaveCargo("Neptuno", 21, new Carga("Baterias recargables", 120));
        Nave nave2 = new NaveCruiser("Mercurio",8,0);
        Nave nave3 = new NaveCargo("Marte",15,new Carga("Sustancias Cosmicas",90));
        Nave nave4 = new NaveCruiser("Urano",48,12);
        estacion.estacionarNave(nave1);
        estacion.estacionarNave(nave2);
        estacion.estacionarNave(nave3);
        estacion.estacionarNave(nave4);
        estacion.mostrarManifiestos();
    }
}
