/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoexamen;

import Figuras.Figura2D;
import Figuras.Punto2D;
import java.util.Comparator;

/**
 *
 * @author ciclos
 */
public class ComparadorFigurasGeometricas implements Comparator<Figura2D>{

    @Override
    public int compare(Figura2D o1, Figura2D o2) {
        
        if (o1.getArea().compareTo(o2.getArea()) != 0) {
            
            if (o1.getArea() > o2.getArea()) {
                
                return -1;
                
            } else {
                
                return 1;
                
            }
            
        } else if (o1.getPerimetro().compareTo(o2.getPerimetro()) != 0) {
            
            if (o1.getPerimetro() > o2.getPerimetro()) {
                
                return 1;
                
            } else {
                
                return -1;
                
            }
            
        }
        
        return 0;
        
    }
    
}
