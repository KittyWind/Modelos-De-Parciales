/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package modelo1;

import java.util.ArrayList;

/**
 *
 * @author kitty
 */
public class UtnFight {

    private ArrayList<Jugador> jugadores;

    public UtnFight(){
        this.jugadores = new ArrayList<>();
    }

    public void aniadirJugador(Jugador j){
        this.jugadores.add(j);
    }

    public boolean batallar(int id1, int id2){
        boolean batallaEmpezada = false;
        Jugador j1 = this.buscarJugador(id1);
        Jugador j2 = this.buscarJugador(id2);
        if(j1 != null && j2 != null){
            batallaEmpezada = true;
            this.empezarBatalla(j1,j2);
        }
        else{
            System.out.println("no se pudo realizar la batalla, uno de los dos jugadores no existen");
        }
        return batallaEmpezada;
    }

    public void empezarBatalla(Jugador j1, Jugador j2){
        int random = (int) (Math.random() * 2) +1;
        Jugador aux = null;
        if(random == 2){
            aux = j2;
            j2 = j1;
            j1 = aux;
        }
        while(j1.estaVivo() && j2.estaVivo()){
            
            j1.defender(j2.atacar());
            aux = j2;
            j2 = j1;
            j1 = aux;
        }
        System.out.println("id: " + j1.getId());
        System.err.println("id: " + j2.getId());
    }

    public Jugador buscarJugador(int id){
        int i = 0;
        Jugador jugadorEncontrado = null;
        while(i < this.jugadores.size() && jugadorEncontrado == null){
            Jugador jugador = this.jugadores.get(i);
            if(jugador.esTuId(id)){
                jugadorEncontrado = jugador;
            }
            i++;
        }
        return jugadorEncontrado;
    }
}
