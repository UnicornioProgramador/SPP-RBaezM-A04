/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.rbaezm.a04;
import java.util.Scanner;
//Rubén Daniel Báez Muñiz A01411504     IMT
/**
 *
 * @author Dany
 */
public class SPPRBaezMA04 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declarar teclado.
        Scanner kb= new Scanner(System.in);
        //Declarar variables 
        int opcion;
        double Ang, Sin, Cos, Tan;
        
        System.out.println("============================");
        System.out.println(" CALCULADORA TRIGONOMÉTRICA");
        System.out.println("============================");
        System.out.println("1. Calcular Seno.");
        System.out.println("2. Calcular Coseno");
        System.out.println("3. Calcular Tangente");
        System.out.println("4. Salir.");
        opcion = kb.nextInt();
        //Switch case 
        switch (opcion){
            case 1:
            System.out.println("Ingrese un ángulo entre 0°-360° para calcular su Seno.");
                Ang = kb.nextDouble();
                if (Ang >= 0 & Ang <= 360){
                    Sin = Math.sin(Ang);
                    System.out.println("El Seno del ángulo es="+Sin);                       
                                          } else {
                                            System.out.println("El ángulo ingresado no es válido.");
                                                 }
                                                 break;
            case 2:
                System.out.println("Ingrese un ángulo entre 0°-360° para calcular su Coseno.");
                Ang = kb.nextDouble();
                if (Ang >= 0 & Ang <= 360){
                    Cos = Math.cos(Ang);
                    System.out.println("El Coseno del ángulo es="+Cos);                       
                                          } else {
                                            System.out.println("El ángulo ingresado no es válido.");
                                                 }
                                                 break;
            case 3:
                System.out.println("Ingrese un ángulo entre 0°-360° para calcular su Tangente.");
                Ang = kb.nextDouble();
                if (Ang >= 0 & Ang <= 360){
                    Tan = Math.tan(Ang);
                    System.out.println("La Tangente del ángulo es="+Tan);                       
                                          } else {
                                            System.out.println("El ángulo ingresado no es válido.");
                                                 }
                                                 break;
            case 4:
                System.out.println("========");
                System.out.println(" Adiós.");
                System.out.println("========");
                System.exit(0);
                       }
                }
}