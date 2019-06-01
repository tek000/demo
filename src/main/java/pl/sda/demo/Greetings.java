package pl.sda.demo;

/**
 * @author Mariusz Kowalczuk
 */
public class Greetings {

    public String greet(String name){
        if (name == null){
            return "Witaj, mój przyjacielu";

        }
        return "Witaj " + name ;
    }
}
