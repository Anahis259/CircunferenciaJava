/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circunferencia.entidades;

import java.util.Scanner;

/**
 *
 * @author anahi
 */
public class CircunferenciaApp {
    private double radio;
    public double Area;
    public double Perimetro;
    private CircunferenciaApp() {
    
}
/*constructor*/
    public CircunferenciaApp(double radio, double Area, double Perimetro) {
        this.radio = radio;
        this.Area = Area;
        this.Perimetro = Perimetro;
    }
/*setter*/
    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setArea(double Area) {
        this.Area = Area;
    }

    public void setPerimetro(double Perimetro) {
        this.Perimetro = Perimetro;
    }
/*getter*/
    public double getRadio() {
        return radio;
    }

    public double getArea() {
        return Area;
    }

    public double getPerimetro() {
        return Perimetro;
    }

    
    public void CrearCircunferencia(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor del radio ");
        this.radio = leer.nextDouble();
//        System.out.println("la radio ingresada es de: "+radio);
        
    }
    public double CrearArea(){
        Area  = (3.141592*(Math.pow(radio, 2)));
        return Area;
    }
    public double CrearPerimetro(){
        Perimetro  = (2 * 3.141592 * radio);
        return Perimetro;
    }

    @Override
    public String toString() {
        return "CircunferenciaApp{" + "radio=" + radio + ", Area=" + Area + ", Perimetro=" + Perimetro + '}';
    }
    
}
