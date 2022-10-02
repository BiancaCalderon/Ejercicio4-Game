package com.mycompany.game.Model;

import com.mycompany.game.Model.Guerrero;
import com.mycompany.game.Model.Personaje;

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


    
