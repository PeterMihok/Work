/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

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
public class CarportTest {
    Carport cp;
    
    public CarportTest() {
        this.cp = new Carport(1, "Title", "UUID", 2, 3, 4, "CPType", "RoofType");
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
     * Test of getCarportID method, of class Carport.
     */
    @Test
    public void testGetCarportID() {
        System.out.println("getCarportID");
        int expResult = 1;
        int result = cp.getCarportID();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCarportID method, of class Carport.
     */
    @Test
    public void testSetCarportID() {
        System.out.println("setCarportID");
        int CarportID = 11;
        cp.setCarportID(CarportID);
        int result = cp.getCarportID();
        assertEquals(CarportID, result);
    }

    /**
     * Test of getTitle method, of class Carport.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        String expResult = "Title";
        String result = cp.getTitle();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTitle method, of class Carport.
     */
    @Test
    public void testSetTitle() {
        System.out.println("setTitle");
        String Title = "newTitle";
        cp.setTitle(Title);
        String result = cp.getTitle();
        assertEquals(Title, result);
    }

    /**
     * Test of getUUID method, of class Carport.
     */
    @Test
    public void testGetUUID() {
        System.out.println("getUUID");
        String expResult = "UUID";
        String result = cp.getUUID();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUUID method, of class Carport.
     */
    @Test
    public void testSetUUID() {
        System.out.println("setUUID");
        String UUID = "newUUID";
        cp.setUUID(UUID);
        String result = cp.getUUID();
        assertEquals(UUID, result);
    }

    /**
     * Test of getHeight method, of class Carport.
     */
    @Test
    public void testGetHeight() {
        System.out.println("getHeight");
        int expResult = 2;
        int result = cp.getHeight();
        assertEquals(expResult, result);
    }

    /**
     * Test of setHeight method, of class Carport.
     */
    @Test
    public void testSetHeight() {
        System.out.println("setHeight");
        int Height = 333;
        cp.setHeight(Height);
        int result = cp.getHeight();
        assertEquals(Height, result);
    }

    /**
     * Test of getWidth method, of class Carport.
     */
    @Test
    public void testGetWidth() {
        System.out.println("getWidth");
        int expResult = 3;
        int result = cp.getWidth();
        assertEquals(expResult, result);
    }

    /**
     * Test of setWidth method, of class Carport.
     */
    @Test
    public void testSetWidth() {
        System.out.println("setWidth");
        int Width = 999;
        cp.setWidth(Width);
        int result = cp.getWidth();
        assertEquals(Width, result);
    }

    /**
     * Test of getLength method, of class Carport.
     */
    @Test
    public void testGetLength() {
        System.out.println("getLength");
        int expResult = 4;
        int result = cp.getLength();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLength method, of class Carport.
     */
    @Test
    public void testSetLength() {
        System.out.println("setLength");
        int Length = 323;
        cp.setLength(Length);
        int result = cp.getLength();
        assertEquals(Length, result);
    }

    /**
     * Test of getCarportType method, of class Carport.
     */
    @Test
    public void testGetCarportType() {
        System.out.println("getCarportType");
        String expResult = "CPType";
        String result = cp.getCarportType();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCarportType method, of class Carport.
     */
    @Test
    public void testSetCarportType() {
        System.out.println("setCarportType");
        String CarportType = "newCPType";
        cp.setCarportType(CarportType);
        String result = cp.getCarportType();
        assertEquals(CarportType, result);
    }

    /**
     * Test of getRoofType method, of class Carport.
     */
    @Test
    public void testGetRoofType() {
        System.out.println("getRoofType");
        String expResult = "RoofType";
        String result = cp.getRoofType();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRoofType method, of class Carport.
     */
    @Test
    public void testSetRoofType() {
        System.out.println("setRoofType");
        String RoofType = "newRType";
        cp.setRoofType(RoofType);
        String result = cp.getRoofType();
        assertEquals(RoofType, result);
    }
    
}
