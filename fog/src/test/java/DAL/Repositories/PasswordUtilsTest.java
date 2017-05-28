/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL.Repositories;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sean
 */
public class PasswordUtilsTest {
    
    public PasswordUtilsTest() {
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
     * Test of getSaltedHash method, of class PasswordUtils.
     */
    @Test
    public void testGetSaltedHash() {
        System.out.println("getSaltedHash");
        String input = "password";
        String expResult = "b287aee9efb8b6378b83105d7b343cdcb8dcc7b5";
        String result = PasswordUtils.getSaltedHash(input);
        assertEquals(expResult, result);
    }
    
}
