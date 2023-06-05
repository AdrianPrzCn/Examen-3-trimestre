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
public class Rectangulo extends Figura2D {

    private Double base;
    private Double altura;
    

    public Rectangulo(Double coordenadaXVIF, Double coordenadaYVIF, Double base, Double altura) throws IllegalArgumentException {
        
        super(coordenadaXVIF + (base/2), coordenadaYVIF + (altura/2));

        if (base <= 0 || altura <= 0) {

            throw new IllegalArgumentException();

        } else {

            this.base = base;
            this.altura = altura;

        }

    }

    public Rectangulo(Punto2D punto, Double base, Double altura) throws NullPointerException {
        
        super(punto);
        
        if (base <= 0 || altura <= 0) {

            throw new IllegalArgumentException();

        } else {

            this.base = base;
            this.altura = altura;

        }
        
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        
        if (base <= 0) {
            
            throw new IllegalArgumentException();
            
        } else {
            
            this.base = base;
            
        }
        
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        
        if (altura <= 0) {
            
            throw new IllegalArgumentException();
            
        } else {
            
            this.altura = altura;
            
        }
        
    }

    public Punto2D getCentro() {
        return super.getCentro();
    }

    public void setCentro(Punto2D centro) throws NullPointerException {
        
        super.setCentro(centro);
        
    }
    
    public Punto2D [] getVertices () {
    
        Punto2D [] vertices = new Punto2D [4];
        
        vertices [0] = new Punto2D(super.getCentro().getCoordenadaX() - (base/2), super.getCentro().getCoordenadaY() - (altura/2));
        vertices [1] = new Punto2D(super.getCentro().getCoordenadaX() - (base/2), super.getCentro().getCoordenadaY() + (altura/2));
        vertices [2] = new Punto2D(super.getCentro().getCoordenadaX() + (base/2), super.getCentro().getCoordenadaY() + (altura/2));
        vertices [3] = new Punto2D(super.getCentro().getCoordenadaX() + (base/2), super.getCentro().getCoordenadaY() - (altura/2));
    
        return vertices;
        
    }

    @Override
    public Double getArea() {
        return (base * altura);
    }

    @Override
    public Double getPerimetro() {
        return ((base*2) + (altura*2));
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.base) + super.hashCode();
        hash = 37 * hash + Objects.hashCode(this.altura) + super.hashCode();
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
        final Rectangulo other = (Rectangulo) obj;
        if (!super.equals(obj) || !Objects.equals(this.base, other.base) || !Objects.equals(this.altura, other.altura)) {
            return false;
        }
        return Objects.equals(obj, other);
    }
    
    

}
