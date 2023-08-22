public class Task1_3_9_3 {
    public static void main(String[] args) {
        System.out.println("""
                Задание:\s
                3. Создайте двумерный массив, задайте для него значения, выведите его элементы

                Решение:\s""");

        System.out.println("Создаём двумерный массив 7х7 элементов, имя массива testArray:");
        for (int row = 0; row < 7; row++) {
            for (int col = 0; col < 7; col++) {
                System.out.print("[ ]" + " ");
            }
            System.out.println();
        }
        System.out.println();  //перенос строки

        int[][] testArray = new int[7][7];
        int n = 0;

        System.out.println("Заполняем массив элементами:");
        for (int i = 0; i < 7; i++) {  //идём по строкам
            for (int j = 0; j < 7; j++) {  //идём по столбцам
                testArray[i][j] = n;
                if (n <10) {
                    System.out.print(testArray[i][j] + "   "); //вывод элемента
                } else {
                    System.out.print(testArray[i][j] + "  "); //вывод элемента
                }
                n+=2;
            }
            System.out.println();  //перенос строки ради визуального сохранения табличной формы
        }
    }
}