
package com.mycompany.game.Model;

/**
 *
 * @author bianc
 */
public class Personaje {
    private String name;
    private int Health;
    private int atack;
    private int defense;
    private int Strength;
    private int Aatack;
    private int Adefense;
    private int AStrength;
/**
 * Declaramos atributos
 * @param name
 * @param Health
 * @param atack
 * @param defense
 * @param Strength 
 */
    
    public Personaje(String name, int Health, int atack, int defense, int Strength) {
        this.name = name;
        this.Health = Health;
        this.atack = atack;
        this.defense = defense;
        this.Strength = Strength;
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

    public int getAtack() {
        return atack;
    }

    public void setAtack(int atack) {
        this.atack = atack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getStrength() {
        return Strength;
    }

    public void setStrength(int Strength) {
        this.Strength = Strength;
    }

    public int getAatack() {
        return Aatack;
    }

    public void setAatack(int Aatack) {
        this.Aatack = Aatack;
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

    
    
    ///protected  void ataquePunch();
    //protected  void ataqueKick();
    //protected  void ataqueParalizar();
    
    
}
