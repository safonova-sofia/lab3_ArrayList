import java.util.ArrayList;

import java.util.Locale;
import java.util.Scanner;

public class lab3_3_ArrayList {
    public static void main(String[] args) {

        ArrayList<Double> list = new ArrayList<>(0);

        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Введите элемент в массив. Для выхода введите quit: ");
        while (!in.hasNext("quit")) {
            while (true) {
                if (in.hasNextDouble()) {
                    list.add(in.nextDouble());
                    System.out.print("Введите элемент в массив: ");
                    break;
                } else if (!in.hasNext("quit")) {
                    System.out.print("Вы ввели строку. Повторите ввод: ");
                    in.next();
                } else {
                    break;
                }
            }
        }

        System.out.println("Размерность массива: " + list.size());

        System.out.print("Исходный массив: ");
        for (double x : list)
            if (x % 1 == 0) {
                System.out.print((int) x + " ");
            } else {
                System.out.print(x + " ");
            }

        double element = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (element >= list.get(i)) {
                list.remove(i);
                i--;
            } else {
                element = list.get(i);
            }
        }

        System.out.print("Массив после обработки: ");
        for (double x : list)
            if (x % 1 == 0) {
                System.out.print((int) x + " ");
            } else {
                System.out.print(x + " ");
            }

        in.close();
    }
}