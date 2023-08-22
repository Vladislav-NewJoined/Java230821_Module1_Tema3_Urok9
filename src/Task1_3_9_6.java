public class Task1_3_9_6 {
    public static void main(String[] args) {
        System.out.println("""
                Задание:\s
                6. Создайте матрицу(двумерный массив) int[][], заполните ее таблицей умножения
                   1-9. Выведите ее.

                Решение:\s""");

        int size = 10;

        for (int i = 1; i <= 9; i++) {
            System.out.print(i + "  ");
        }
        System.out.println();   //  перенос строки

        for (int row = 2; row < size; row++) {
            for (int col = 1; col < size; col++) {
                int mult = row * col;
                if (mult >= 10) {
                    System.out.print(row * col + " ");
                } else {
                    System.out.print(row * col + "  ");
                }
            }
            System.out.println();
        }

    }
}