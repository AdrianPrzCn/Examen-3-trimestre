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
public class CirculoTest {
    
    public CirculoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }

    @Test
    public void testGetDiametro_01() {
        System.out.println("getDiametro");
        Circulo instance = new Circulo(0.0, 0.0, 4.0);
        double expResult = 8.0;
        double result = instance.getDiametro();
        assertEquals(expResult, result, 0.005);
    }

    @Test
    public void testGetDiametro_02() {
        System.out.println("getDiametro");
        Circulo instance = new Circulo(2.5, 3.97, 2.5);
        double expResult = 5.0;
        double result = instance.getDiametro();
        assertEquals(expResult, result, 0.005);
    }

    /**
     * Test of getArea method, of class Circulo.
     */
    @Test
    public void testGetArea_01() {
        System.out.println("getArea");
        Circulo instance = new Circulo(0.0, 0.0, 4.0);
        double expResult = 50.2656;
        double result = instance.getArea();
        assertEquals(expResult, result, 0.005);
    }

    @Test
    public void testGetArea_02() {
        System.out.println("getArea");
        Circulo instance = new Circulo(2.44, 5.1423, 2.5);
        double expResult = 19.635;
        double result = instance.getArea();
        assertEquals(expResult, result, 0.005);
    }

    @Test
    public void testGetArea_03() {
        System.out.println("getArea");
        Circulo instance = new Circulo(1.8634, 2.9981, 1.3324);
        double expResult = 5.577250310016;
        double result = instance.getArea();
        assertEquals(expResult, result, 0.005);
    }

    /**
     * Test of getPerimetro method, of class Circulo.
     */
    @Test
    public void testGetPerimetro_01() {
        System.out.println("getPerimetro");
        Circulo instance = new Circulo(0.0, 0.0, 4.0);
        double expResult = 25.1328;
        double result = instance.getPerimetro();
        assertEquals(expResult, result, 0.005);
    }

    @Test
    public void testGetPerimetro_02() {
        System.out.println("getPerimetro");
        Circulo instance = new Circulo(2.44, 5.1423, 2.5);
        double expResult = 15.708;
        double result = instance.getPerimetro();
        assertEquals(expResult, result, 0.005);
    }

    @Test
    public void testGetPerimetro_03() {
        System.out.println("getPerimetro");
        Circulo instance = new Circulo(1.8634, 2.9981, 1.3324);
        double expResult = 8.37173568;
        double result = instance.getPerimetro();
        assertEquals(expResult, result, 0.005);
    }

    /**
     * Test of equals method, of class Circulo.
     */
    @Test
    public void testEquals_01a() {
        System.out.println("equals - Iguales");
        Object obj = new Circulo(2.44, 5.1423, 2.5);
        Circulo instance = new Circulo(2.44, 5.1423, 2.5);
        
        assertTrue(instance.equals(obj));
    }

    @Test
    public void testEquals_01b() {
        System.out.println("equals - Iguales");
        Object obj = new Circulo(1.8634, 2.9981, 1.3324);
        Circulo instance = new Circulo(1.8634, 2.9981, 1.3324);
        
        assertTrue(instance.equals(obj));
    }

    @Test
    public void testEquals_02a() {
        System.out.println("equals - Difieren en coordenada X del centro");
        Object obj = new Circulo(1.8634, 2.9981, 1.3324);
        Circulo instance = new Circulo(1.12, 2.9981, 1.3324);
        
        assertFalse(instance.equals(obj));
    }

    @Test
    public void testEquals_02b() {
        System.out.println("equals - Difieren en coordenada Y del centro");
        Object obj = new Circulo(1.8634, 2.9982, 1.3324);
        Circulo instance = new Circulo(1.8634, 2.9981, 1.3324);
        
        assertFalse(instance.equals(obj));
    }

    @Test
    public void testEquals_03() {
        System.out.println("equals - Difieren en el radio");
        Object obj = new Circulo(1.8634, 2.9981, 1.3324);
        Circulo instance = new Circulo(1.8634, 2.9981, 1.332);
        
        assertFalse(instance.equals(obj));
    }
    
}
