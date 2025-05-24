/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejemplo.personas;

public class GestorPersonas {
    private Persona[] personas;

    // Constructor
    public GestorPersonas(int cantidadPersonas) {
        personas = new Persona[cantidadPersonas];
    }

    // Método para agregar una persona en una posición específica
    public void agregarPersona(int indice, Persona persona) {
        personas[indice] = persona;
    }

    // Métodos para obtener información específica
    public String[] getNombres() {
        String[] nombres = new String[personas.length];
        for (int i = 0; i < personas.length; i++) {
            nombres[i] = personas[i].getNombre();
        }
        return nombres;
    }

    public String[] getApellidos() {
        String[] apellidos = new String[personas.length];
        for (int i = 0; i < personas.length; i++) {
            apellidos[i] = personas[i].getApellido();
        }
        return apellidos;
    }

    public int[] getEdades() {
        int[] edades = new int[personas.length];
        for (int i = 0; i < personas.length; i++) {
            edades[i] = personas[i].getEdad();
        }
        return edades;
    }

    public String[] getGeneros() {
        String[] generos = new String[personas.length];
        for (int i = 0; i < personas.length; i++) {
            generos[i] = personas[i].getGenero();
        }
        return generos;
    }

    public double[] getEstaturas() {
        double[] estaturas = new double[personas.length];
        for (int i = 0; i < personas.length; i++) {
            estaturas[i] = personas[i].getEstatura();
        }
        return estaturas;
    }

    public double[] getPesos() {
        double[] pesos = new double[personas.length];
        for (int i = 0; i < personas.length; i++) {
            pesos[i] = personas[i].getPeso();
        }
        return pesos;
    }

    public String[] getTodosAtributos() {
        String[] atributos = new String[personas.length];
        for (int i = 0; i < personas.length; i++) {
            atributos[i] = personas[i].getTodosAtributos();
        }
        return atributos;
    }

    // Métodos para análisis de datos
    public Persona getPersonaMayorPeso() {
        Persona mayorPeso = personas[0];
        for (Persona persona : personas) {
            if (persona.getPeso() > mayorPeso.getPeso()) {
                mayorPeso = persona;
            }
        }
        return mayorPeso;
    }

    public Persona getPersonaMenorEstatura() {
        Persona menorEstatura = personas[0];
        for (Persona persona : personas) {
            if (persona.getEstatura() < menorEstatura.getEstatura()) {
                menorEstatura = persona;
            }
        }
        return menorEstatura;
    }

    public double getPromedioEdad() {
        int suma = 0;
        for (Persona persona : personas) {
            suma += persona.getEdad();
        }
        return (double) suma / personas.length;
    }

    public int[] getConteoGeneros() {
        int masculino = 0;
        int femenino = 0;
        
        for (Persona persona : personas) {
            if (persona.getGenero().equalsIgnoreCase("Masculino")) {
                masculino++;
            } else if (persona.getGenero().equalsIgnoreCase("Femenino")) {
                femenino++;
            }
        }
        
        return new int[]{masculino, femenino};
    }
}
