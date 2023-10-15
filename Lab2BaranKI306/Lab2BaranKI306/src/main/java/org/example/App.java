package org.example;

import java.io.FileNotFoundException;
/**
 *  Class App
 *  @version 1.0
 */
public class App {
    /**
     * @param args
     */
    public static void main(String[] args) throws FileNotFoundException
    {
        Person person = new Person("Roberto", 90, 1.85, "lab3.txt");
        person.calculateBodyMassIndex();
        person.calculate(10,3);
        person.say("Hi!");
        Person person1 = new Person("Donald", 85, 2.00, "lab3.txt");
        person.tell(person1, "Hello!");

        person.getAge();
        person.getWeight();
        person.getHeight();
        person.dispose();
    }
}
