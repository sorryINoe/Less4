import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива" + "\n");
        int a = scanner.nextInt();
        int [] mass = new int [a];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = scanner.nextInt();
        }
        for (int v : mass) {
            System.out.println("Первоначальный массив"+v);
        }
        int [] massiv = new int [a];
        for (int i = mass.length - 1 ; i>-1 ; i--) {
            massiv [i] = mass[mass.length - 1 - i];
        }
        System.out.println("\n");
        for (int v : massiv) {
            System.out.println(v);
        }
    }
}
