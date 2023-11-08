package org.example;

import java.io.*;
import java.util.Scanner;

class CalcWFio {
    private double result;

    public void calculate(double x) {
        double radians = Math.toRadians(x); // Переводимо градуси в радіани
        result = Math.tan(radians);
    }

    public double getResult() {
        return result;
    }

    public void writeResTxt(String fName) {
        try (PrintWriter f = new PrintWriter(fName)) {
            f.printf("%f", result);
        } catch (FileNotFoundException ex) {
            System.out.print(ex.getMessage());
        }
    }

    public void readResTxt(String fName) {
        try {
            File f = new File(fName);
            if (f.exists()) {
                try (Scanner s = new Scanner(f)) {
                    result = s.nextDouble();
                }
            } else {
                throw new FileNotFoundException("File " + fName + " not found");
            }
        } catch (FileNotFoundException ex) {
            System.out.print(ex.getMessage());
        }
    }

    public void writeResBin(String fName) {
        try (DataOutputStream f = new DataOutputStream(new FileOutputStream(fName))) {
            f.writeDouble(result);
        } catch (IOException ex) {
            System.out.print(ex.getMessage());
        }
    }

    public void readResBin(String fName) {
        try (DataInputStream f = new DataInputStream(new FileInputStream(fName))) {
            result = f.readDouble();
        } catch (IOException ex) {
            System.out.print(ex.getMessage());
        }
    }
}
