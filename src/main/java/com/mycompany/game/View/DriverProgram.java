//Escape characters: https://stackoverflow.com/questions/1367322/what-are-all-the-escape-characters
//instance of: https://www.programiz.com/java-programming/operators
package com.mycompany.game.View;


import com.mycompany.game.Model.Enemies;
import com.mycompany.game.Model.Exploradora;
import com.mycompany.game.Model.Guerrero;
import com.mycompany.game.Model.Personaje;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import java.util.Scanner;
import java.util.Random;


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
        pause();
        
        CPU = new Guerrero("Poison", (Health*2), (attack*2), (defense*2));
        System.out.println("ENEMIGO: ");
        System.out.println(CPU);
        System.out.println("Nivel de ataque del enemigo: "+CPU.getAttack()+ "Nivel de Defensa: " + CPU.getDefense());
        
        pause(); 
    }
    
    public static void pause(){
        System.out.println("/n/t/ENTER para continuar");
        keyboard.nextLine();

    //
     while(jugador.getHealth() > 0 && CPU.getHealth() > 0) {
     private static int SelectionHabilidad() {
            System.out.println("/nTurno del jugador:  " + jugador.getName());
            System.out.println("1. ATACAR"); //Elegir poder a efectuar
            System.out.println("2. DEFENDER");
            if (jugador instanceof Guerrero) {
                System.out.println("3. Ataque THUNDER");
            }
            else{
                System.out.println("3. Habilidad de CURAR");
                System.out.println("4. Habilidad de ATAQUE");
            }
            System.out.println("Elije la opción a ejecutar: ");
            return Integer.parseInt(keyboard.nextLine());     
        } 
  //Niveles dificultad CPU
     private static int CPUEZ(){
         Random rndm = new Random();
         //Guerrero: Atacar, defender, THUNDER
         return rndm.nextInt(3)+1;
     }
     /**
      * aqui la CPU dependiendo del ataque o defensa del jugador es como este reaccionará
      * @param attackplyr
      * @param defensaplyr
      * @return 
      */
     private static int CPUJEFE(int defenseplyr, int attackplyr){
         System.out.println("COMBATE AL JEFE!"); 
         int [] arrayActions = new int[10];
         /**
          * si el jugador se defiende, la CPU no se defenderá para aprovechar la jugada
          */
         if (defenseplyr > 0) {
             if (defenseplyr >= 9)
                 arrayActions = new int[] {1,3,3,1,1,3,3,1,1,3}; //alta defense, guerrero tendra mas oportunidad de habilidad THUNDER
             else if (defenseplyr >= 5) 
                 arrayActions = new int[] {3,1,1,3,3,1,1,3,1,1};
             else 
                 arrayActions = new int[] {1,1,3,1,1,3,1,1,1,3};
         }
         else{
             if (attackplyr >= 9)
                 arrayActions = new int[] {1,2,3,2,3,3,3,2,3,3};
             else if (attackplyr >= 5) 
                 arrayActions = new int[] {2,1,3,3,2,1,3,3,2,1};
             else if (attackplyr > 0)
                 arrayActions = new int[] {1,2,3,1,2,3,1,2,1,3};
             else if (attackplyr == 0)
                 arrayActions = new int[] {1,2,2,1,2,1,1,2,1,2};
                  
         }
         
         Random rndm = new Random();
         return arrayActions[rndm.nextInt(10)];
         
         static void pause() {
             System.out.println("ENTER para continuar");
             keyboard.nextLine();
         }

}
