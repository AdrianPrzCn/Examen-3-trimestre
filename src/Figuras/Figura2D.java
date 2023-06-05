/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

import java.util.Objects;

/**
 *
 * @author ciclos
 */
public abstract class Figura2D {
    
    protected Punto2D centro;

    public Figura2D(Double coordenadaX, Double coordenadaY) {
        
        if (coordenadaX == null || coordenadaY == null) {
            
            throw new IllegalArgumentException();
            
        } else {

            centro = new Punto2D(coordenadaX, coordenadaY);
            
        }
         
    }   
    
    public Figura2D(Punto2D punto) {
        
        if (punto == null) {
            
            throw new NullPointerException();
            
        } else {
            
            centro = punto;
            
        }
        
    }

    public Punto2D getCentro() {
        return centro;
    }

    public void setCentro(Punto2D centro) {
        
        if (centro == null) {
            
            throw new NullPointerException();
            
        } else {
            
            this.centro = centro;
            
        }
        
    }
    
    public void setCentro(Double coordenadaX, Double coordenadaY) {
        
        if (coordenadaX == null || coordenadaY == null) {
            
            throw new IllegalArgumentException();
            
        } else {
            
            centro.setPunto2D(coordenadaX, coordenadaY);
            
        }
        
    }
    
    public void desplazarEnX (Double distanciaX){
    
        centro.setCoordenadaX(centro.getCoordenadaX() + distanciaX);
    
    }
    
    public void desplazarEnY (Double distanciaY){
    
        centro.setCoordenadaY(centro.getCoordenadaY() + distanciaY);
    
    }
    
    public void desplazarEnXY (Double distanciaX, Double distanciaY){
    
        centro.setCoordenadaX(centro.getCoordenadaX() + distanciaX);
        centro.setCoordenadaY(centro.getCoordenadaY() + distanciaY);
    
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.centro);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Figura2D other = (Figura2D) obj;
        if (!Objects.equals(this.centro, other.centro)) {
            return false;
        }
        return Objects.equals(obj, other);
    }
    
    public abstract Double getArea();
    
    public abstract Double getPerimetro();
    
}
