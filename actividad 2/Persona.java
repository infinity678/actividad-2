/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejemplo.personas;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String genero;
    private double estatura; // en metros
    private double peso; // en kilogramos

    // Constructor
    public Persona(String nombre, String apellido, int edad, String genero, double estatura, double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
        this.estatura = estatura;
        this.peso = peso;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getGenero() {
        return genero;
    }

    public double getEstatura() {
        return estatura;
    }

    public double getPeso() {
        return peso;
    }

    // Método para obtener todos los atributos
    public String getTodosAtributos() {
        return String.format("Nombre: %s, Apellido: %s, Edad: %d, Género: %s, Estatura: %.2f m, Peso: %.2f kg",
                nombre, apellido, edad, genero, estatura, peso);
    }
}