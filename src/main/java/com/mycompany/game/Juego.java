
package com.mycompany.game;

//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.swing.JFrame;
import com.mycompany.game.Model.Exploradora;
import com.mycompany.game.Model.Guerrero;
import javax.swing.JPanel;
import java.net.URL;
import java.applet.AudioClip;
/**
 *
 * @author bianc
 */
public class Juego extends JPanel{
    
    URL direccionAttack;
    AudioClip sonidoAttack;
    
    Guerrero guerr = new Guerrero(this);
    Exploradora expl = new Exploradora(this);
    
    static boolean juegoEnd=false;
    static boolean lossLife =false;
    Juego game;
    public Juego(){
        
        this.game=game;
        
        
    }
}
