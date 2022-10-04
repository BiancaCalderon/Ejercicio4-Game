
package Model;
import java.util.Random;
/**
 *Pogramación Orientada a Objetos
 * Ejercicio 4, Modelación con Herencia
 * Prof: Moises Alonso
 * @author Bianca Calderón
 */
public class Personaje {
    protected String name;
    protected int Health;
    protected int attack;
    protected int defense;


    public Personaje(){
        name = "";
        Health = 0;
        attack = 0;
        defense = 0;


    }
    /**
     * Declaramos atributos
     * @param name
     * @param Health
     * @param atack
     * @param defense
     */

    public Personaje(String name, int Health, int attack, int defense) {
        this.name = name;
        this.Health = Health;
        this.attack = attack;
        this.defense = defense;

    }

    /**
     * Getter y setters
     * @return
     */
    public String getName() {
        return name;
    }


    public int getHealth() {
        return Health;
    }


    public int getAttack() {
        return attack;
    }


    public int getDefense() {
        return defense;
    }





    /**
     *
     * @param damage
     * @return
     */

    public void DamageDealt(int damage){
        Health -= damage;
        if (Health < 0); //Evitar vida negativa
        Health = 0;
    }
    /**
     * Generamos magnitud/cantidad de ataque
     * @return
     */
    public int Attack(){
        Random rndm = new Random();
        int QAttack = rndm.nextInt(attack)+1;

        return QAttack;
    }

    public int Defense(){
        Random rndm = new Random();
        int QDefense = rndm.nextInt(defense)+1;

        return  QDefense;
    }

    public void setText(int Attack) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setValue(int health) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static class getHealth {

        public getHealth() {
        }
    }

}



