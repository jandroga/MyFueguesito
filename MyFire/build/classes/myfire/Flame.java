/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myfire;

/**
 *
 * @author NitroPC
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import static java.lang.Thread.sleep;
import myfire.FlamePalette;


public class Flame extends BufferedImage implements Runnable{
    
    private FlamePalette flamePalette;
    private int width; 
    private int height;
    private int[][] tempMap; //array 2d que servirà de mapa de temperatura
    private int[][] newTempMap;

        
    public Flame(int width, int height, FlamePalette flamePalette){
        super(width,height,BufferedImage.TYPE_INT_ARGB);
        
        this.newTempMap = new int[width][height];
        this.flamePalette = flamePalette;
        this.height = height;
        this.width = width;
        this.tempMap = new int[width][height];
        
        Thread thread = new Thread(this); //com ja és dedins es constructor, THIS
        thread.start();
    }
    
    
    
    public void createSparks(){
    
        for (int i = 1; i < width; i++){ //recorrem la base del foc
            if(((int)(Math.random()*5+1))<5){
                tempMap[i][height - 1] = 255; //i = eix d'x i height - 100 és sa posició on començarà es foquet
            }
        }
    }
    

    
    
    public void flameEvolve(){
    
        
        newTempMap = tempMap;
        for (int i = 1;  i < width -1; i++){
            for (int j = 1; j < height -1; j++){
                int down = newTempMap[i][j+1];          //assignam cada pròxim 
                int downLeft = newTempMap[i-1][j+1];    //valor a una posició
                int downRight = newTempMap[i+1][j+1];   //per canviar-ho tot més fàcil
                int current = newTempMap[i][j];
                int result = (down + downLeft + downRight + current)/4; //mitja de sa temperatura
                tempMap[i][j] = result;
            }
        }
    }
    
    private void flamePaint(){
    
        for (int i = 0; i < width; i++){
            for (int j = 0; j < height; j++){
                this.setRGB(i, j, flamePalette.getColor(tempMap[i][j]));
                //flamePalette.getColor(tempMap[i][j])
        
            }
        }   
    }
     private void coldSparks() {
        for (int i = 0; i < width; i++) {
            for (int j = height - 5; j > 0; j--) {
                if (((int) (Math.random() * 2)) < 1) {
                    tempMap[i][j] = (int)Math.ceil(tempMap[i][j]*0.8);
                }
            }
        }
    }
    
    public void run(){
    
        while(true){
            createSparks();
            flameEvolve();
            coldSparks();
            flamePaint();
            try{
                Thread.sleep(30);}
            catch(Exception e){
                System.out.println(e);
            }
        }
//    public int getSize(int width, int height){
//        
//        return ;}
//    private int x;
//    private int y;
//    private byte[]array_bytes;
//    private FlamePalette flamePalette = new FlamePalette();
//    private int[][] temperature;//Array 2d que servirà de mapa de temperatura
//    BufferedImage bimage = new BufferedImage(800,600,BufferedImage.TYPE_INT_ARGB);
//
//    public void paint(Graphics g) {
//        for int (x = 0; x < flamePalette.length;
//        x++){
//            for int (y = 0; y < flamePalette[x].length;
//            y++){
//                bimage.setRGB(x, y, flamePalette[x][y].getRGB());
//            }
//        }
//    }
//    public void setPixel(int y, int x, int Temp){
//        Color color = flamePalette.colors.get(Temp);
//    }
//    public createSparks(){
//        
//        int temperatura = 0;
//        for int()
    }
}

