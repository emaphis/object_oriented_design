
package chap01;

/**
 *
 * @author emaphis
 */
public class TestSummer {
    public static void main(String[] args) {
        Summer summer = new Summer();
        System.out.println("sum of 1 to 100 " + summer.sum_1_100());
        System.out.println("sum of 100 to 1000 " + summer.sum_100_1000());
    }
}
