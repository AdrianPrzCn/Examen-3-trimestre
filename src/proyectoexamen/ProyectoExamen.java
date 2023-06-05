/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoexamen;

import Figuras.Circulo;
import Figuras.Figura2D;
import Figuras.Punto2D;
import Figuras.Rectangulo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ciclos
 */
public class ProyectoExamen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int numTerrenos = 0;
        int numLista = 0;
        String figuraGeometrica;
        Rectangulo rectangulo;
        ArrayList<Figura2D> figuras = null;
        Figura2D figura;
        Circulo circulo;
        Punto2D punto;
        
        numTerrenos = sc.nextInt();
        sc.nextLine();
        
        for (int i = 1; i <= numTerrenos; i++) {
            
            figuraGeometrica = sc.nextLine();
            
            if (figuraGeometrica.contains("Centro")) {
                
                punto = new Punto2D(sc.nextDouble(), sc.nextDouble());
                
                figuras.set(i, rectangulo = new Rectangulo(punto, sc.nextDouble(), sc.nextDouble()));
                
            } else if (figuraGeometrica.contains("Vertice")) {
                
                figuras.set(i, rectangulo = new Rectangulo(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
                
            } else {
                
                figuras.set(i, circulo = new Circulo(sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
                
            }

        }

        System.out.println("La inmobiliaria geométrica:");
        System.out.println("---------------------------");
        System.out.println("1. Listado de terrenos sin ordenar");
        System.out.println("2. Listado de terrenos ordenados por área y perímetro");
        System.out.println("3. Listado de terrenos ordenados por proximidad a un punto y por área");
        System.out.println("4. Salir");
        System.out.print("Introduzca opción elegida:");
        
        numLista = sc.nextInt();
        
        sc.nextLine();
        
        if (numLista == 1) {
            
            System.out.println("Listado de Figuras sin ordenar");
            System.out.println("----------------");
            
            for (int i = 1; i <= figuras.size(); i++) {
                
                System.out.println("Figura " + i + ": " + figuras.getClass());
                
            }
            
        } else if (numLista == 2) {
            
            System.out.println("Listado de Figuras ordenadas por área y perímetro");
            System.out.println("----------------");
            
            for (int i = 1; i <= figuras.size(); i++) {
                
                System.out.println("Figura " + i + ": " + figuras.getClass());
                
            }
            
        } else if (numLista == 3) {
            
            System.out.println("Listado de Figuras ordenadas por área y perímetro");
            System.out.println("----------------");
            
            for (int i = 1; i <= figuras.size(); i++) {
                
                System.out.println("Figura " + i + ": " + figuras.getClass());
                
            }
            
        }
        
    }
    
}
