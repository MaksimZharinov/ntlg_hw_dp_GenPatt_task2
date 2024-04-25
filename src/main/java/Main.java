import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        logger.log("Запускаем программу");

        logger.log("Просим пользователя ввести" +
                " входные данные для списка");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер списка: ");
        int N = scanner.nextInt();
        System.out.print("Введите верхнюю границу для значений: ");
        int M = scanner.nextInt();

        logger.log("Создаём и наполняем список");
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(random.nextInt(M));
        }
        System.out.print("Вот случайный список: ");
        for (int element : list) {
            System.out.print(element + " ");
        }
        System.out.println();

        logger.log("Просим пользователя ввести" +
                " входные данные для фильтрации");
        System.out.print("Введите порог для фильтрации: ");
        int f = scanner.nextInt();

        logger.log("Запускаем фильтрацию");
        Filter filter = new Filter(f);
        List<Integer> newList = filter.filterOut(list);

        logger.log("Выводим результат на экран");
        System.out.print("Отфильтрованный список: ");
        for (int element : newList) {
            System.out.print(element + " ");
        }
        System.out.println();

        logger.log("Завершаем программу");
    }
}