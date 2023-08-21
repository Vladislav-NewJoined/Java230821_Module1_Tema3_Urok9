public class Task1_3_9_8 {
    public static void main(String[] args) {
        System.out.println("""
            Задание:\s
            8. Создайте матрицу char[][], проинициализируйте ее латинским алфавитом,
               выведите его. Подсказка - можно получить первую букву как char ch = ‘a’,
               следующую - как ch + 1, и так далее.

            Решение:\s""");

//  Номера символов латиницы 97 - 122 включительно
        int lines = 5;
        int columns =5;

        char[][] LatinAlp = new char[lines][columns];

        char ch = 'a';
        for (int n = 97; n < 123; n++) {
            for (int i = 0; i < lines; i++) {  //идём по строкам
                for (int j = 0; j < columns; j++) {  //идём по столбцам
                    LatinAlp[i][j] = ch;
                    System.out.print(" " + LatinAlp[i][j] + " "); //вывод элемента
                    ch++;
                    n++;
                }
                System.out.println();  //  перенос строки ради визуального сохранения табличной формы
            }
        }
    }
}
