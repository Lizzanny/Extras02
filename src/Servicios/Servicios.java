/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import PlanoCartesiano.PlanoCartesiano;
import Puntos.Puntos;
import java.util.Scanner;

/**
 *
 * @author LizzW
 */
public class Servicios {
    private Scanner sc = new Scanner(System.in);
    Puntos p = new Puntos();
    PlanoCartesiano pp = new PlanoCartesiano();
    
    public void crearPuntos(){
        System.out.println("Ingrese:");
        System.out.println("X1:");
        p.setX1(sc.nextInt());
        
        System.out.println("Y1:");
        p.setY1(sc.nextInt());
        
        System.out.println("X2:");
        p.setX2(sc.nextInt());
        
        System.out.println("Y2:");
        p.setY2(sc.nextInt());
    }
    
    public void calcular(){
        double resultado = Math.sqrt(Math.pow((p.getX2()-p.getX1()),2)+Math.pow((p.getY2()-p.getY1()),2));
        System.out.println("La distancia es:"+resultado);
    }
    
    public void menu(){
        boolean salir=true;
        int opc;
        while(salir){
            System.out.println("==========MENU===========");
            System.out.println("1. Crear puntos");
            System.out.println("2. Calcular distancia");
            System.out.println("3. Salir");
            System.out.println("Ingrese la opción:");
    
            try{
                String local = sc.next();
                opc = Integer.parseInt(local) ;
            }catch(Exception e){
                opc=4;
            }
            switch (opc) {
                case 1:
                    crearPuntos();
                    break;
                case 2:
                    calcular();
                    pp.ejercutar(p.getX1(), p.getY1(), p.getX2(), p.getY2());
                    break;
                case 3:
                    salir=false;
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        }
    }
}
