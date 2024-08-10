/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
   import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author DELL
 */
public class Equipo {
  


    private String nombre;
    private List<Jugador> jugadores;

    public Equipo(String nombre) {
    this.nombre = nombre;
    this.jugadores = new ArrayList<>();
    }

    public void agregarJugador(Jugador j) {
    jugadores.add(j);
    }

    public void mostrarJugadores() {
   System.out.println("Leyendas del Equipazo " + nombre + ":");
   for (Jugador j : jugadores) {
   System.out.println(j);
        }
    }
}

    

