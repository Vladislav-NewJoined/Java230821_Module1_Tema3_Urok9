public class Task1_3_9_7 {
    public static void main(String[] args) {
        System.out.println("""
                Задание:\s
                7. Создайте матрицу int[][], заполните ее календарем на текущий месяц:

                Решение:\s""");

        System.out.println("Календарь на Август 2023 г: \n");
        int lines = 5;
        int columns = 7;

        String[][] heading = new String[1][7];
        heading[0][0] = "пн ";
        heading[0][1] = "вт ";
        heading[0][2] = "ср ";
        heading[0][3] = "чт ";
        heading[0][4] = "пт ";
        heading[0][5] = "сб ";
        heading[0][6] = "вс ";

        for (int j = 0; j < 7; j++) {
            System.out.print(heading[0][j]);
        }
        System.out.println();  //перенос строки

        String[][] calendar = new String[lines][columns];

        //заполнение первой строки
        calendar[0][0] = "   ";
        calendar[0][1] = "1  ";
        calendar[0][2] = "2  ";
        calendar[0][3] = "3  ";
        calendar[0][4] = "4  ";
        calendar[0][5] = "5  ";
        calendar[0][6] = "6  ";

        int count;
        for (count = 7; count < 32; count++) {
            for (int i = 1; i < lines; i++) {  //идём по строкам
                for (int j = 0; j < columns; j++) {  //идём по столбцам
                    if (count >= 10) {
                        calendar[i][j] = String.valueOf(count) + " ";
                    } else {
                        calendar[i][j] = String.valueOf(count) + "  ";
                    }

                    if (count == 31) {
                        break;
                    }
                    count++;
                }
            }
        }

        for (count = 0; count < 32; count++) {
            for (int i = 0; i < lines; i++) {  //идём по строкам
                for (int j = 0; j < columns; j++) {  //идём по столбцам
                    System.out.print(calendar[i][j]); //вывод элемента

                    if (count == 31) {
                        System.out.println();  //перенос строки
                        System.exit(0);
                    }
                    count++;
                }
                System.out.println();  //  перенос строки ради визуального сохранения табличной формы
            }
        }
    }
}
