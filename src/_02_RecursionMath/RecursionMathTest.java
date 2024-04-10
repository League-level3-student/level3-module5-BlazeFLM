package _02_RecursionMath;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecursionMathTest {
    
    @Test
    public void testMultiplication() {
        assertEquals(12, RecursionMath.recursiveMultiplication(3, 4));
        
        // Add more JUnit tests like the one above to test your method
        
    }

    @Test
    public void testDivision() {
        // Add JUnit tests to test your method
    	assertEquals(3, RecursionMath.recursiveDivision(12, 4));
    	assertEquals(4, RecursionMath.recursiveDivision(12, 3));
    	assertEquals(5, RecursionMath.recursiveDivision(50, 10));
    }

    @Test 
    public void testPower() {
        // Add JUnit tests to test your method
        fail("Write some tests!");
    }
}
