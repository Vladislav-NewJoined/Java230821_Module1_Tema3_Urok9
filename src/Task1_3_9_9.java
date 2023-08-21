public class Task1_3_9_9 {
    public static void main(String[] args) {
        System.out.println("""
                Задание:\s
                9. Предыдущее задание, но с русским алфавитом.

                Решение:\s""");

//  Номера символов кириллицы в Unicode (или ASCII): 1072 - 1103 включительно, заглавных: 1040 - 1071 включительно
        int lines = 7;
        int columns =5;

        char[][] LatinAlp = new char[lines][columns];

        char ch = 'а';
        for (int n = 1072; n < 1107; n++) {
            for (int i = 0; i < lines; i++) {  //идём по строкам
                for (int j = 0; j < columns; j++) {  //идём по столбцам
                    LatinAlp[i][j] = ch;
                    System.out.print(" " + LatinAlp[i][j] + " "); //вывод элемента
                    ch++;

                    if (ch == 1104) {
                        System.exit(0);
                    }
                    n++;
                }
                System.out.println();  //  перенос строки ради визуального сохранения табличной формы
            }
        }
    }
}
