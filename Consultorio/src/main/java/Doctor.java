/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class Doctor {
    private final String nombre;
    private final String especialidad;
    private final String id;

    // Constructor para inicializar el objeto Doctor
    public Doctor(String nombre, String especialidad, String id) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.id = id;
    }

    // Getters para acceder a los atributos
    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getId() {
        return id;
    }

    // Método para programar una cita (ejemplo)
    public void programarCita(String nombrePaciente) {
        System.out.println("Cita programada para " + nombrePaciente + " con el Dr. " + this.nombre);
    }
}