
package chap01;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author emaphis
 */
public class SummerTest {

    public SummerTest() {
    }

    /**
     * Test of sum_1_100 method, of class Summer.
     */
    @Test
    public void testSum_1_100() {
        System.out.println("sum_1_100");
        Summer instance = new Summer();
        int expResult = 5050;
        int result = instance.sum_1_100();
        assertEquals(expResult, result);
    }

    /**
     * Test of sum_100_1000 method, of class Summer.
     */
    @Test
    public void testSum_100_1000() {
        System.out.println("sum_100_1000");
        Summer instance = new Summer();
        int expResult = 495550;
        int result = instance.sum_100_1000();
        assertEquals(expResult, result);
    }

    /**
     * Test of sum method, of class Summer.
     */
    @Test
    public void testSum() {
        System.out.println("sum");
        int beg = 1;
        int end = 10;
        Summer instance = new Summer();
        int expResult = 55;
        int result = instance.sum(beg, end);
        assertEquals(expResult, result);
    }

}
