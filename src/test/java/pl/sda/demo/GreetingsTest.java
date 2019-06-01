package pl.sda.demo;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Mariusz Kowalczuk
 */
public class GreetingsTest {

    @Test
    public void greet() {
        //given
        Greetings greetings = new Greetings();
        String name = "Ala";

        //when
        String result = greetings.greet(name);

        //then
        Assert.assertEquals("Witaj Ala", result);
    }


    @Test
    public void greetNullSafe() {

        //given
        Greetings greetings = new Greetings();
        String name = null;

        // when
        String result = greetings.greet(name);

        //then
        Assert.assertEquals("Witaj, mój przyjacielu", result);
    }

}