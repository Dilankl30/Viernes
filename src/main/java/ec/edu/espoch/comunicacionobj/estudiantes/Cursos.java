/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.comunicacionobj.estudiantes;

/**
 *
 * @author USUARIO
 */
public class Cursos {

    private String nombre;
    private String paralelo;

    public Cursos() {
        
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getParalelo() {
        return paralelo;
    }

    public void setParalelo(String paralelo) {
        this.paralelo = paralelo;
    }

    public void agregarEstudiante(Estudiantes objEstudiante) {
        System.out.println("EL estudiantes" + objEstudiante.getNombre() + " " + objEstudiante.apellido + "esta agregado" + this.nombre);
    }

}
