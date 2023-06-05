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
public class Punto2DTest {
    
    public Punto2DTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }

     @Test(expected = NullPointerException.class)
    public void testGetDistancia_01() {
        System.out.println("getDistancia");
        Punto2D otroPunto = null;
        Punto2D instance = new Punto2D(0.0, 0.0);
        instance.getDistancia(otroPunto);
    }

    @Test
    public void testGetDistancia_02a() {
        System.out.println("getDistancia - Mismo punto - Origen");
        Punto2D otroPunto = new Punto2D(0.0, 0.0);
        Punto2D instance = new Punto2D(0.0, 0.0);
        double expResult = 0.0;
        double result = instance.getDistancia(otroPunto);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testGetDistancia_02b() {
        System.out.println("getDistancia - Mismo punto - Negativo");
        Punto2D otroPunto = new Punto2D(-3.55, -7.832);
        Punto2D instance = new Punto2D(-3.55, -7.832);
        double expResult = 0.0;
        double result = instance.getDistancia(otroPunto);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testGetDistancia_02c() {
        System.out.println("getDistancia - Mismo punto - Positivo");
        Punto2D otroPunto = new Punto2D(8.39276, 7.832);
        Punto2D instance = new Punto2D(8.39276, 7.832);
        double expResult = 0.0;
        double result = instance.getDistancia(otroPunto);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testGetDistancia_03a() {
        System.out.println("getDistancia - Puntos distintos - Respecto a origen");
        Punto2D otroPunto = new Punto2D(4.0, 0.0);
        Punto2D instance = new Punto2D(0.0, 0.0);
        double expResult = 4.0;
        double result = instance.getDistancia(otroPunto);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testGetDistancia_03b() {
        System.out.println("getDistancia - Puntos distintos - Respecto a origen");
        Punto2D otroPunto = new Punto2D(0.0, 4.0);
        Punto2D instance = new Punto2D(0.0, 0.0);
        double expResult = 4.0;
        double result = instance.getDistancia(otroPunto);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testGetDistancia_03c() {
        System.out.println("getDistancia - Puntos distintos - Respecto a origen");
        Punto2D otroPunto = new Punto2D(5.0, 2.0);
        Punto2D instance = new Punto2D(0.0, 0.0);
        double expResult = 5.385164807134504;
        double result = instance.getDistancia(otroPunto);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testGetDistancia_03d() {
        System.out.println("getDistancia - Puntos distintos - Respecto a origen");
        Punto2D otroPunto = new Punto2D(7.0, -4.0);
        Punto2D instance = new Punto2D(0.0, 0.0);
        double expResult = 8.06225774829855;
        double result = instance.getDistancia(otroPunto);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testGetDistancia_03e() {
        System.out.println("getDistancia - Puntos distintos - Respecto a origen");
        Punto2D otroPunto = new Punto2D(-20.0, -4.0);
        Punto2D instance = new Punto2D(0.0, 0.0);
        double expResult = 20.396078054371138;
        double result = instance.getDistancia(otroPunto);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testGetDistancia_04a() {
        System.out.println("getDistancia - Puntos distintos - Respecto a -5, 4");
        Punto2D otroPunto = new Punto2D(0.0, 4.0);
        Punto2D instance = new Punto2D(-5.0, 4.0);
        double expResult = 5.0;
        double result = instance.getDistancia(otroPunto);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testGetDistancia_04b() {
        System.out.println("getDistancia - Puntos distintos - Respecto a -5, 4");
        Punto2D otroPunto = new Punto2D(4.0, 4.0);
        Punto2D instance = new Punto2D(-5.0, 4.0);
        double expResult = 9.0;
        double result = instance.getDistancia(otroPunto);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testGetDistancia_04c() {
        System.out.println("getDistancia - Puntos distintos - Respecto a -5, 4");
        Punto2D otroPunto = new Punto2D(7.0, -4.0);
        Punto2D instance = new Punto2D(-5.0, 4.0);
        double expResult = 14.422205101855956;
        double result = instance.getDistancia(otroPunto);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testGetDistancia_04d() {
        System.out.println("getDistancia - Puntos distintos - Respecto a -5, 4");
        Punto2D otroPunto = new Punto2D(-20.0, -4.0);
        Punto2D instance = new Punto2D(-5.0, 4.0);
        double expResult = 17.0;
        double result = instance.getDistancia(otroPunto);
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of equals method, of class Punto2D.
     */
    @Test
    public void testEquals_01() {
        System.out.println("equals - Distintos - Objeto nulo");
        Object obj = null;
        Punto2D instance = new Punto2D(-5.0, 4.0);
        assertFalse(instance.equals(obj));
    }

    @Test
    public void testEquals_02() {
        System.out.println("equals - Iguales - Son mismo objeto");
        Punto2D instance = new Punto2D(-5.0, 4.0);
        Object obj = instance;
        assertTrue(instance.equals(obj));
    }

    @Test
    public void testEquals_03a() {
        System.out.println("equals - Distintos - solo coinciden en x");
        Object obj = new Punto2D(-5.0, 3.0);
        Punto2D instance = new Punto2D(-5.0, 4.0);
        assertFalse(instance.equals(obj));
    }

    @Test
    public void testEquals_03b() {
        System.out.println("equals - Distintos - solo coinciden en y");
        Object obj = new Punto2D(1.0, 4.0);
        Punto2D instance = new Punto2D(-5.0, 4.0);
        assertFalse(instance.equals(obj));
    }

    @Test
    public void testEquals_03c() {
        System.out.println("equals - Distintos - No coincide ni x ni y");
        Object obj = new Punto2D(1.0, -3.0);
        Punto2D instance = new Punto2D(-5.0, 4.0);
        assertFalse(instance.equals(obj));
    }

    @Test
    public void testEquals_04() {
        System.out.println("equals - Iguales - Coincide ni x ni y");
        Object obj = new Punto2D(-5.0, 4.0);
        Punto2D instance = new Punto2D(-5.0, 4.0);
        assertTrue(instance.equals(obj));
    }
    
    
}
