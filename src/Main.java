public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int depositAmount = 15_000;
        int accumulatedAmount = 0;
        int i = 0;
        while (accumulatedAmount < 2_459_000) {
            i++;
            accumulatedAmount = i * depositAmount;
            System.out.println("Месяц " + i + " сумма накоплений равна " + accumulatedAmount + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 0;
        while (i < 10) {
            i = i + 1;
            System.out.print(i + " ");
        }
        System.out.println("");
        for (int x = 10; x > 0; x--) {
            System.out.print(x + " ");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int population = 12_000_000;
        int birth = 17;
        int mortality = 8;
        int populationGrowthPerYear = (population / 1000) * (birth - mortality);
        for (int i = 1; i <= 10; i++) {
            population = population + i * populationGrowthPerYear;
            System.out.println("Год " + i + " численность населения составляет " + population);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int sum = 15_000;
        float percent = 1.07f;
        int accumulation = 0;
        int i = 0;
        while (accumulation < 12_000_000) {
            i++;
            accumulation = (int) (accumulation + sum * percent);
            System.out.println("Месяц " + i + " Накопленная сумма равна " + accumulation);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int sum = 15_000;
        float percent = 1.07f;
        int accumulation = 0;
        int i = 0;
        while (accumulation < 12_000_000) {
            i++;
            accumulation = (int) (accumulation + sum * percent);
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " накопленная сумма равна " + accumulation);
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int sum = 15_000;
        float percent = 1.07f;
        int accumulation = 0;
        for (int i = 1; i <= 108; i++) {
            accumulation = (int) (accumulation + sum * percent);
            if (i % 6 == 0) {
                System.out.println(i + "-й месяц, накопленная сумма " + accumulation + " рублей");
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        System.out.println("Календарь напоминаний на март 2023 года");
        int date = 2;
        do {
            System.out.println("Сегодня пятница, " + date + " - число, нужно подготовить отчет");
            date += 7;
        } while (date <= 31);
    }
    public static void task8 () {
        System.out.println("Задача 8");
        int beforeYear200 = 2023 - 200;
        int afterYear100 = 2023 + 100;
        for (int year = 0; year <= afterYear100; year = year + 79){
            if(year >= beforeYear200){
                System.out.println(year);
            }
        }
    }
}