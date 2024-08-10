/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author DELL
 */
public class Jugador {
    
    private String nombre;
    private String posicion;
    private int numero;

    public Jugador(String nombre, String posicion, int numero) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.numero = numero;
    }

    public void entrenar() {
        System.out.println(nombre + " está entrenando.");
    }

    public void jugarPartido() {
        System.out.println(nombre + " está jugando.");
    }
 public void vagando() {
        System.out.println(nombre + " el jugador anda vagando.");
    }
 public void leyenda() {
        System.out.println(nombre + " gano el mundial para Guatemala.");
    }
 public void preso() {
        System.out.println(nombre + " el jugador anda preso por corrupto.");
    }
 public void brawl() {
        System.out.println(nombre + " el jugador anda jugando brawl stars.");
    }
   
    public String toString() {
        return "Nombre: " + nombre + ", Posición: " + posicion + ", Número: " + numero;
    }
}

    

