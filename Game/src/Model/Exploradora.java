package Model;

import java.util.Random;
/**
 *Pogramación Orientada a Objetos
 * Ejercicio 4, Modelación con Herencia
 * Prof: Moises Alonso
 * @author Bianca Calderón
 */
public class Exploradora extends Personaje {
    private final int maxVida;
    public Exploradora(){
        super();
        maxVida = Health; //Para que al curar no sobrepase su salud inicial
    }

    public Exploradora(String name, int Health, int attack, int defense) {
        super(name, Health, attack, defense);
        maxVida = Health;
    }

    public boolean Curar(){
        /**
         * Estableceremos la probabilidad de la
         * habilidad especial de exploradora de recuperar +1 de vida*turno
         */
        Random rndm = new Random();
        int value = rndm.nextInt(100);
        if (value%5 == 0){//multiplo de 5
            System.out.println(""+name+ "Usa CURAR, Recupera +1 de vida!");
            Health++;
            return true;
        }
        return false;
    }
    public int attack(){
        Curar();
        return super.Attack();
    }

    public int defense(){
        Curar();
        return super.Defense();
    }
    public void HechizoCurar() {//para 50+ de curación
        System.out.println(name+ "Utiliza su hechizo CURAR");

        if (Health == maxVida)
            System.out.println("Tiene vida máximo, el hechizo no genera algún efecto");
        else {
            int dif = maxVida - Health;
            if (dif >= 50 ) {
                Health += 50;
                System.out.println(name + "recupera 50 de vida");
            }
            else {//Para no perder el hechizo,recupera lo sobrante de vida
                Health += dif;
                System.out.println(name+"recupera" +dif+ "de vida");
            }
        }
    }

    public int ExplAttack() {
        System.out.println(name+ "Utiliza ataque");
        return (int) (attack*1.5);
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

