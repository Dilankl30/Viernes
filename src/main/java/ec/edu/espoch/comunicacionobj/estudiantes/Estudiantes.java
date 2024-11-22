/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.comunicacionobj.estudiantes;

/**
 *
 * @author USUARIO
 */
public class Estudiantes {

    public Estudiantes() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String nombre;
    public String apellido;

    public void estudiar() {
        System.out.println(this.nombre + " " + this.apellido + "esta estudiando");
    }

}
