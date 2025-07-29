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
public class Carrera {
    private String nombre;
    private ArrayList<Materia> materias;

    public Carrera(String nombre) {
        this.nombre = nombre;
        this.materias = new ArrayList<>();
    }

    public void aniadirMateria(Materia m){
        if(m != null){
            materias.add(m);
        }
    }

    public void inscribir(String dni, String nombre, int codigo){
        Estudiante estudiante = this.buscarEstudiante(dni);
        if(estudiante == null){
            estudiante = new Estudiante(dni, nombre);
        }
        Materia materia = this.buscarMateria(codigo);
        if(materia != null){
            if(materia.puedeAceptarAlumnos(dni)){
                materia.aniadirEstudiante(estudiante);
            }
            else{
                System.out.println("la materia no esta disponible, verifique la capacidad de alumnos y que el alumno no este repetido");
            }
        }
        else{
            System.out.println("la materia no existe, operacion cancelada");
        }
        
    }

    public Materia buscarMateria(int codigo){
        Materia materiaEncontrada = null;
        int i = 0;
        while(i < this.materias.size() && materiaEncontrada == null){
            Materia materia = this.materias.get(i);
            if(materia.getCodigo() == codigo){
                materiaEncontrada = materia;
            }
            i++;
        }
        return materiaEncontrada;
    }

    public Estudiante buscarEstudiante(String dni){
        Estudiante estudianteEncontrado = null;
        int i = 0;
        while(i < this.materias.size() && estudianteEncontrado == null){
            Materia materia = this.materias.get(i);
            if(materia.buscarEstudiante(dni) != null){
                estudianteEncontrado = materia.buscarEstudiante(dni);
            }
            i++;
        }
        return estudianteEncontrado;
    }


}
