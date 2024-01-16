import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива" + "\n");
        int a = scanner.nextInt();
        int [] mass = new int [a];
        int n = 0;
        for (int i = 0; i < mass.length; i++) {
            mass[i] = scanner.nextInt();
        }
        for (int i = 0; i < mass.length; i++) {
            if(mass[i]==0){
                n++;
            }
        }
        if (n==0){
            System.out.println("Нулевых элементов нет");
        }
        else {
            System.out.println("Количество нулей " + n);
        }
        System.out.println("\n");
        for (int v : mass) {
            System.out.println(v);
        }
    }
}
