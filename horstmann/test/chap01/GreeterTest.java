/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chap01;

import chap01.Greeter;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author emaphis
 */
public class GreeterTest {

    public GreeterTest() {
    }


    /**
     * Test of sayHello method, of class Greeter.
     */
    @Test
    public void testSayHello() {
        System.out.println("sayHello");
        Greeter instance = new Greeter("World");
        String expResult = "Hello, World!";
        String result = instance.sayHello();
        assertEquals(expResult, result);
    }

    /**
     * Test of sayGoodbye method of class Greeter.
     */
    @Test
    public void testSayGoodbye() {
        System.out.println("sayGoodbye");
        Greeter instance = new Greeter("World");
        String expected = "Goodbye, World!";
        String result = instance.sayGoodbye();
        assertEquals(expected, result);
    }

    /**
     * Test setName
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        Greeter instance = new Greeter("World");
        String expResult = "Hello, World!";
        String result = instance.sayHello();
        assertEquals(expResult, result);
        instance.setName("Globe");
        expResult = "Hello, Globe!";
        result = instance.sayHello();
        assertEquals(expResult, result);
    }

    /**
     * Test copyNameTo
     */
    @Test
    public void testCopyNameTo() {
        System.out.println("copyNameTo");
        Greeter instance = new Greeter("World");
        Greeter other = new Greeter("Other");
        String expResult = "Hello, World!";
        String result = instance.sayHello();
        assertEquals(expResult, result);
        assertEquals("Hello, Other!", other.sayHello());
        instance.copyNameTo(other);
        expResult = "Hello, World!";
        result = other.sayHello();
        assertEquals(expResult, result);
    }
}
