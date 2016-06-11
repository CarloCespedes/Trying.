/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import Exceptions.ErrorNoPositiveNumber;
import Exceptions.ErrorParameterMissed;
import Exceptions.ErrorToMuchParameters;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    public void EquilateroTest()throws ErrorNoPositiveNumber, ErrorParameterMissed, ErrorToMuchParameters{
        try{
        TrianguloClass t = new TrianguloClass(7,7,7);
        String res; 
        res = t.lados();
        
        assertEquals("Es un triangulo Equilatero", res);
    }
        catch(ErrorNoPositiveNumber e){
                Logger.getLogger(TRianguloTest.class.getName()).log(Level.SEVERE, null, e);
           }
    }


    @Test
    public void IsoscelesTest() throws ErrorNoPositiveNumber, ErrorParameterMissed, ErrorToMuchParameters{
       try{
        TrianguloClass t = new TrianguloClass(7,5,7);
        String res; 
        res = t.lados();
        
        assertEquals("Es un triagulo Isoceles", res);
       }
       catch(ErrorNoPositiveNumber e){
            Logger.getLogger(TRianguloTest.class.getName()).log(Level.SEVERE, null, e);
       }
       }
   
    @Test
    public void EscalenoTest() throws ErrorParameterMissed, ErrorToMuchParameters, ErrorNoPositiveNumber{
        try{
        TrianguloClass t = new TrianguloClass(7,5,1);
        String res; 
        res = t.lados();
        
        assertEquals("Es un triagulo Escaleno", res);
        }
        catch(ErrorNoPositiveNumber e){
            Logger.getLogger(TRianguloTest.class.getName()).log(Level.SEVERE, null, e);
       }
    }
    
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
