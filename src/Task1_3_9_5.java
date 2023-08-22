public class Task1_3_9_5 {
    public static void main(String[] args) {
        System.out.println("""
                Задание:\s
                5. Создайте двумерный массив. Выведите его первый столбец

                Решение:\s""");

        int[][] array = new int[7][7];
        int n = 0;

        System.out.println("Исходный массив целиком:");
        for (int i = 0; i < 7; i++) {  //идём по строкам
            for (int j = 0; j < 7; j++) {  //идём по столбцам
                array[i][j] = n;
                if (n <10) {
                    System.out.print(array[i][j] + "   "); //вывод элемента
                } else {
                    System.out.print(array[i][j] + "  "); //вывод элемента
                }
                n++;
            }
            System.out.println();  //перенос строки ради визуального сохранения табличной формы
        }

        System.out.println();  //перенос строки
        System.out.println("Первый столбец исходного массива:");
        int m = 0;
        for (int i = 0; i < 7; i++) {  //идём по строкам
            for (int j = 0; j < 1; j++) {  //идём по столбцам
                array[i][j] = m;
                if (m <10) {
                    System.out.print(array[i][j] + "   "); //вывод элемента
                } else {
                    System.out.print(array[i][j] + "  "); //вывод элемента
                }
                m += 7;
            }
            System.out.println();  //перенос строки ради визуального сохранения табличной формы
        }

    }
}