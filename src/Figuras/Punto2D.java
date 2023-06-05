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
public class Punto2D {

    private Double coordenadaX;
    private Double coordenadaY;

    public Punto2D(Double coordenadaX, Double coordenadaY) {

        if (coordenadaX == null || coordenadaY == null) {

            throw new IllegalArgumentException();

        } else {

            this.coordenadaX = coordenadaX;
            this.coordenadaY = coordenadaY;

        }

    }

    public Punto2D(Punto2D punto) throws NullPointerException {

            this.coordenadaX = punto.coordenadaX;
            this.coordenadaY = punto.coordenadaY;


    }

    public Double getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(Double coordenadaX) {
        
        if (coordenadaX == null) {
            
            throw new NullPointerException();
            
        } else {
            
            this.coordenadaX = coordenadaX;
            
        }
        
    }

    public Double getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(Double coordenadaY) {
        
        if (coordenadaY == null) {
            
            throw new NullPointerException();
            
        } else {
            
            this.coordenadaY = coordenadaY;
            
        }
        
    }
    
    public void setPunto2D(Double coordenadaX, Double coordenadaY) {
        
        if (coordenadaX == null || coordenadaY == null) {
            
            throw new NullPointerException();
            
        } else {
            
            this.coordenadaX = coordenadaX;
            this.coordenadaY = coordenadaY;
            
        }
        
    }
    
    public double getDistancia(Punto2D otroPunto) throws NullPointerException {
    
        Double distancia;
        
        Punto2D punto = new Punto2D (coordenadaX, coordenadaY);
        
        distancia = Math.sqrt(Math.pow((punto.coordenadaX - otroPunto.getCoordenadaX()), 2.0) + Math.pow((punto.coordenadaY - otroPunto.getCoordenadaY()), 2.0));
        
        return distancia;
    
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.coordenadaX);
        hash = 53 * hash + Objects.hashCode(this.coordenadaY);
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
        final Punto2D other = (Punto2D) obj;
        if (!Objects.equals(this.coordenadaX, other.coordenadaX)) {
            return false;
        }
        if (!Objects.equals(this.coordenadaY, other.coordenadaY)) {
            return false;
        }
        if (!Objects.equals(this.coordenadaX, other.coordenadaX) || !Objects.equals(this.coordenadaY, other.coordenadaY)) {
            return false;
        }
        return Objects.equals(obj, other);
    }
    
}
