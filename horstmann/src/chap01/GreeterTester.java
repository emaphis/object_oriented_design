
package chap01;

/**
 * Exercise the Greeter class
 * @author emaphis
 */
public class GreeterTester {
    /**
     * Main application entry point
     * @param args is unused.
     */
    public static void main(String[] args) {
        Greeter worldGreeter = new Greeter("World");
        String greeting = worldGreeter.sayHello();
        System.out.println(greeting);

        String adue = worldGreeter.sayGoodbye();
        System.out.println(adue);
    }
}
