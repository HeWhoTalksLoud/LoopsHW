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

    }
}