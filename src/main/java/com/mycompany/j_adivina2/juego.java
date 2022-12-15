/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.j_adivina2;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author jhonpraxedes
 */


public class juego {
    private int GeneraNumero(){
        Random aleatorio = new Random();
        return aleatorio.nextInt(100);
}
    public void adivina(){
    Scanner s = new Scanner(System.in);
        System.out.println("ADIVINA EL NUMERO QUE ESTOY PENSANDO TIENES 2 OPORTUNIDADES");
        int numero=0;
        int numeropienso = GeneraNumero();
        System.out.println("numero =  "+numeropienso);
        
        do{
            System.out.println("introduce un numero entre 1 y 100 = ");
            numero= s.nextInt();
            
            if ((numero<1)||(numero>100)){
                System.out.println("EL NUMERO INTRODUCIDO DEBE ESTAR EN EL RANGO DE 1 A 100");
                System.out.println("INTENTA DE NUEVO");
                numero=s.nextInt();
            }
        }while((numero<1)||(numero>100));
        
        if(numero == numeropienso){
            System.out.println("CORRECTO FELICIDADES GANASTE UNA PINGA");
        }else{
            System.out.println("PERDEDOR SUERTE PARA LA PROXIMA");
        }
    }
    
    }
    

