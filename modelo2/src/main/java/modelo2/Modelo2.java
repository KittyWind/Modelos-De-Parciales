/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package modelo2;

/**
 *
 * @author kitty
 */
public class Modelo2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Materia m1 = new Materia(101, "Matemáticas");
        Materia m2 = new Materia(102, "Física");
        Materia m3 = new Materia(103, "Química");
        Materia m4 = new Materia(104, "Biología");
        Materia m5 = new Materia(105, "Historia");
        Materia m6 = new Materia(106, "Geografía");
        Materia m7 = new Materia(107, "Literatura");
        Materia m8 = new Materia(108, "Inglés");
        Materia m9 = new Materia(109, "Arte");
        Materia m10 = new Materia(110, "Educación Física");
        Carrera carrera = new Carrera("Ciencias Exactas");
        carrera.aniadirMateria(m1);
        carrera.aniadirMateria(m2);
        carrera.aniadirMateria(m3);
        carrera.aniadirMateria(m4);
        carrera.aniadirMateria(m5);
        carrera.aniadirMateria(m6);
        carrera.aniadirMateria(m7);
        carrera.aniadirMateria(m8);
        carrera.aniadirMateria(m9);
        carrera.aniadirMateria(m10);
        carrera.inscribir("12345678A", "Juan Pérez", 101);
        carrera.inscribir("87654321B", "Ana García", 102);
        carrera.inscribir("12345678A", "Juan Pérez", 103); // Intento de inscripción repetida
        carrera.inscribir("12345678A", "Juan Pérez", 111); // Materia no existente
        carrera.inscribir("23456789C", "Luis Fernández", 104); // Inscripción válida
        m1.mostrarEstudiantes(); // Mostrar estudiantes de Matemáticas
        m2.mostrarEstudiantes(); // Mostrar estudiantes de Física
        m3.mostrarEstudiantes(); // Mostrar estudiantes de Química
        m4.mostrarEstudiantes(); // Mostrar estudiantes de Biología
        System.out.println(carrera.gananciasPorMaterias());
        
    }
}
