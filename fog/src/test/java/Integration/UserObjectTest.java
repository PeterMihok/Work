/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Integration;

import Domain.UserRole;
import Web.DTO.UserSessionDto;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 *
 * @author Sean
 */

@Category (IntegrationTest.class)
public class UserObjectTest {
    
    //
     @Test
     public void newUserObjectTest()
     {
         System.out.println("testing User Object..");
         UserSessionDto usdto = new UserSessionDto();
         UserRole expResult = UserRole.Visitor;
         UserRole result = usdto.getRole();
         assertEquals(expResult, result);
     }
}
