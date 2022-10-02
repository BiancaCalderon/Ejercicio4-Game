/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.game.View;

//import com.mycompany.game.Model;

import com.mycompany.juego.Juego.Cascade;
import com.mycompany.juego.Juego.Flame;
import com.mycompany.juego.Juego.Groot;
import com.mycompany.juego.Juego.Juego;
import com.mycompany.juego.Juego.Thunder;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;


/**
 *
 * @author bianc
 */
public class DriverProgram {

    public static void main(String[] args) {
        Flame flame = new Flame();
        Cascade cascade = new Cascade();
        Groot groot = new Groot();
        Thunder thunder = new Thunder();
        cascade.ataqueHidrobomba();
        //cascade.ataqueKick();
        groot.ataqueEnredar();
        //groot.ataquePunch();
        //groot.ataqueKick();
        thunder.ataqueRayo();
        //thunder.ataquePunch();
        flame.ataqueLanzaLlamas();
        flame.ataqueChispa();
        //flame.ataquePunch();
        
        JFrame window = new JFrame("JUEGO");
        Juego game = new Juego();
        window.add(game); //Agregar ventana y especificaciones
        window.setSize(1300,600);
        window.setLocation(400,200);
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
