/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cubos;

import ambientes.*;
import actores.*;
import dibujo.JPanelDibujo;
import java.io.File;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import javax.swing.JFrame;
import org.jpl7.Query;

/**
 *
 * @author Ingrid Cruz 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    static JPanelDibujo panelDibujo = new JPanelDibujo();
    static JFrame frame = new JFrame();
    
    public static Paisaje ambiente;
    public static Cubo cubor, cuboa, cubov;
    static int tiempo = 15;
    static int xCuboR, xCuboA, xCuboV;
    static int yCuboR, yCuboA, yCuboV;
    
    static String imgFondo = "src/imagenes/fondo.png";
    static String imgCR = "src/imagenes/cubor.png";
    static String imgCA = "src/imagenes/cuboa.png";
    static String imgCV = "src/imagenes/cubov.png";

    public static void main(String[] args) throws InterruptedException {
        
        String t1 = "consult('cubos.pl')";
        Query q1 = new Query(t1);
        System.out.println((q1.hasSolution()?"exito":"fracaso"));
        
        String t2 = "sol(A)", acciones;
        Query q2 = new Query(t2);
        acciones = String.valueOf(q2.oneSolution().get("A"));
        
        frame.setTitle("Cubos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        
        //estado inicial
        ambiente = new Paisaje(0, 0, imgFondo);
        cubor = new Cubo(337, 416, imgCR);
        cuboa = new Cubo(467, 416, imgCA);
        cubov = new Cubo(337, 286, imgCV);
        
        frame.add(panelDibujo);
        frame.setSize(800, 800);
        frame.setVisible(true);

        for(int i = acciones.length()-1; i >= 0; i--){   
            if(acciones.charAt(i)>=97 && acciones.charAt(i)<=111) 
            switch(acciones.charAt(i)){
                case 'a':  System.out.println("3 lad izq 1");
                    xCuboV = 337;
                    for (int j = 337; j >= 206; j--) {
                        cubov = new Cubo(xCuboV, 285, imgCV);
                        xCuboV--;
                        frame.repaint();//pintar muchas veces
                        Thread.sleep(tiempo);
                    }
                    yCuboV = 285;
                    for (int j = 285; j <= 416; j++) {
                        cubov = new Cubo(206, yCuboV, imgCV);
                        yCuboV++;
                        frame.repaint();
                        Thread.sleep(tiempo);
                    }
                break;
                case 'b':  System.out.println("1 encima 2");
                    yCuboR = 416;
                    for (int j = 416; j >= 285; j--) {
                        cubor = new Cubo(337, yCuboR, imgCR);
                        yCuboR--;
                        frame.repaint();
                        Thread.sleep(tiempo);
                    }
                    xCuboR = 337;
                    for (int j = 337; j <= 467; j++) {
                        cubor = new Cubo(xCuboR, 285, imgCR);
                        xCuboR++;
                        frame.repaint();
                        Thread.sleep(tiempo);
                    }
                break;
                case 'c':  System.out.println("3 lad izq 2");
                   xCuboV = 206;
                    for (int j = 206; j <= 336; j++) {
                        cubov = new Cubo(xCuboV, 416, imgCV);
                        xCuboV++;
                        frame.repaint();
                        Thread.sleep(tiempo);
                    }
                break;
                case 'd':  System.out.println("1 lad izq 3");
                    xCuboR = 467;
                    for (int j = 467; j >= 206; j--) {
                        cubor = new Cubo(xCuboR, 285, imgCR);
                        xCuboR--;
                        frame.repaint();
                        Thread.sleep(tiempo);
                    }
                    yCuboR = 285;
                    for (int j = 285; j <= 415; j++) {
                        cubor = new Cubo(206, yCuboR, imgCR);
                        yCuboR++;
                        frame.repaint();
                        Thread.sleep(tiempo);
                    }
                break;
                case 'e':  System.out.println("2 sobre 3");
                    yCuboA = 337;
                    for (int j = 337; j >= 286; j--) {
                        cuboa = new Cubo(467, yCuboA, imgCA);
                        yCuboA--;
                        frame.repaint();
                        Thread.sleep(tiempo);
                    }
                    xCuboA = 467;
                    for (int j = 467; j >= 336; j--) {
                        cuboa = new Cubo(xCuboA, 285, imgCA);
                        xCuboA--;
                        frame.repaint();
                        Thread.sleep(tiempo);
                    }
                break;
                case 'f':  System.out.println("1 sobre 2");
                    cubor = new Cubo(206, 155, imgCR); 
                    frame.repaint();
                    
                    yCuboR = 336;
                    for (int j = 336; j >= 155; j--) {
                        cubor = new Cubo(206, yCuboR, imgCR);
                        yCuboR--;
                        frame.repaint();
                        Thread.sleep(tiempo);
                    }
                    xCuboR = 206;
                    for (int j = 206; j <= 336; j++) {
                        cubor = new Cubo(xCuboR, 155, imgCR);
                        xCuboR++;
                        frame.repaint();
                        Thread.sleep(tiempo);
                    }
                break;
            }
        } 
    }
}
