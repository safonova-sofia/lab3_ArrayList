import java.util.ArrayList;

import java.util.Scanner;

public class lab3_2_ArrayList {
    public static void main(String[] args) {
        int x = 0;
        ArrayList<Integer> list = new ArrayList<>(0);

        Scanner in = new Scanner(System.in);
        System.out.print("Введите элемент в массив. Для выхода введите quit: ");
        while (!in.hasNext("quit")) {
            while (true) {
                if (in.hasNextInt()) {
                    list.add(in.nextInt());
                    System.out.print("Введите элемент в массив: ");
                    break;
                } else if (!in.hasNext("quit")) {
                    System.out.print("Вы ввели нецелое число или строку. Повторите ввод: ");
                    in.next();
                } else {
                    break;
                }
            }
        }

        System.out.println("Размерность массива: " + list.size());

        System.out.print("Число к удалению: ");
        in.next();
        if (in.hasNextInt()) {
            x = Integer.parseInt(in.next());
        } else {
            System.out.println("Ошибка, массив и число к удалению должны быть целыми");
            System.exit(0);
        }

        System.out.print("Массив: ");
        for (int i : list) {
            System.out.print(i + " ");
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == x) {
                list.remove(i);
                i--;
            }
        }

        System.out.print("\nМассив после обработки: ");
        for (int i : list) {
            System.out.print(i + " ");
        }

        in.close();
    }
}