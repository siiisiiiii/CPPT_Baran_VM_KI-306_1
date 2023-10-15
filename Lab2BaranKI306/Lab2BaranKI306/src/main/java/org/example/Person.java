package org.example;
import java.io.File;
import java.io.FileNotFoundException; import java.io.PrintWriter;
/**
 *  Class Person
 *  @version 1.0
 */
public class Person {
    public String name;
    int weight;
    double height;
    int age;
    Mouth mouth;
    Brain brain;
    PrintWriter fout;

    /**
     * Constructor
     *
     * @param name       person name
     * @param height     person height
     * @param weight     person weight
     * @param outPutFile output file
     * @throws FileNotFoundException
     */
    public Person(String name, int weight, double height, String outPutFile) throws FileNotFoundException {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.height = height;
        fout = new PrintWriter(new File(outPutFile));
        mouth = new Mouth(fout, name);
        brain = new Brain(name);
    }

    /**
     * this.name = name; this.weight = weight; this.age = age; this.height = height;
     * fout = new PrintWriter(new File(outPutFile)); mouth = new Mouth(fout, name);
     * brain = new Brain(name);
     * <p>
     * Method to say something
     */
    public void say(String msg) {
        mouth.say(msg);
    }

    /**
     * Method to tell someone
     */
    public void tell(Person person, String msg) {
        PrintMessage(name + " tells " + person.name + ": ");
        mouth.say(msg);
    }
    /**
     *  Method for calculation
     */
    public int calculate(int a, int b)
    {
        int result = brain.sum(a,b);
        PrintMessage(name + " adds two numbers: " + a + "," + b);
        PrintMessage("Result: " + result);
        return result;
    }
    /**
     *  Method returns age
     */
    public void getAge()
    {
        PrintMessage(age);
    }
    /**
     *  Method returns height
     */
    public void getHeight()
    {
        PrintMessage(height);
    }
    /**
     *  Method returns weight
     */
    public void getWeight()
    {
        PrintMessage(this.weight);
    }
    /**
     *  Method for calculating BMI
     */
    public void calculateBodyMassIndex()
    {
        double idx = weight / Math.pow(height, 2);
        PrintMessage( "Body mass index: " + idx);
    }
    /**
     *  Method exits
     */
    public void dispose()
    {
        fout.flush();
        fout.close();
    }
    protected <T> void PrintMessage(T msg)
    {
        System.out.println(msg); fout.println(msg);
    }
}
