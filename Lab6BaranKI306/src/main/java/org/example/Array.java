package org.example;

import java.util.ArrayList;
/**
 *	Class Array
 *	@version 1.0
 */
public class Array<T extends Shape> {
    private ArrayList<T> storage = new ArrayList();
    /**
     *	Method returns an item by the index
     *	@param index Element index
     *	@throws Exception
     */
    public T get(int index) throws Exception
    {
        try{
            return storage.get(index);
        }
        catch (Exception e){
            throw e;
        }
    }
    /**
     *	Method adds an item
     *	@param item Item to be added
     *	@throws Exception
     */
    public void add(T item) throws Exception
    {
        try {
            storage.add(item);
        }
        catch (Exception e)
        {
            throw e;
        }
    }
    /**
     *	Method shows storage content
     */
    public void showAll() {
        for (int i = 0; i < storage.size(); i++) {
            try {
                storage.get(i).printData();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    /**
     *	Method returns total volume
     */
    public int getTotalVolume()
    {
        int result = 0;
        for(int i = 0; i < storage.size(); i++)
        {
            result += storage.get(i).getVolume();
        }
        return result;
    }
    /**
     *	Method returns the biggest item
     */
    public T getLargestFigure()
    {
        int largestIdx = 0;
        for(int i = 0; i < storage.size(); i++)
        {
            if(i == 0)
            {
                continue;
            }
            if(storage.get(i).getVolume() > storage.get(largestIdx).getVolume())
            {
                largestIdx = i;
            }
        }
        return storage.get(largestIdx);
    }
}