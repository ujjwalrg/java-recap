// package edu.ics211.h0;

import java.util.Random;

class Sqroots {
    public double[] returnArray(int arg) {
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
            System.out.println("Is invalid, number must be greater than 2");
            System.out.println("Is invalid, number must be greater than 2");
        }
        return arr;
    }
}

public class Manclass {
    public static void main(String[] args) {
        Sqroots hello = new Sqroots();
        System.out.println((hello.returnArray(10)));
    }

}
