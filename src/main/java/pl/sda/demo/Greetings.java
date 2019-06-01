package pl.sda.demo;

/**
 * @author Mariusz Kowalczuk
 */
public class Greetings {

    public String greet(String name) {

        if (name == null) {
            return "Witaj, mój przyjacielu";


        }
        if (name.contains(",")) {
        }
        if (name.substring(1).equals(name.substring(1).toLowerCase())) {
            return "Witaj " + name;

        } else return "WITAJ " + name.toUpperCase() + "!";

    }
}
