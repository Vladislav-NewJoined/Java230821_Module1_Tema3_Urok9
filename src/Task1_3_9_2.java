public class Task1_3_9_2 {
    public static void main(String[] args) {
        System.out.println("""
                Задание:\s
                2. Выведите таблицу умножения 1-20

                Решение:\s""");

        int size = 20;

        for (int i = 1; i < 10; i++) {
            System.out.print(i + "   ");
        }
        for (int i = 10; i < 20; i++) {
            System.out.print(i + "  ");
        }
        System.out.println();   //  перенос строки

        for (int row = 2; row < size; row++) {
            for (int col = 1; col < size; col++) {
                int mult = row * col;
                if (mult >= 100) {
                    System.out.print(row * col + " ");
                } else if (mult >= 10) {
                    System.out.print(row * col + "  ");
                } else {
                    System.out.print(row * col + "   ");
                }
            }
            System.out.println();
        }
    }
}
