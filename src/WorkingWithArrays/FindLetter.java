package WorkingWithArrays;

import java.util.Random;
import java.util.Scanner;

public class FindLetter {

    public void find() {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter a number for array: ");

        int number = scanner.nextInt();
        char[] array = new char[number];

        for (int i = 0; i < array.length; i++) {
            array[i] = (char)(random.nextInt(26) + 'a');
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            switch (array[i]) {
                case 'a': System.out.println(array[i] + " Este o vocala");
                    break;
                case 'e': System.out.println(array[i] + " Este o vocala");
                    break;
                case 'i': System.out.println(array[i] + " Este o vocala");
                    break;
                case 'u': System.out.println(array[i] + " Este o vocala");
                    break;
                case 'o': System.out.println(array[i] + " Este o vocala");
                    break;
            }
        }
    }
}
