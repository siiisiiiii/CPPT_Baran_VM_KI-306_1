package org.example;

import java.io.FileNotFoundException;
/**
 *	Class App
 *	@version 1.0
 */
public class Human {
    /**
     * @param args
     */
    public static void main(String[] args) throws FileNotFoundException, InterruptedException
    {
        Sportsman person = new Sportsman("Roberto", 90, 1.85, "lab4.txt"); person.calculateBodyMassIndex();
        person.calculate(10,3); person.say("Hi!");

        person.run(5);

        person.dispose();
    }
}
