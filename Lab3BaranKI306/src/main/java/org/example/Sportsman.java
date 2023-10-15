package org.example;

import java.io.FileNotFoundException;
interface ISportsman{
    void run(int sec) throws InterruptedException;
}


/**
 *	Class Sportsman
 *	@version 1.0
 */
public class Sportsman extends Person implements ISportsman{
    /**
     *	Constructor
     *	@param name person name
     *	@param height person height
     *	@param weight person weight
     *	@param outPutFile output file
     *	@throws FileNotFoundException
     */
    public Sportsman(String name, int weight, double height, String outPutFile) throws FileNotFoundException {
        super(name, weight, height, outPutFile);
    }

    /**
     *	Constructor
     *	@param sec
     *	@throws InterruptedException
     */
    public void run(int sec) throws InterruptedException
    {
        for (int i = 0; i < sec; i++)
        {
            super.PrintMessage(name + " is running("+i+" sec)");


            Thread.sleep(1000);
        }
    }
}
