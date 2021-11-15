/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myfire;

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
    FlamePalette flamePalette;
            
    public static void main(String[] args) {
        Viewer v = new Viewer();
        // TODO code application logic here
        JFrame finestra = new JFrame("Foquet");
        finestra.setSize(800,600);
        finestra.setLocationRelativeTo(null);
        finestra.setVisible(true);
        finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        finestra.add(v);
       
        

    }

    
}
