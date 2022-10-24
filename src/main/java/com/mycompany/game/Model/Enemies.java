package com.mycompany.game.Model;

/**
 *
 * @author bianc
 */
public class Enemies extends Personaje {
    public static Enemies CPU; //CPU
    public Enemies(){
        super();
    }

    public Enemies(String name, int Health, int attack, int defense) {
        super(name, Health, attack, defense);
    }
}



    
