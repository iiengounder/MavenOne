/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.automated_unit_testing_one;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Novashnee
 */
public class UnitTestingTest {
    
    public UnitTestingTest() {
    }

    @Test
    public void testAddition() {
        
        UnitTesting ut = new UnitTesting(); 
        int expected = (4); 
        int actual = ut.addition(2,2);
        
        assertEquals(expected, actual);
    }
    
    @Test 
    public void testSubtraction(){
        
        UnitTesting ut = new UnitTesting(); 
        int expected = 6; 
        int actual = ut.subtraction(10, 4); 
        
        assertEquals(expected, actual); 
    }
    
    @Test 
    public void testMessage(){
        
        UnitTesting ut = new UnitTesting(); 
        String expected = "Hello World"; 
        String actual = ut.message(); 
        
        assertEquals(expected, actual); 
    }
}
