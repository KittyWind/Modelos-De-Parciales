/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package modelo1;

/**
 *
 * @author kitty
 */
public class Personaje {
    private static final double VIDA_INICIAL = 100.0;
    private String nombre;
    private double life;

    public Personaje(String nombre) {
        this.nombre = nombre;
        this.life = 100.0;
    }

    public double atacar(){
        return 15-0;
    };

    public void defender(double ataque){
        double ataqueRecibidio = (ataque * Math.random());
        System.out.println("el personaje: " + this.nombre + " ha recibido: " + ataqueRecibidio + " de danio");
        if (this.life - ataqueRecibidio > 0){
            this.life -= ataqueRecibidio;
            System.out.println("al personaje le quedan " + this.life + " puntos de vida");
        }
        else{
            System.out.println("el personaje: " + this.nombre + " ha muerto");
            this.life = 0;
        }
    }

    public boolean estaVivo(){
        return this.life > 0;
    }

}
