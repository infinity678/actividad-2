/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ejemplo.personas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("SISTEMA DE GESTIÓN DE PERSONAS");
        System.out.print("Ingrese la cantidad de personas a registrar: ");
        int cantidadPersonas = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        
        GestorPersonas gestor = new GestorPersonas(cantidadPersonas);
        
        // Capturar datos de las personas
        for (int i = 0; i < cantidadPersonas; i++) {
            System.out.println("\nIngrese los datos de la persona " + (i + 1) + ":");
            
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            
            System.out.print("Apellido: ");
            String apellido = scanner.nextLine();
            
            System.out.print("Edad: ");
            int edad = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
            
            System.out.print("Género (Masculino/Femenino): ");
            String genero = scanner.nextLine();
            
            System.out.print("Estatura (en metros): ");
            double estatura = scanner.nextDouble();
            
            System.out.print("Peso (en kilogramos): ");
            double peso = scanner.nextDouble();
            scanner.nextLine(); // Limpiar el buffer
            
            // Crear y agregar la persona
            Persona persona = new Persona(nombre, apellido, edad, genero, estatura, peso);
            gestor.agregarPersona(i, persona);
        }
        
        // Mostrar resultados
        System.out.println("\n=== RESULTADOS ===");
        
        // Listar todas las personas
        System.out.println("\nPersonas registradas:");
        String[] todosAtributos = gestor.getTodosAtributos();
        for (String atributos : todosAtributos) {
            System.out.println(atributos);
        }
        
        // Persona con mayor peso
        Persona mayorPeso = gestor.getPersonaMayorPeso();
        System.out.println("\nPersona con mayor peso:");
        System.out.println(mayorPeso.getTodosAtributos());
        
        // Persona con menor estatura
        Persona menorEstatura = gestor.getPersonaMenorEstatura();
        System.out.println("\nPersona con menor estatura:");
        System.out.println(menorEstatura.getTodosAtributos());
        
        // Promedio de edad
        System.out.printf("\nPromedio de edad: %.1f años\n", gestor.getPromedioEdad());
        
        // Conteo de géneros
        int[] conteoGeneros = gestor.getConteoGeneros();
        System.out.println("\nCantidad por género:");
        System.out.println("Masculino: " + conteoGeneros[0]);
        System.out.println("Femenino: " + conteoGeneros[1]);
        
        scanner.close();
    }
}