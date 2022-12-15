/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.j_adivina2;
import java.util.Scanner;
/**
 *
 * @author jhonpraxedes
 */
public class clsAdivina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("DESEAS JUGAR ");
        System.out.println("PRESIONA 1 PARA EMPEZAR ");
        System.out.println("PRESIONA CUALQUIER TECLA PARA SALIR");
        
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        switch (num) {
            case 1:
                juego obj = new juego();
                obj.adivina();
                break;
            
        }
        
        
        
    }
    
}
