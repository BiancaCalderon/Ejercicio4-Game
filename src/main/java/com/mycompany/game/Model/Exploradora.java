package com.mycompany.game.Model;
import java.util.Random;
/**
 *
 * @author bianc
 */
public class Exploradora extends Personaje {
    public Exploradora(){
        super();
    }

    public Exploradora(String name, int Health, int attack, int defense) {
        super(name, Health, attack, defense);
    }
    
    private void Curar(){
        /**
         * Estableceremos la probabilidad de la 
         * habilidad especial de exploradora de recuperar +1 de vida*turno
         */
    Random rndm = new Random();
    int value = rndm.nextInt(100);
    if (value%5 == 0){//multiplo de 5
        System.out.println(""+name+ "Usa CURAR, Recupera +1 de vida!");  
    }
    }
    @Override
    public int Attack(){
        Curar();
        return super.Attack();
    }
    @Override
    public int Defense(){
        Curar();
        return super.Defense();
    }
      /**
     *
     * @return
     */
    @Override
    public String toString(){
    return String.format("Exploradora: %s / Nivel de vida: %d" , name, Health);
    }
}

