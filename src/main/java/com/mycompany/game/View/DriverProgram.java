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
private static boolean JEFE = false; //Nivel

    public static void main(String[] args) {
        initPersonaje();
        levels();
        
     while(jugador.getHealth() > 0 && CPU.getHealth() > 0) {
         int attackplyr = 0, attackCPU = 0;
         int defenseplyr = 0, defenseCPU = 0;
         System.out.println("PELEA!");
         System.out.println("-> Jugador: "+jugador);
         System.out.println("-> Rival CPU: "+CPU);
         int actionplyr = SelectionHabilidad();
         System.out.println();
         switch(actionplyr) {
             case 1://ATACKS
                 attackplyr = jugador.Attack();
                 System.out.println("El ataque es: "+ attackplyr + "puntos!");
                 break;
             case 2: //DEFENSE
                 defenseplyr = jugador.Defense();
                 System.out.println("La defensa es de: "+ defenseplyr + "puntos!");
                 break;
             case 3: //Habilidad si es guerrero
                 if (jugador instanceof Guerrero){
                     attackplyr = ((Guerrero)jugador).AttackTHUNDER();
                     System.out.println("Tiene un ataque THUNDER de: "+ attackplyr+"puntos!");
                 }
                 else{//habilidad si es exploradora
                     attackplyr = ((Exploradora)jugador).ExplAttack();
                     System.out.println("Tiene un ataque de: " +attackplyr+"puntos!");
                 }
                 break;
             case 4:
                 if (jugador instanceof Guerrero)
                     System.out.println("No se puede efectuar acción, pasas turno");
                 else
                     ((Exploradora)jugador).HechizoCurar();
                 break;
                 default:
                 System.out.println("No se puede efectuar acción, pierdes tu turno");
         }
         pause();
         int ActionCPU;
         if (JEFE)
             ActionCPU = CPUJEFE(defenseplyr, attackplyr);
         else 
             ActionCPU = CPUEZ();
         //Accion de la CPU
         switch(ActionCPU){
             case 1:
                 attackCPU = CPU.Attack();
                 break;
             case 2:
                 defenseCPU = CPU.Defense();
                 break;
             case 3:
                 attackCPU = CPU.AttackTHUNDER();
         }
         pause();
         //Segun acciones, verificamos daños
         int damagedealtplyr = attackCPU - defenseplyr;
         int damagedealtCPU = attackplyr - defenseCPU;
         
         if (damagedealtplyr > 0){
             System.out.println(""+ jugador.getName()+ "recibió daño");
             jugador.DamageDealt(damagedealtplyr);
             if (jugador.getHealth() == 0);
             System.out.println(""+jugador.getName()+ "Pierde! Ha muerto!! :p");
         }
         else {
             if (ActionCPU != 2)
                 System.out.println("" +jugador.getName()+ "bloquea el ataque contra" + CPU.getName());
         }
         if (damagedealtCPU > 0){
             System.out.println(""+CPU.getName()+"recibió daños");
             System.out.println(CPU.getName()+"pierde"+damagedealtCPU+ "puntos de vida");
             CPU.DamageDealt(damagedealtCPU);
             if (CPU.getHealth()== 0)
                 System.out.println(""+CPU.getName()+"murio!");
         }    
        else {
             if (actionplyr == 1 || actionplyr == 3){
                 System.out.println(""+CPU.getName()+"bloquea a:"+jugador.getName());
             }
         }
         pause();
         
         if (jugador instanceof Exploradora) {
             if (((Exploradora)jugador).Curar()){
             //Puede revivir si cura, pero no le servirá de mucho
         if (jugador.getHealth()== 1)
                 System.out.println(""+jugador.getName()+"resucitó ay!");
         pause();
         
         }
         
     }
     //Ganador
     if (jugador.getHealth() > 0){
         System.out.println("EL GANADOR ES: ");
         System.out.println(jugador);
     }
     else if (CPU.getHealth() > 0){
         System.out.println("EL GANADOR ES: ");
     System.out.println(CPU);
    
   }else
            System.out.println("No hay ganador, ambos jugadores han muerto");
            System.out.println("FIN");
}
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
    }
    //

     private static int SelectionHabilidad(){
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
     
     private static void levels(){
         System.out.println("NIVELES: ");
         System.out.println("1. Modo normal");
         System.out.println("2. Modo JEFE");
         System.out.println("Elije un nivel: ");
         int level = Integer.parseInt(keyboard.nextLine());
         if (level == 2)
             JEFE = true;
     }
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

         }
private static void pausa() {
		System.out.println("ENTER para continuar");
		keyboard.nextLine();
	}

}
