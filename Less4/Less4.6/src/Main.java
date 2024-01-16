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
        int c =1;
        for (int i = 0 ; i< mass.length -1 ; i++) {
            if (mass[i]< mass[i+1]) {
                c++;
            }
        }
        if (c == a ){
            System.out.print("Массив является возрастающей последовательностью" + "\n");
        }
        else {
            System.out.print("Массив не является возрастающей последовательностью" + "\n");
        }
        System.out.println("\n");
        for (int v : mass) {
            System.out.println(v);
        }
    }
}
