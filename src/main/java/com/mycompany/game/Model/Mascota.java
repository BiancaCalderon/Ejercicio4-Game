package com.mycompany.game.Model;

public class Mascota {
    protected String name = "";
    protected String type = "";

    public Mascota(String name, int health, int attack, int defense, String type) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


}
