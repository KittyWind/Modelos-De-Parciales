/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package modelo1;

/**
 *
 * @author kitty
 */
public class Jugador {
    private int id;
    private Personaje personaje;

    public Jugador(int id, Personaje personaje) {
        this.id = id;
        this.personaje = personaje;
    }

    public int getId(){
        return this.id;
    }

    public boolean esTuId(int id){
        return this.id == id;
    }

    public void defender( double ataque){
        personaje.defender(ataque);   
    }

    public double atacar(){
        return personaje.atacar();
    }

    public boolean estaVivo(){
        return this.personaje.estaVivo();
    }
}
