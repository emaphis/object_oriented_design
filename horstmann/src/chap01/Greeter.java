
package chap01;

/**
 * A class producing simple greetings
 * @author emaphis
 */
public class Greeter {
    private String name;

    /**
     * Constructs a Greeter object that can greet a person of entity
     * @param aName the name of the person of entity who should
     * be addressed in the greetings
     */
    public Greeter(String aName) {
        this.name = aName;
    }

    /**
     * Greet with a "Hello" message.
     * @return a message containing "Hello" and the name of
     * the greeted person or entity
     */
    public String sayHello() {
        return "Hello, " + name + "!";
    }

    /**
     * Bid adeu with a "Goodbye" message.
     * @return a message containing "Goodbye" and the name
     * of the person or entity
     */
    public String sayGoodbye() {
        return "Goodbye, " + name + "!";
    }

    /**
     * Sets a new name for the greeter class.
     * @param newName the new name
     */
    public void setName(String newName) {
        this.name = newName;
    }

    /**
     * Sets another greeter's name to this greeter's name.
     * @param other a reference to the othe Greeter.
     */
    public void copyNameTo(Greeter other) {
        other.name = this.name;
    }
}
