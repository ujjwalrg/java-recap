package edu.ics211.h0;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Sqroots {
    public static void main(String[] args) {
        try (Scanner userIn = new Scanner(System.in)) {
            System.out.println("Enter an Int value");
            int input = userIn.nextInt();
            System.out.print((returnArray(input))[0]);
        } catch (InputMismatchException ime) {
            System.out.println("Mismatch input");
        }
    }

    public static double[] returnArray(int arg) {
        double[] arr = new double[4];
        int low = 2;
        if (arg > 2) {
            System.out.println("Is valid");
            for (int i = 0; i < 4; i++) {
                Random r = new Random();
                int result = r.nextInt(arg - low) + low;
                arr[i] = Math.sqrt(result);
            }
        } else {
            System.out.println("Is invalid, number must be greater than 2");
        }
        return arr;
    }
}
