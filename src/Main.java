public class Main {
    public static void main(String[] args) {


        // Задача 1
        System.out.println("Задача 1");
        {
            int deposit = 15000;
            int percent = 1; // Процент по вкладу за месяц

            int i = 0;
            float total = (float) deposit; // положили начальный вклад

            while (total < 2_459_000) {
                i++;
                total += total * percent / 100;
                total += deposit;
                System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
            }
        }
        System.out.println("-----");


        // Задача 2
        System.out.println("Задача 2");
        {
            int i = 1;

            while (i <= 10) {
                System.out.print(i + " ");
                i++;
            }

            System.out.println();

            for (i = 10; i >= 1; i--) {
                System.out.print(i + " ");
            }

            System.out.println();
        }
        System.out.println("-----");

        // Задача 3
        System.out.println("Задача 3");
        {
            int total = 12_000;
            int bornProp = 17; // Рождамеость, на 1000 человек в год
            int deathProp = 8; // Смертность, на 1000 человек в год
            int totalProp = bornProp - deathProp; // Процент прироста населения, на 1000 человек в год

            for (int i = 1; i <=10; i++) {
                total += total * totalProp / 1000;
                System.out.println("Год " + i + ", численность населения составляет " + total);
            }
        }
        System.out.println("-----");

        // Задача 4
        System.out.println("Задача 4");
        {
            int total = 15_000;
            int i = 0;

            while (total < 12_000_000) {
                i++;
                total += total * 7 / 1000;
                System.out.println("Месяц " + i + ", сумма " + total);
            }
        }
        System.out.println("-----");

        // Задача 5
        System.out.println("Задача 5");
        {
            int total = 15_000;
            int i = 1;

            while (total < 12_000_000) {
                total += total * 7 / 1000;

                if (i % 6 == 0) {
                    System.out.println("Месяц " + i + ", сумма " + total);
                }
                i++;
            }
        }
        System.out.println("-----");

        // Задача 6
        System.out.println("Задача 6");
        {
            int total = 15_000;
            int i;

            for (i = 1; i <= 9 * 12; i++) {
                total += total * 7 / 1000;

                if (i % 6 == 0) {
                    System.out.println("Месяц " + i + ", сумма " + total);
                }
            }
        }
        System.out.println("-----");

        // Задача 7
        System.out.println("Задача 7");
        {
            int nextFriday = 4; // первоначально - дата первой пятницы месяца

            for (int i = 1; i <= 31; i++) {
                if (i == nextFriday) {
                    System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
                    nextFriday += 7;
                }
            }
        }
        System.out.println("-----");

        // Задача 8
        System.out.println("Задача 8");
        {
            int currYear = 2024;

            for (int year = currYear - 200; year <= currYear + 100; year++) {
                if (year % 79 == 0) {
                    System.out.println(year);
                }
            }
        }
        System.out.println("-----");
    }
}