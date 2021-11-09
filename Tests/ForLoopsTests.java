import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ForLoopsTests {

    @Test
    void printingHashTagsTest1() {
        String expected = "##########";
        String actual = ForLoops.printingHashTags(10);
        assertEquals(expected, actual);
    }

    @Test
    void printingHashTagsTest2() {
        String expected = "";
        String actual = ForLoops.printingHashTags(-1);
        assertEquals(expected, actual);
    }

    @Test
    void countDownTest1() {
        String expected = "4 3 2 1 0 -1 -2 -3 -4 ";
        String actual = ForLoops.countDown(4, -4);
        assertEquals(expected, actual);
    }

    @Test
    void countDownTest2() {
        String expected = "-1 -2 -3 -4 -5 -6 -7 -8 ";
        String actual = ForLoops.countDown(-8, -1);
        assertEquals(expected, actual);
    }

    @Test
    void sumNumbersLargestFirst() {
      int expected = 11 + 12 + 13 + 14 + 15 + 16 + 17 + 18 + 19 + 20;
      int actual = ForLoops.sumNumbers(20, 11);
      assertEquals(expected, actual);
    }

    @Test
    void sumNumbersSmallestFirst() {
        int expected = 78 + 79 + 80 + 81 + 82 + 83 + 84 + 85;
        int actual = ForLoops.sumNumbers(78, 85);
        assertEquals(expected, actual);
    }

    @Test
    void powerPositive() {
        int expected = 15625;
        int actual = ForLoops.power(5, 6);
        assertEquals(expected, actual);
    }

    @Test
    void powerNegativeEven() {
        int expected = 64;
        int actual = ForLoops.power(-2, 6);
        assertEquals(expected, actual);
    }

    @Test
    void powerNegativeOdd() {
        int expected = -128;
        int actual = ForLoops.power(-2, 7);
        assertEquals(expected, actual);
    }

}
