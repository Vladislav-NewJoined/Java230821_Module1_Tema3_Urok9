public class Task1_3_9_4 {
    public static void main(String[] args) {
        System.out.println("""
                Задание:\s
                4. Создайте двумерный массив. Выведите его предпоследнюю строчку

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
        System.out.println("Предпоследняя строчка исходного массива:");
        int m = 35;
        for (int i = 5; i == 5; i++) {  //идём по строкам
            for (int j = 0; j < 7; j++) {  //идём по столбцам
                array[i][j] = m;
                System.out.print(array[i][j] + "  "); //вывод элемента
                m++;
            }
            System.out.println();  //перенос строки ради визуального сохранения табличной формы
        }

    }
}