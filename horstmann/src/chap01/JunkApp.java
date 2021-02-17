
package chap01;

/**
 * App to test junk code
 * @author emaphis
 */
public class JunkApp {
    public static void main(String[] args) {
        //ex_1_11();
        ex_1_12();
    }

    static String ex_1_11() {
        Greeter junk = null;
        return junk.sayHello();
    }

    static void ex_1_12() {
        Greeter worldGreeter = new Greeter("World");
        Greeter daveGreeter = new Greeter("Dave");
        worldGreeter.copyNameTo(daveGreeter);
        System.out.println("dave " + daveGreeter.sayHello());
        System.out.println("world " + worldGreeter.sayHello());
    }
}
