/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import triangulo.TrianguloClass;
/**
 *
 * @author Jafet Benítez
 */
public class TRianguloTest {
    
    public TRianguloTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void EquilateroTest(){
        TrianguloClass t = new TrianguloClass(7,7,7);
        String res; 
        res = t.lados();
        
        assertEquals("Es un triangulo Equilatero", res);
    }


    @Test
    public void IsoscelesTest(){
        TrianguloClass t = new TrianguloClass(7,5,7);
        String res; 
        res = t.lados();
        
        assertEquals("Es un triagulo Isoceles", res);
    }
   
    @Test
    public void EscalenoTest(){
        TrianguloClass t = new TrianguloClass(7,5,1);
        String res; 
        res = t.lados();
        
        assertEquals("Es un triagulo Escaleno", res);
    }
    
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
