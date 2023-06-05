/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Figuras;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ciclos
 */
public class RectanguloTest {
    
    public RectanguloTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }

     @Test
    public void testGetVertices_01() {
        System.out.println("getVertices");
        Punto2D centro = new Punto2D(0.0, 0.0);
        Rectangulo instance = new Rectangulo(centro, 6.0, 4.0);
        Punto2D[] expResult = {new Punto2D(-3.0, -2.0), new Punto2D(-3.0, 2.0),
            new Punto2D(3.0, 2.0), new Punto2D(3.0, -2.0)};
        Punto2D[] result = instance.getVertices();
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testGetVertices_02() {
        System.out.println("getVertices");
        Punto2D centro = new Punto2D(4.0, 2.0);
        Rectangulo instance = new Rectangulo(centro, 5.0, 3.0);
        Punto2D[] expResult = {new Punto2D(1.5, 0.5), new Punto2D(1.5, 3.5),
            new Punto2D(6.5, 3.5), new Punto2D(6.5, 0.5)};
        Punto2D[] result = instance.getVertices();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of getArea method, of class Rectangulo.
     */
    @Test
    public void testGetArea_01() {
        System.out.println("getArea");
        Punto2D centro = new Punto2D(0.0, 0.0);
        Rectangulo instance = new Rectangulo(centro, 5.0, 3.0);
        double expResult = 15.0;
        double result = instance.getArea();
        assertEquals(expResult, result, 0.005);
    }

    @Test
    public void testGetArea_02() {
        System.out.println("getArea");
        Punto2D centro = new Punto2D(4.0, 3.0);
        Rectangulo instance = new Rectangulo(centro, 4.5, 8.25);
        double expResult = 37.125;
        double result = instance.getArea();
        assertEquals(expResult, result, 0.005);
    }

    /**
     * Test of getPerimetro method, of class Rectangulo.
     */
    @Test
    public void testGetPerimetro_01() {
        System.out.println("getPerimetro");
        Punto2D centro = new Punto2D(0.0, 0.0);
        Rectangulo instance = new Rectangulo(centro, 5.0, 3.0);
        double expResult = 16.0;
        double result = instance.getPerimetro();
        assertEquals(expResult, result, 0.005);
    }

    @Test
    public void testGetPerimetro_02() {
        System.out.println("getPerimetro");
        Punto2D centro = new Punto2D(4.0, 3.0);
        Rectangulo instance = new Rectangulo(centro, 4.5, 8.25);
        double expResult = 25.5;
        double result = instance.getPerimetro();
        assertEquals(expResult, result, 0.005);
    }

    /**
     * Test of equals method, of class Rectangulo.
     */
    @Test
    public void testEquals_01() {
        System.out.println("equals - Iguales");

        Punto2D centro1 = new Punto2D(0.0, 0.0);
        Rectangulo instance = new Rectangulo(centro1, 5.0, 3.0);

        Punto2D centro2 = new Punto2D(0.0, 0.0);
        Rectangulo obj = new Rectangulo(centro2, 5.0, 3.0);

        assertTrue(instance.equals(obj));
    }

    @Test
    public void testEquals_02() {
        System.out.println("equals - Distintos - Difieren en la base");

        Punto2D centro1 = new Punto2D(0.0, 0.0);
        Rectangulo instance = new Rectangulo(centro1, 5.0, 3.0);

        Punto2D centro2 = new Punto2D(0.0, 0.0);
        Rectangulo obj = new Rectangulo(centro2, 8.0, 3.0);

        assertFalse(instance.equals(obj));
    }

    @Test
    public void testEquals_03() {
        System.out.println("equals - Distintos - Difieren en la altura");

        Punto2D centro1 = new Punto2D(0.0, 0.0);
        Rectangulo instance = new Rectangulo(centro1, 5.0, 3.0);

        Punto2D centro2 = new Punto2D(0.0, 0.0);
        Rectangulo obj = new Rectangulo(centro2, 5.0, 1.0);

        assertFalse(instance.equals(obj));
    }

    @Test
    public void testEquals_04() {
        System.out.println("equals - Distintos - Difieren en el centro");

        Punto2D centro1 = new Punto2D(0.0, 0.0);
        Rectangulo instance = new Rectangulo(centro1, 5.0, 3.0);

        Punto2D centro2 = new Punto2D(4.0, 2.0);
        Rectangulo obj = new Rectangulo(centro2, 5.0, 3.0);

        assertFalse(instance.equals(obj));
    }

}
