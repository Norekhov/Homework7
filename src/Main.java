public class Main {
    public static void main(String[] args) {
        System.out.println("Задача № 1");
        int money = 15000;
        int total = 0;
        int month = 0;
        while (total <= 2_459_000) {
            month++;
            total = total + total / 100;
            total = total + money;
            System.out.println("Месяц " + month + " сумма накоплений равна " + total + " рублей");
        }

        {
            System.out.println("Задача № 2");
            int a = 1;
            while (a <= 10) {
                System.out.print(a + " ");
                a++;
            }
            System.out.println(" ");
            for (int b = 10; b >= 1; b--) {
                System.out.print(b + " ");
            }
        }
        {
            System.out.println("Задача № 3");
            int totalPeople = 12_000_000;
            int newPeople = 17 * 12_000;
            int deadPeople = 8 * 12_000;
            int year = 0;
            while (year <= 10) {
                totalPeople = totalPeople + newPeople - deadPeople;
                year++;
                System.out.println("Год " + year + ", численность населения составляет " + totalPeople);
            }
        }
        {
            System.out.println("Задача № 4");
            int money1 = 15_000;
            int allMoney = 0;
            int month1 = 0;
            while (allMoney <= 12_000_000) {
                month1++;
                allMoney = allMoney + allMoney / 100 * 7;
                allMoney = allMoney + money1;
                System.out.println("На " + month1 + " месяц, накоплений будет " + allMoney + " рублей.");
            }
        }
        {
            System.out.println("Задача № 5");
            int money1 = 15_000;
            int allMoney = 0;
            int month1 = 0;
            while (allMoney <= 12_000_000) {
                month1++;
                allMoney = allMoney + allMoney / 100 * 7;
                allMoney = allMoney + money1;
                if (month1 % 6 == 0) {
                    System.out.println("На " + month1 + " месяц, накоплений будет " + allMoney + " рублей.");
                }
            }
        }
        {
            System.out.println("Задача № 6");
            int money1 = 15_000;
            int allMoney = 0;
            int month1 = 0;
            while (month1 <= 9 * 12) {
                month1++;
                allMoney = allMoney + allMoney / 100 * 7;
                allMoney = allMoney + money1;
                if (month1 % 6 == 0) {
                    System.out.println("На " + month1 + " месяц, накоплений будет " + allMoney + " рублей.");
                }
            }
        }
        {
            System.out.println("Задача № 7");
            for (int friday = 5; friday < 31; friday = friday + 7) {
                System.out.println("Сегодня пятница " + friday + "-e число. Необходимо подготовить отчет.");
            }
        }
        {
            System.out.println("Задача № 8");
            int thisYear = 2024;
            for (int g = 0; g < thisYear + 100; g = g + 79) {
                if (g > thisYear - 200) {
                    System.out.println(g);
                }
            }
        }
    }
}