package com.mycompany.game.Model;

import java.util.Random;

public class Acompanante extends Mascota {
    private int bloqueo = 0;

    public Acompanante(String name, int Health, int attack, int defense, String type) {
        super(name, Health, attack, defense, type);
    }

    @Override
    public String getType() {
        return super.getType();
    }

    /**
     *
     * @return
     */
    public boolean block() {
        Random rndm = new Random();
        int value = rndm.nextInt(100);
        if (value % 5 == 0) {
            System.out.println("" + name + "Acompañante usa habilidad de bloqueo");
            bloqueo++;
            return true;

        }
        return false;
    }
}



