/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package modelo1;

/**
 *
 * @author kitty
 */
public class Modelo1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Personaje p1 = new Personaje("test1");
        Personaje p2 = new Personaje("test2");
        Jugador j1 = new Jugador(1, p1);
        Jugador j2 = new Jugador(10, p2);
        UtnFight uf = new UtnFight();
        uf.aniadirJugador(j1);
        uf.aniadirJugador(j2);
        uf.batallar(1, 10);
    }
}
