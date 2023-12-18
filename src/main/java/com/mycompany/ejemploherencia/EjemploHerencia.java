/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemploherencia;
import java.util.Scanner;
/**
 *
 * @author labctr
 */
public class EjemploHerencia {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor del radio");
        double radio;
        radio=leer.nextDouble();
        //Crear una objeto de una clase
        Circulo circulo1=new Circulo(radio);
        //Imprimir el valor del area
        System.out.println("El area del circulo es: " + circulo1.CalcularArea());
        //
        System.out.println("Ingrese el valor del radio");
        double base;
        double altura;
        base=leer.nextDouble();
        altura=leer.nextDouble();
        Triangulo triangulo1=new Triangulo(base,altura );
        System.out.println("El area del triangulo es:"+ triangulo1.CalcularArea());
    }
}
