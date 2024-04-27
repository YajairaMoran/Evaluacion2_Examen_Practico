/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_examen_fund_prog;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class EVA2_EXAMEN_FUND_PROG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String iniciar, cont;
        String Iniciar = "si";
        String Cont = "no";
        int resp;
        double compu;
        compu = Math.random();
        Scanner captu = new Scanner(System.in);

        while (true){
            System.out.println("Deseas continuar si o no");
            iniciar = captu.nextLine();
            if (iniciar.equals(Iniciar))
                break;}
                
        System.out.println("Selecciona piedra = 1, papel = 2 o tijera = 3");
        resp =captu.nextInt();
        
        { if (compu > 0 )
            System.out.println("Computadora = piedra");
        else
            if (compu > 0.35 )
                System.out.println("Computadora = papel");
        else
            //if (compu >= 0.75)
            System.out.println("Computadora = tijera");
        }
        
        
        {if (compu >= 0 && resp == 1)
            System.out.println("Empate");
        else
            if (compu >= 0 && resp == 2)
            System.out.println("Ganaste");
                else 
                    if (compu >= 0.00 && resp == 3) 
                    System.out.println("Perdiste");
        else            
        if (compu >= 0.35 && resp == 1)
            System.out.println("Perdiste");
        else
            if (compu >= 0.35 && resp == 2)
            System.out.println("Empate");
                else 
                    if (compu >= 0.35 && resp == 3) 
                    System.out.println("Ganaste");
        else            
        if (compu >= 0.75 && resp == 1)
            System.out.println("Ganaste");
        else
            if (compu >= 0.75 && resp == 2)
            System.out.println("Perdiste");
                else 
                    //if (compu >= 0.75 && resp == 3) 
                    System.out.println("Empate");
        }        
        
            System.out.println("");
            
        resp = 1;
            for (int i = 0; i  == 0 ; i =+ 1) {
                System.out.println("Computadora = " + i);
            }
        resp = 2;
        for (int i = 0; i == 0 ; i =+ 1) {
                System.out.println("Usuario = " + i);
        }
        resp = 3;
        for (int i = 0; i == 0 ; i++) {
                System.out.println("Empate = " + i);
        }
        

        while (true){
            System.out.println("Deseas continuar si o no");
            cont = captu.nextLine();
            if (cont.equals(Cont))
      break;
        }  
    
    
    }  
}
