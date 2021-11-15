/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myfire;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;
import myfire.Viewer;
import myfire.FlamePalette;
/**
 *
 * @author NitroPC
 */
public class MyFire extends JFrame{

    /**
     * @param args the command line arguments
     */
    private Viewer v;
    private FlamePalette flamePalette;
    
    public MyFire() {
    
       super("Foquet");
       flamePalette = new FlamePalette();
       Flame f = new Flame(500, 500, flamePalette);
       v = new Viewer(f);
       this.setLayout(new GridBagLayout());
       this.setSize(1000, 1000);
       //this.getContentPane().setBackground(new Color(255,0,0,255));
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setVisible(true);
       this.add(v);
       
       Thread t1 = new Thread(v); //ho pos aquí perquè a nes viewer no funciona
       t1.start();

       
       
       
    }
    public static void main(String[] args) {
        
        // TODO code application logic here
        new MyFire();
       
        

    }

    
}
