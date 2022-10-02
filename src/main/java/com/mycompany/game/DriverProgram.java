/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.game;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;


/**
 *
 * @author bianc
 */
public class DriverProgram {

    public static void main(String[] args) {
        JFrame window = new JFrame("JUEGO");
        Juego game = new Juego();
        window.add(game); //Agregar ventana y especificaciones
        window.setSize(1300,400);
        window.setLocation(700,200);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        while(true){
            game.repaint();
            try {
               Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(DriverProgram.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
