/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import DAL.Repositories.UserRepository;
import Domain.User;
import Domain.UserRole;
import Web.DTO.ValidationResult;
import java.util.HashMap;
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
public class UserValidatorTest {
    UserRepository urep;
    
    public UserValidatorTest() {
         urep = new UserRepository();
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
     * Test of validateSignup method, of class UserValidator.
     */
    @Test
    public void testValidateSignup() throws Exception {
        System.out.println("validateSignup");        
        String email = "sean@hotmail.com";
        String password = "short";
        String passwordConfirmation = "long";
        UserValidator instance = new UserValidator();
        ValidationResult expResult = new ValidationResult();
        expResult.errors.put("email", "The user already exists");
        expResult.errors.put("password", "Password doesn't match password confirmation");
        ValidationResult result = instance.validateSignup(email, password, passwordConfirmation);
        assertEquals(expResult.errors, result.errors);
    }

    /**
     * Test of validateLogin method, of class UserValidator.
     */
    @Test
    public void testValidateLogin() throws Exception {
        System.out.println("validateLogin");
        String email = "email@hotmail.com";
        String password = "";
        UserValidator instance = new UserValidator();
        ValidationResult expResult = new ValidationResult();
        expResult.errors.put("password", "Password can't be empty");
        ValidationResult result = instance.validateLogin(email, password);
        assertEquals(expResult.errors, result.errors);
    }

    /**
     * Test of validateEdit method, of class UserValidator.
     */
    @Test
    public void testValidateEdit() throws Exception {
        System.out.println("validateEdit");
        User user = new User("sean", "altoft", "sean@hotmail.com", "pass", UserRole.Registered);   
        UserValidator instance = new UserValidator();
        ValidationResult expResult = new ValidationResult();
        expResult.errors.put("email", "This email is already used");
        ValidationResult result = instance.validateEdit(user);
        assertEquals(expResult.errors, result.errors);
    }
    
       /**
     * Test of validateEmail method, of class UserValidator.
     */
    @Test
    public void testValidateEmail() throws Exception {
        System.out.println("validateEdit");
        User user = new User("sean", "altoft", "seanhotmail.com", "pass", UserRole.Registered);   
        UserValidator instance = new UserValidator();
        ValidationResult expResult = new ValidationResult();
        expResult.errors.put("email", "Email is not valid");
        ValidationResult result = instance.validateEdit(user);
        assertEquals(expResult.errors, result.errors);
    }
    
}
