package WorkingWithArrays;

import java.util.Random;
import java.util.Scanner;

public class ArraySum {

    public void sumArray() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter a number for array: ");

        int number = scanner.nextInt();
        int[] array = new int[number];
        int sum = 0;

        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(340) + 0;
        }
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            sum += array[i];
        }

        System.out.println("Sum is: " + sum);
    }
}
