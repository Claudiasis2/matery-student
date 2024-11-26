

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class NumerosTests.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class FiboTest
{
    private Fibo f;
    /**
     * Default constructor for test class NumerosTests
     */
    public FiboTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        f = new Fibo();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void testFibonaci()
    {
        assertEquals(0, f.fib(0));
    }
    
    @Test
    public void testFibonaci1()
    {
        assertEquals(1, f.fib(1));
    }
    
    @Test
    public void testFibonaci2()
    {
        assertEquals(1, f.fib(2));
    }
    
    @Test
    public void testFibonaci3()
    {
        assertEquals(2, f.fib(3));
    }
    
    @Test
    public void testFibonaci4()
    {
        assertEquals(3, f.fib(4));
    }
    
    @Test
    public void testFibonaci5()
    {
        assertEquals(5, f.fib(5));
    }
    
    @Test
    public void testFibonaci6()
    {
        assertEquals(8, f.fib(6));
    }
    
    @Test
    public void testFibonaciNegative()
    {
        assertEquals(-8, f.fib(-6));
    }
}

