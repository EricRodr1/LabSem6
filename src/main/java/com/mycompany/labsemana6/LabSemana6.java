/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.labsemana6;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Eric Rodriguez
 */
public class LabSemana6 {

    public static void main(String[] args) {
        
        //Jugar
        String primerapalabra = "UNITEC";
        String segundapalabra = "PROGRAMAR";
        String tercerapalabra = "SISTEMAS";
        String cuartapalabra = "LAB";
        String quintapalabra = "MANGO";
        String sextapalabra = "HAMBRE";
        String septimapalabra = "NOVIEMBRE";
        String octavapalabra = "LECHUZA";
        String novenapalabra = "SUBWAY";
        String decimapalabra = "CINNABON";
        
        Random random = new Random ();
        int numeror = random.nextInt(11);
        String palabraS = "";
        if (numeror == 1) palabraS = primerapalabra;
        if (numeror == 2) palabraS = segundapalabra;
        if (numeror == 3) palabraS = tercerapalabra;
        if (numeror == 4) palabraS = cuartapalabra;
        if (numeror == 5) palabraS = quintapalabra;
        if (numeror == 6) palabraS = sextapalabra; 
        if (numeror == 7) palabraS = septimapalabra;
        if (numeror == 8) palabraS = octavapalabra;
        if (numeror == 9) palabraS = novenapalabra;
        if (numeror == 10) palabraS = decimapalabra; 
        
        String progreso = "";
        for (int i = 0; i < palabraS.length(); i++) {
            progreso += " _ ";
            
           
            
        }
        int numoportunidades = 5;
        Scanner sc = new Scanner(System.in); 
        
        while (numoportunidades > 0 && progreso.contains(" _ ")){
            System.out.println("Palabra: " +progreso);
            System.out.println("Oportunidades: " +numoportunidades);
            System.out.println("Favor ingrese una letra: ");
            char letra = sc.next().charAt(0);
            
            if (palabraS.contains(String.valueOf(letra))){
                System.out.println("Adivinaste una letra");
                String nprogreso = " en";
                for (int i = 0; i < palabraS.length(); i++) {
                    if (palabraS.charAt(i) == letra){
                        nprogreso += letra;
                        
                    } else {
                        nprogreso += progreso.charAt(i);
                    }
                    
                }
                progreso = nprogreso;
            } else {
                System.out.println("La palabra No tiene esa letra ");
                numoportunidades--;
            }
        }
        if (numoportunidades > 0){
            System.out.println("Felicidades! Adivinaste: " +palabraS);
            
        } else {
            System.out.println("Lo siento , no tienes mas oportunidades, la palaba era: "+palabraS);
        }
        sc.close();
    }
}
