import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NestedLoopsTests {

    @Test
    void xSquareTest() {
        String expected = "XXXXX\nXXXXX\nXXXXX\nXXXXX\nXXXXX\n";
        String actual = NestedLoops.xSquare(5);
        assertEquals(expected, actual);
    }

    @Test
    void flippedTriangleTest() {
        String expected = "*******\n******\n*****\n****\n***\n**\n*\n";
        String actual = NestedLoops.flippedTriangle(7);
        assertEquals(expected, actual);
    }

    @Test
    void fizzBuzzTest() {
        String expected = "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz 16 17 Fizz 19 Buzz\n" +
                "Fizz 22 23 Fizz Buzz 26 Fizz 28 29 FizzBuzz 31 32 Fizz 34 Buzz Fizz 37 38 Fizz Buzz\n" +
                "41 Fizz 43 44 FizzBuzz 46 47 Fizz 49 Buzz ";
        String actual = NestedLoops.fizzBuzz(50);
        assertEquals(expected, actual);
    }

    @Test
    void sidewaysTest() {
        String expected = "        1 \n      2 1 \n    3 2 1 \n  4 3 2 1 \n5 4 3 2 1 \n  4 3 2 1 \n    3 2 1 \n      2 1 \n        1 \n";
        String actual = NestedLoops.sideways();
        assertEquals(expected, actual);
    }
}
