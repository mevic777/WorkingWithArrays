package WorkingWithArrays;

import java.util.Random;
import java.util.Scanner;

public class ArrayMax {

    public void max() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter a number for array: ");

        int number = scanner.nextInt();
        int[] array = new int[number];
        int max = array[0];
        int min = array[0];

        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(340) + 0;
        }
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            if (max <= array[i]) {
                max = array[i];
            }
            else min = array[i];
        }

        System.out.println("Max number: " + max + " Min number: " + min);
    }
}
