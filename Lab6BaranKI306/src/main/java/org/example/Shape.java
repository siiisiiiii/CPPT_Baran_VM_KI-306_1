package org.example;

public class Shape {
    private int volume;
    private int width;
    private int height;
    private String name;

    /**
     * Constructor
     *
     * @param volume
     * @param width
     * @param height
     * @param name
     */
    public Shape(int volume, int width, int height, String name) {
        this.volume = volume;
        this.width = width;
        this.height = height;
        this.name = name;
    }

    /**
     * Method prints shape data
     */
    public void printData() {
        System.out.println("Name: " + name);
        System.out.println("Volume: " + volume);
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
    }

    /**
     * Method returns shape height
     */
    public int getHeight() {
        return height;
    }

    /**
     * Method returns shape volume
     */
    public int getVolume() {
        return volume;
    }

    /**
     * Method returns shape width
     */
    public int getWidth() {
        return width;
    }

    /**
     * Method returns shape name
     */
    public String getName() {
        return name;
    }
}