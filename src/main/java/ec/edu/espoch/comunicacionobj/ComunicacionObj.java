/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.espoch.comunicacionobj;

import ec.edu.espoch.comunicacionobj.estudiantes.Cursos;
import ec.edu.espoch.comunicacionobj.estudiantes.Estudiantes;

/**
 *
 * @author USUARIO
 */
public class ComunicacionObj {

    public static void main(String[] args) {
        Estudiantes objEstudiantes = new Estudiantes();
        objEstudiantes.setNombre("Dilan");
        objEstudiantes.setApellido("lucero");

        Cursos objCursos = new Cursos();
        objCursos.setNombre("Programacion orientada a objetos");
        objCursos.agregarEstudiante(objEstudiantes);
    }

}
