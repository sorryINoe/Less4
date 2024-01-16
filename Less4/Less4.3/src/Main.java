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
        int imax=0,imin=0;
        for (int i = 0; i < mass.length; i++) {
            if (max < mass[i]){
                max = mass[i];
                imax = i;
            }
        }
        for (int i = 0; i < mass.length; i++) {
            if (min > mass[i]){
                min = mass[i];
                imin = i;
            }
        }
        System.out.println(max);
        System.out.println("\n");
        System.out.println(min);
        System.out.println("\n");
        System.out.println(imax);
        System.out.println("\n");
        System.out.println(imin);
        System.out.println("\n");
        for (double v : mass) {
            System.out.println(v);
        }
    }
}
