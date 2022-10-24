
package com.mycompany.game.Model;
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
    protected int items;
    protected int Aattack;
    protected int Adefense;
    protected int AStrength;
    
    public Personaje(){
        name = "";
        Health = 0;
        attack = 0;
        defense = 0;
        items = 0;
        
    }
/**
 * Declaramos atributos
 * @param name
 * @param Health
 * @param atack
 * @param defense
 * @param items 
 */
    
    public Personaje(String name, int Health, int attack, int defense) {
        this.name = name;
        this.Health = Health;
        this.attack = attack;
        this.defense = defense;
        this.items = items;
        this.Adefense = Adefense;
        this.Adefense = Adefense;
        this.AStrength = AStrength;
    }

    /**
     * Getter y setters
     * @return 
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return Health;
    }

    public void setHealth(int Health) {
        this.Health = Health;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int atack) {
        this.attack = atack;
    }

    public int getDefense() {
        return defense;
    }

    public int getitems() {
        return items;
    }

    public void setitems(int items) {
        this.items = items;
    }
    
    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getAattack() {
        return Aattack;
    }

    public void setAattack(int Aatack) {
        this.Aattack = Aatack;
    }

    public int getAdefense() {
        return Adefense;
    }

    public void setAdefense(int Adefense) {
        this.Adefense = Adefense;
    }

    public int getAStrength() {
        return AStrength;
    }

    public void setAStrength(int AStrength) {
        this.AStrength = AStrength;
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

    public static class getHealth {

        public getHealth() {
        }
    }
    class raidboss extends Personaje{
        public  raidboss boss; //CPU
        public raidboss(){
            super();
        }

        public raidboss(String name, int Health, int attack, int defense) {
            super(name, Health, attack, defense);
        }
    }
    public class attack{
        public void function(){
            Personaje Pobject = new Personaje();
            Pobject.DamageDealt();

            raidboss Bobject = new raidboss();
            Bobject.DamageDealt();

        }
    }

    public void DamageDealt() {
    }

}  

   
