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
public class Circulo extends Figura2D{
    
    private Double radio;
    private static final Double PI = 3.1416D;

    public Circulo(Double coordenadaX, Double coordenadaY, Double radio) throws NullPointerException {
        
        super(coordenadaX, coordenadaY);
        
        if (radio <= 0) {
            
            throw new IllegalArgumentException();
            
        } else {
            
            this.radio = radio;
            
        }
        
    }

    public Circulo(Punto2D punto, Double radio) throws NullPointerException {
        
        super(punto);
        
        if (radio <= 0) {
            
            throw new IllegalArgumentException();
            
        } else {
            
            this.radio = radio;
            
        }
        
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        
        if (radio <= 0) {
            
            throw new IllegalArgumentException();
            
        } else {
            
           this.radio = radio; 
            
        }
        
    }

    public Punto2D getCentro() {
        
        return super.getCentro();
        
    }

    public void setCentro(Punto2D centro) throws NullPointerException {

        super.setCentro(centro);

    }
    
    public Double getDiametro(){
    
        return this.radio * 2;
    
    }

    @Override
    public Double getArea() {
        return (PI * (Math.pow(this.radio, 2)));
    }

    @Override
    public Double getPerimetro() {
        return (2 * (PI * this.radio));
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.radio) + super.hashCode();
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
        final Circulo other = (Circulo) obj;
        if (!super.equals(obj) || !Objects.equals(this.radio, other.radio)) {
            return false;
        }
        return Objects.equals(obj, other);
    }
    
    
    
}
