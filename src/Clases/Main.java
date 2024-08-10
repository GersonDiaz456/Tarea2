/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
Jugador j1 = new Jugador("Yova", "Delantero", 9);
Jugador j2 = new Jugador("Lester", "Portero", 4);
 Jugador j3 = new Jugador("Gerson", "Delantero", 10);
 Jugador j4 = new Jugador("Julio", "Porrista", 0);
 Jugador j5 = new Jugador("Rode", "Delantero", 11); 
  Jugador j6 = new Jugador("Colocha", "Defensa", 8);
 
        Equipo guatemala = new Equipo("Guatemala");
        guatemala.agregarJugador(j1);
        guatemala.agregarJugador(j2);
guatemala.agregarJugador(j3);
guatemala.agregarJugador(j4);
guatemala.agregarJugador(j5);
guatemala.agregarJugador(j6);

        guatemala.mostrarJugadores();

        j1.entrenar();
        j2.jugarPartido();
        j3.leyenda();
        j4.vagando();
        j5.preso();
        j6.brawl();
    }
}

    

