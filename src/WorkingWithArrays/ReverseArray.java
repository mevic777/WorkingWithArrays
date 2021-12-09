package WorkingWithArrays;

import java.util.Random;
import java.util.Scanner;

public class ReverseArray {

    public void reverse() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter a number for array: ");

        int number = scanner.nextInt();
        int[] array = new int[number];

        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(340) + 0;
        }

        System.out.println("First array: ");

        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("Second array: ");

        for(int i = number - 1; i < array.length; i--) {
            System.out.println(array[i]);
        }
    }
}
