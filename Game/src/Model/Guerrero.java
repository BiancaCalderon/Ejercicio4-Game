
package Model;

import java.util.Random;
/**
 *Pogramación Orientada a Objetos
 * Ejercicio 4, Modelación con Herencia
 * Prof: Moises Alonso
 * @author Bianca Calderón
 */
public class Guerrero extends Personaje {
    public Guerrero(){
        super();
    }

    public Guerrero(String name, int Health, int attack, int defense) {
        super();
    }

    /**
     *Guerrero tiene una habilidad especial "Thunder"
     * @return
     */

    public int AttackTHUNDER(){
        int QAttack = super.Attack();
        Random rndm = new Random();
        int value = rndm.nextInt(100);
        /**
         * Para la habilidad especial, le ponemos una probabilidad del 10% de que ocurra
         */
        if (value%10 == 0){//Ocurre solo si value es múltiplo de 10
            System.out.println(""+name+ "Tiene ataque especial THUNDER");
            return QAttack *2;   //El usar Thunder es el doble de poderoso
        }else
            return QAttack;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return String.format("Guerrero: %s / Nivel de vida: %d" , name, Health);
    }
}



