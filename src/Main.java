public class Main {
    public static void main(String[] args) {

        int i;

        // Задача 1
        for (i = 1; i <= 10; i++)
            System.out.print(i + " ");
        System.out.println();

        // Задача 2
        for (i = 10; i >= 1; i--)
            System.out.print(i + " ");
        System.out.println();

        // Задача 3
        for (i = 0; i < 17; i+=2)
            System.out.print(i + " ");
        System.out.println();

        // Задача 4
        for (i = 10; i >= -10; i--)
            System.out.print(i + " ");
        System.out.println();

        // Задача 5
        for (i = 1904; i <= 2096; i+=4)
            if (i %100 != 0 || i % 400 == 0)
                System.out.println(i + " год является високосным");
        System.out.println();

        // Задача 6
        for (i = 7; i <= 98; i+=7)
            System.out.print(i + " ");
        System.out.println();

        // Задача 7
        for (i = 1; i <= 512; i*=2)
            System.out.print(i + " ");
        System.out.println();

        // Задача 8
        int money = 0;
        for (i = 1; i <= 12; i++) {
            money += 29000;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + money + " рублей");
        }
        System.out.println();

        // Задача 9
        int deposit = 29000;
        money = 0;
        int percent = deposit / 100;
        for (i = 1; i <= 12; i++) {
            money += 29000 + percent;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + money + " рублей");
        }
        System.out.println();

        // Задача 10
        int j = 0;
        int k = 1;
        int tmp;
        for (i = 1; i <= 11; i++) {
            if (i <= 2)
                tmp = 1;
            else
                tmp = j + k;
            System.out.print(tmp + " ");
            j = k; k = tmp;
        }
        System.out.println();
        System.out.println();

        // Цикл while
        // Задача 1
        deposit = 0;
        money = 15000;
        percent = money / 100;
        i = 1;

        while (deposit < 2459000) {
            deposit += (money + percent);

            System.out.println("Месяц " + i + ", сумма накоплений равна " + deposit + " рублей");
            i++;
        }
        System.out.println();

        // Задача 2
        i = 1;

        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (i = 10; i > 0; i--)
            System.out.print(i + " ");
        System.out.println();
        System.out.println();

        // Задача 3
        int population = 12_000_000;
        int birthRate = 17; // на тысячу чел.
        int deathRate = 8; // на тысячу чел.
        int deadByYear, bornByYear; // кол-во умерших и родившихся в год

        i = 1;
        while (i <= 10) {
            deadByYear = population / 1000 * deathRate;
            bornByYear = population / 1000 * birthRate;
            population += bornByYear;
            population -= deadByYear;
            System.out.println("Год " + i + ", численность населения составляет " + population);
            i++;

        }
        System.out.println();

        // Задача 4
        deposit = 15000;
        i = 1;
        while (deposit < 12_000_000) {
            deposit += deposit * 7 / 100;
            // Надо ли выводить в консоль данные по каждому месяцу, как прописано в условии задачи?
            // Ведь их там 99.
            System.out.println("Месяц "+ i + ", сумма на счету: " + deposit);
            i++;
        }
        // декремент i - т.к. инкремент в цикле происходит в любом случае,
        // даже если нужная сумма уже достигнута
        System.out.println("Количество месяцев: " + (i - 1));
        System.out.println();

        // Задача 5
        deposit = 15000;
        i = 1;
        while (deposit < 12_000_000) {
            deposit += deposit * 7 / 100;
            if (i % 6 == 0)
                System.out.println("Месяц "+ i + ", сумма на счету: " + deposit);
            i++;
        }
        // декремент i - т.к. инкремент в цикле происходит в любом случае,
        // даже если нужная сумма уже достигнута
        System.out.println("Количество месяцев: " + (i - 1));
        System.out.println();

        //  Задача 6
        deposit = 15000;
        i = 1;
        // 9 лет по 12 месяцев
        while (i <= 12 * 9) {
            deposit += deposit * 7 / 100;
            if (i % 6 == 0)
                System.out.println("Месяц "+ i + ", сумма на счету: " + deposit);
            i++;
        }
        System.out.println();

        // Задача 7
        int fridayDate = 3;

        while (fridayDate <= 31) {
            System.out.println("Сегодня пятница, " + fridayDate + "-е число. Необходимо подготовить отчет.");
            fridayDate += 7;
        }
        System.out.println();

        // Задача 8
        int cycleLength = 79;
        int currentYear = 2022;
        int firstYear = currentYear - 200;
        int lastYear = currentYear + 100;
        int year = firstYear;

        while (year <= lastYear) {
            if (year % cycleLength == 0) {
                System.out.println(year);
                year += cycleLength;
            }
            else year++;
        }
        System.out.println();
    }
}