import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива" + "\n");
        int a = scanner.nextInt();
        double[] mass = new double [a];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = Math.random();
        }
        double max = 0.0, min = 1.0;
        for (int i = 0; i < mass.length; i++) {
            if (max < mass[i]){
                max = mass[i];
            }

        }
        for (int i = 0; i < mass.length; i++) {
            if (min > mass[i]){
                min = mass[i];
            }

        }
        System.out.println(max);
        System.out.println("\n");
        System.out.println(min);
        System.out.println("\n");
        for (int i = 0; i < mass.length; i++) {
            System.out.println(mass[i]);
        }
    }
}
