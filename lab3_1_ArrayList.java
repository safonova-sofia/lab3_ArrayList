import java.util.*;

public class lab3_1_ArrayList {
    public static void main(String[] args) {
        int count = 0;
        double sum = 0;

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

        ArrayList<Double> tmpList = new ArrayList<>(list.size());
        for (Double aDouble : list) {
            count++;
            sum += aDouble;
            tmpList.add(sum / count);
        }

        System.out.println();
        System.out.print("Массив после обработки: ");

        list = (ArrayList<Double>) tmpList.clone();
        tmpList.clear();

        for (double x : list)
            if (x % 1 == 0) {
                System.out.print((int) x + " ");
            } else {
                System.out.print(x + " ");
            }

        in.close();
    }
}