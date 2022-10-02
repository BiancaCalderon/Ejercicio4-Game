/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.game.View;


import com.mycompany.game.Model.Enemies;
import com.mycompany.game.Model.Exploradora;
import com.mycompany.game.Model.Guerrero;
import com.mycompany.game.Model.Personaje;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import java.util.Scanner;


/**
 *
 * @author bianc
 */
public class DriverProgram {
public static Scanner keyboard = new Scanner(System.in);
public static Personaje jugador; //Ya sea guerrero o exploradora
public static Guerrero CPU;

    public static void main(String[] args) {
        initPersonaje();
    }
    
    private static void initPersonaje(){
        System.out.println("/t/tCREAR PERSONAJE");
        System.out.println("/t/t ----- -----");
        System.out.println("Jugadores: ");
        System.out.println("1. Guerrero");
        System.out.println("2. Exploradora");
        
        System.out.println("Elija a su jugador...");
        int plyr = Integer.parseInt(keyboard.nextLine());
        
        System.out.println("/nNombre: ");
        String name = keyboard.nextLine();
        
        System.out.println("NIVEL DE ATAQUE: (min = 1/max=10): ");
        int attack = Integer.parseInt(keyboard.nextLine());
        /**
         * Para evitar errores, limitamos a que el ataque SÍ se encuentre en el rango de 1 a 10
         */
        if (attack < 1)
            attack = 1;
        else if (attack > 10)
            attack = 10;
     
        System.out.println("NIVEL DE DEFENSA");
        int defense = Integer.parseInt(keyboard.nextLine());
         /**
         * Para evitar errores, limitamos a que la defensa SÍ se encuentre en el rango de 1 a 10
         */
        if (defense < 1)
            defense = 1;
        else if (defense > 10)
            defense = 10;
        
        System.out.println("NIVEL DE VIDA: (min=100/max=1000):" );
        int Health = Integer.parseInt(keyboard.nextLine());
        /**
         * Para evitar errores, limitamos a que la salud/vida SÍ se encuentre en el rango de 100 a 1000
         */
        if (Health < 100)
            Health = 1;
        else if (Health > 1000)
            Health = 1000;
   
        
        if (plyr == 1)
            jugador = new Guerrero(name, Health, attack, defense); //Elije guerrero
        else jugador = new Exploradora(name, Health, attack, defense);//Elije exploradora
        
        System.out.println("PERSONAJE: ");
        System.out.println(jugador);
        //pausa();
        
        CPU = new Guerrero("Poison", (Health*2), (attack*2), (defense*2));
        System.out.println("ENEMIGO: ");
        System.out.println(CPU);
        System.out.println("Nivel de ataque del enemigo: "+CPU.getAttack()+ "Nivel de Defensa: " + CPU.getDefense());
        
   
        
    }
}
