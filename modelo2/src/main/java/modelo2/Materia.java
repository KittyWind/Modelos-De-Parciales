/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package modelo2;

import java.util.ArrayList;

/**
 *
 * @author kitty
 */
public class Materia {
    private int codigo;
    private String nombre;
    private ArrayList<Estudiante> estudiantes;

    public Materia(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }

    public void aniadirEstudiante(Estudiante e){
        if(e != null){
            this.estudiantes.add(e);
        }
    }

    public boolean puedeAceptarAlumnos(String dni){
        return this.buscarEstudiante(dni) == null && this.estudiantes.size() + 1 < 20;
    }

    public Estudiante buscarEstudiante(String dni){
        Estudiante estudianteEncontrado = null;
        int i = 0;
        while(i < this.estudiantes.size() && estudianteEncontrado == null){
            Estudiante estudiante = this.estudiantes.get(i);
            if(estudiante.verificarDni(dni)){
                estudianteEncontrado = estudiante;
            }
            i++;
        }
        return estudianteEncontrado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void mostrarEstudiantes(){
        for(Estudiante e : this.estudiantes){
            System.out.println(e);
        }
    }

}
