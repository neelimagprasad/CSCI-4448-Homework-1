package csci4448.homework1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyMathFunctionsTest {

    MyMathFunctions myMathFunctions = new MyMathFunctions();

    @BeforeEach
    void setUp() {
        myMathFunctions = new MyMathFunctions();
    }

    @Test
    void testFactorialFor0() {
        assertEquals(1, myMathFunctions.factorial(0));
    }

    // TODO: Uncomment these tests one at a time and implement just the minimum code to make them pass
    @Test
    void testFactorialFor2() {
        assertEquals(2, myMathFunctions.factorial(2));
    }
//
    @Test
   void testFactorialFor5() {
        assertEquals(120, myMathFunctions.factorial(5));
    }
    @Test
    void testFactorialFor10() {
        assertEquals(3628800, myMathFunctions.factorial(10));
    }

    // TODO: Add a test for the factorial method that verifies that the factorial of 10 is 3628800

    // TODO: Uncomment these tests one at a time and implement just the minimum code to make them pass
    @Test
    void testFibonacciFor1() {
        assertEquals(1, myMathFunctions.fibonacci(1));
    }

    @Test
    void testFibonacciFor2() {
        assertEquals(1, myMathFunctions.fibonacci(2));
    }
//
    @Test
    void testFibonacciFor3() {
        assertEquals(2, myMathFunctions.fibonacci(3));
    }
//
    @Test
    void testFibonacciFor4() {
        assertEquals(3, myMathFunctions.fibonacci(4));
    }
//
    @Test
    void testFibonacciFor5() {
        assertEquals(8, myMathFunctions.fibonacci(6));
    }

    // TODO: Add a test for the fibonacci method that verifies that the 21st Fibonacci number is 10946
    @Test
    void testFibonacciFor21() {
        assertEquals(10946, myMathFunctions.fibonacci(21));
    }
}