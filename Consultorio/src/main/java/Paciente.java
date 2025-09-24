/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class Paciente {
 
    private final String nombre;
    private final int edad;
    // ... otros atributos

    // Constructor
    public Paciente(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método getter para el nombre
    public String getNombre() {
        return nombre;
    }

    // Método para imprimir datos
    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}   

