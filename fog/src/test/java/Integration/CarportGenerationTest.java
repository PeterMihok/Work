/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Integration;

import Domain.Carport;
import Domain.Carport_Has_Inventory;
import Services.SectionGeneration;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 *
 * @author Sean
 */
@Category (IntegrationTest.class)
public class CarportGenerationTest {
    Carport cp;
    
    public CarportGenerationTest()
    {
        this.cp = new Carport("Custom", "uuu", 250, 240, 300, "Standard", "flat");
    }
        
    @Test
    public void testPartGeneration(){
         System.out.println("testing Carport Generation..");
        ArrayList<Carport_Has_Inventory> cpinvlist = new ArrayList();
        SectionGeneration sGen = new SectionGeneration();
        
        try {
            cpinvlist = sGen.initPartGeneration(cp);
        } catch (Exception ex) {
            Logger.getLogger(CarportGenerationTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       if (cpinvlist.isEmpty())
       {
           fail("inventory list is empty");
       }
       if (cpinvlist.size() < 6)
       {
           fail("inventory list size is too small");
       }
    }
}
