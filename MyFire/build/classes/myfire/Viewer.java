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
    

    public Viewer(Flame fuego) {
        this.fuego = fuego;
        setSize(700, 525);
        setVisible(true);
        
        
            }


    public void paint(Graphics g) {

        g.drawImage(fuego,0,0,this);
    }
    

    @Override
    public void run() {

        while (true) {
            if (this.getGraphics() != null){
                paint(this.getGraphics());
                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
}