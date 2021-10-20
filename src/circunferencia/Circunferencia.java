/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circunferencia;

import circunferencia.entidades.CircunferenciaApp;
import java.util.Scanner;

/**
 *
 * @author anahi
 */
public class Circunferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);
         
         CircunferenciaApp circunferencia = new CircunferenciaApp(0, 0, 0); 
         CircunferenciaApp circunferenciaDos = new CircunferenciaApp(0, 0, 0);
         circunferencia.CrearCircunferencia();
         circunferencia.CrearArea();
         circunferencia.CrearPerimetro();
         circunferenciaDos.CrearCircunferencia();
         circunferenciaDos.CrearArea();
         circunferenciaDos.CrearPerimetro();
         System.out.println("Segun el radio: "+circunferencia.getRadio()+" ,el area es de: "+circunferencia.CrearArea()+" ,y el perimetro es de: "+circunferencia.CrearPerimetro());
         System.out.println("Segun el radio: "+circunferenciaDos.getRadio()+" ,el area es de: "+circunferenciaDos.CrearArea()+" ,y el perimetro es de: "+circunferenciaDos.CrearPerimetro());

    }
    
}
