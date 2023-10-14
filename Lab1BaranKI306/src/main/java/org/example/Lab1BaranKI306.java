package org.example;

import java.io.*;
import java.util.*;

/**
 * This class generates a square matrix with custom placeholder characters and writes the result to a file.
 */
public class Lab1BaranKI306 {
    public static void main(String[] args) throws FileNotFoundException {
        int nRows; // Variable to store the size of the matrix
        char[][] arr; // Two-dimensional array to store characters
        String filler; // Placeholder character
        Scanner in = new Scanner(System.in);

        File dataFile = new File("MyFile.txt"); // File for writing the result
        PrintWriter fout = new PrintWriter(dataFile);

        System.out.print("Enter the size of the square matrix: ");
        nRows = in.nextInt(); // User enters the size of the matrix
        in.nextLine();

        arr = new char[nRows][];

        for (int i = 0; i < nRows; i++) {
            arr[i] = new char[nRows - i]; // Initialize matrix rows
        }

        System.out.print("\nEnter a placeholder character: ");
        filler = in.nextLine(); // User enters the placeholder character

        int spacing = 0; // Initial spacing (2 spaces)

        exit:
        for (int i = 0; i < nRows; i++) {
            for (int s = 0; s < spacing; s++) {
                System.out.print(" ");
                fout.print(" ");
            }
            for (int j = 0; j < nRows - i; j++) {
                if (filler.length() == 1) {
                    arr[i][j] = (char) filler.codePointAt(0);
                    System.out.print(arr[i][j] + " ");
                    fout.print(arr[i][j] + " ");
                } else if (filler.length() == 0) {
                    System.out.print("\nNo placeholder character entered");
                    break exit; // Exit the outer loop
                } else {
                    System.out.print("\nToo many placeholder characters");
                    break exit; // Exit the outer loop
                }
            }
            System.out.print("\n");
            fout.print("\n");
            spacing += 2; // Increase the spacing by 2 spaces
        }

        fout.flush();
        fout.close();
    }
}
