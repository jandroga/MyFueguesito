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
import javax.imageio.ImageIO;
import static javax.swing.Spring.height;
import static javax.swing.Spring.width;
import myfire.FlamePalette;


public class Flame extends BufferedImage implements Runnable{
    
    private FlamePalette flamePalette;
    int width = 800;
    int height = 640;
    int[][] tempMap; //array 2d que servirà de mapa de temperatura
    

        
    public Flame(FlamePalette flamePalette){
        super(400,400,BufferedImage.TYPE_INT_ARGB);
        //BufferedImage bimage = new BufferedImage.TYPE_INT_ARGB;
        this.flamePalette = flamePalette;
        tempMap = new int[width][height];
    }
    
    
    
    public void createSparks(){
    
        for (int i = 1; i < width; i++){ //recorrem la base del foc
            if(((int)(Math.random()*5+1))<3){
                tempMap[height -1][i] = 255;
            }
        }

    }
    
    private BufferedImage createFlameImage(byte[] imageData) {
    ByteArrayInputStream bais = new ByteArrayInputStream(imageData);
    //bais = flamePalette;
    try {
        return ImageIO.read(bais);
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}
    
    public BufferedImage createFlameImage(){
        
        return this;
    }
    
    public void flameEvolve(){
    
        int[][] newTempMap = new int[width][height];
        for(int i = 0;  i < width -1; i++){
            for(int j = 0; j < height -1; j++){
        
                if(((tempMap[i+1][j-1] + tempMap[i+1][j])/3) > 0){//Cercam els valors a i (base) i j (altura) a les posicions que envolten
                        newTempMap[i][j] = (tempMap[i+1][j-1] + tempMap[i+1][j] + tempMap[i+1][j+1])/3 - 1;//el tempMap i les canviam fent una mitja
                }else newTempMap[i][j] = (tempMap[i+1][j-1] + tempMap[i+1][j] + tempMap[i+1][j+1])/3;//però si la temp és 0 ja no li restam 1 per atenuar-la
            }
        }
        tempMap = newTempMap;
    }
    
    private void flamePaint(){
    
        for (int i = 0; i < width; i++){
            for (int j = 0; j < height; j++){
                this.setRGB(i, j, flamePalette.getColor(tempMap[i][j]));
        
            }
         
        }
        
    }
    
//    private void flameUpdate() {
//        for (int i = 0; i < width; i++) {
//            for (int j = 0; j < height; j++) {
//                this.setRGB(j, i, flamePalette.getColor(tempMap[i][j]));
//            }
//        }
//    }
    
    public void run(){
    
        int i=0;
        while(true){
            while(true){
            createSparks();
            flameEvolve();
            
            
        try{
        sleep(30);}
        catch(Exception e){
            System.out.println(e);
        }
        i++;
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
}
