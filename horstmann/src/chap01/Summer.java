package chap01;


/**
 *  ex. 1.10
 * @author emaphis
 */
public class Summer {

    public int sum_1_100() {
        return sum(1, 100);
    }

    public int sum_100_1000() {
        return sum(100, 1000);
    }

    public int sum(int beg, int end) {
        int sum = 0;
        for (int i = beg; i <= end; i++) {
            sum += i;
        }
        return sum;
    }
}
