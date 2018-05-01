/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivinaminumero;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author matias
 */
public class AdivinaMiNumero1Test {
    
    public AdivinaMiNumero1Test() {
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

    /**
     * Test of jugar method, of class AdivinaMiNumero1.
     */
//    @Test
//    public void testJugar() {
//        System.out.println("jugar");
//        AdivinaMiNumero1 instance = new AdivinaMiNumero1();
//        instance.jugar();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of adivinar method, of class AdivinaMiNumero1.
     */
    @Test
    public void testAdivinar() {
        System.out.println("adivinar");
        int min = 0;
        int max = 100;
        int result = AdivinaMiNumero1.adivinar(min, max);
        if(result<0||result>100){
            fail("The test case is a prototype.");
        }
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
