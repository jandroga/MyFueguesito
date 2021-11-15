/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myfire;

import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author NitroPC
 */
public class FlamePalette {
    int[] colors;
    private ArrayList<ColorFinal> targetArray = new ArrayList<ColorFinal>();
  
    
//    public FlamePalette(){
//        this.colors = createColors();
//        }
    
    
    
    public void createColors(){//Método per crear es colors que després aniran
        colors = new int[256];
        Color color0 = new Color(0,0,0,0); //assignam un color a nes colors que tendrà sa flameta
        Color color1 = new Color (255,87,0,255/4);
        Color color2 = new Color (255,180,0,255/3);
        Color color3 = new Color (255,166,0,255/2);
        Color color4 = new Color (255,23,0,255);
//        colors[255/5] = color0;
//        colors[255/4] = color1;
//        colors[255/3] = color2;
//        colors[255/2] = color3;
//        colors[255/1] = color4;
//        
        //Calculam sa diferència que ha d'haver en cada canal perquè es produesqui un canvi, dividint 255 entre 4
        
        //Interpol·lació, canviar a interpolateColors. 4 colors amb variacions a cada punt
	double r1 = (color1.getRed() - color0.getRed()) / 63.75;        //255/4
	double g1 = (color1.getGreen() - color0.getGreen()) / 63.75;
        double b1 = (color1.getBlue() - color0.getBlue()) / 63.75;
	double a1 = (color1.getAlpha() - color0.getAlpha()) / 63.75;  
        
        double r2 = (color2.getRed() - color3.getRed()) / 63.75;
	double g2 = (color2.getGreen() - color3.getGreen()) / 63.75;
        double b2 = (color2.getBlue() - color3.getBlue()) / 63.75;
	double a2 = (color2.getAlpha() - color3.getAlpha()) / 63.75;     
        
        double r3 = (color3.getRed() - color4.getRed()) / 63.75;
	double g3 = (color3.getGreen() - color4.getGreen()) / 63.75;
        double b3 = (color3.getBlue() - color4.getBlue()) / 63.75;
	double a3 = (color3.getAlpha() - color4.getAlpha()) / 63.75;  
        
        double r4 = (color4.getRed() - color3.getRed()) / 63.75;
	double g4 = (color4.getGreen() - color3.getGreen()) / 63.75;
        double b4 = (color4.getBlue() - color3.getBlue()) / 63.75;
	double a4 = (color4.getAlpha() - color3.getAlpha()) / 63.75;     
        
        
//        for (int i = 1; i < colors.length-1; i++) {
//			if (i < 85) {
//				colors[i] = correctRGBA(
//						(int)(color0.getRed()+r1*i),
//						(int)(color0.getGreen()+g1*i),
//						(int)(color0.getBlue()+b1*i),
//						(int)(color0.getAlpha()+a1*i)
//						);
//			} else if (i > 85 && i < 170) {
//				colors[i] = correctRGBA(
//						(int)(color1.getRed()+r2*(i-63.5)),
//						(int)(color1.getGreen()+g2*(i-63.5)),
//						(int)(color1.getBlue()+b2*(i-63.5)),
//						(int)(color1.getAlpha()+a2*(i-63.5))
//						);	
//			} else if (i > 170 && i < 255) {
//				colors[i] = correctRGBA(
//						(int)(color2.getRed()+r3*(i-127.5)),
//						(int)(color2.getGreen()+g3*(i-127.5)),	
//						(int)(color2.getBlue()+b3*(i-127.5)),	
//						(int)(color2.getAlpha()+a3*(i-127.5))
//						);
//			} else if (i > 170 && i < 255) {
//				colors[i] = correctRGBA(
//						(int)(color3.getRed()+r3*(i-191.25)),
//						(int)(color3.getGreen()+g3*(i-191.25)),	
//						(int)(color3.getBlue()+b3*(i-191.25)),	
//						(int)(color3.getAlpha()+a3*(i-191.25))
//						);
//			}
//                        
//		}
//        
//    return colors;
//    }
//    public static Color correctRGBA(int r, int g, int b, int a) {
//		if (r < 0) {
//			r = 0;
//		}
//		if (g < 0) {
//			g = 0;
//		}
//		if (b < 0) {
//			b = 0;
//		}
//		if (a < 0) {
//			a = 0;
//		}
//		if (r > 255) {
//			r = 255;
//		}
//		if (g > 255) {
//			g = 255;
//		}
//		if (b > 255) {
//			b = 255;
//		}
//		if (a > 255) {
//			a = 255;
//		}
//		return new Color(r,g,b,a);
//	}
	
//	public static Color correctRGB(int r, int g, int b) {
//		if (r < 0) {
//			r = 0;
//		}
//		if (g < 0) {
//			g = 0;
//		}
//		if (b < 0) {
//			b = 0;
//		}
//		if (r > 255) {
//			r = 255;
//		}
//		if (g > 255) {
//			g = 255;
//		}
//		if (b > 255) {
//			b = 255;
//		}
//		return new Color(r,g,b);
//	}
    }
        
        public int getColor(int temp){ //Pillar color
        if (colors == null) createColors();//si la paleta és buida, createColors()
        return colors[temp];//buida
        }
//        public void createColors(){
//            
//            colors = new int[256];
//            for(int i=0; i<)
//        }

    public class ColorFinal {
        
        public int temp;
        public Color color;
        
        public void ColorFinal(int temp, Color color){
        
            this.temp = temp;
            this.color = color;
        }

        private void addColorFinal(ColorFinal colorFinal){
            targetArray.add(colorFinal);
        }
    }
        FlamePalette flamePalette;
        
        public void setFlamePalette(FlamePalette addColorFinal) {
            createColors();
            flamePalette = new FlamePalette();
            flamePalette.addColorFinal(new ColorFinal(255, Color.yellow));
            flamePalette.addColorFinal(new ColorFinal(color1));
            flamePalette.addColorFinal(new ColorFinal(color0));
            flamePalette.addColorFinal(new ColorFinal(color0));
            flamePalette.addColorFinal(new ColorFinal(color0));
        }
    }
        
        

