/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myfire;


import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import static java.lang.Thread.sleep;
import javax.swing.JFrame;
import myfire.Flame;

/**
 *
 * @author NitroPC
 */



public class Viewer extends Canvas implements Runnable{

    private Flame fuego;

    public void Viewer(Flame flame) {
        //this.fuego = fuego;
        setBackground(Color.darkGray);
        setSize(700, 525);
        setVisible(true);
        
        
        
    }


    public void paint(Graphics g) {
        
        super.paint(g);
        BufferedImage emptyImage = (BufferedImage) createImage(this.getWidth(), this.getHeight()); 
        g.drawImage(fuego.createFlameImage(),0,0,null);
    }
    

    @Override
    public void run() {

        while (true) {
            paint(this.getGraphics());
            try {
                sleep(50);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
