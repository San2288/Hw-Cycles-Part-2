public class Main {
    public static void main(String[] args) {
        // Задание 1 Домашние задание 1
        System.out.println("Задание 1 Домашние задание 1");
        {
            double savings = 15_000;
            double total = 0;
            int month = 1;
            while (total <= 2_459_000) {
                total += savings;
                {
                    System.out.println("Месяц " + month + ", сумма накоплений равна " + String.format("%.2f", total) + " рублей");
                    month++;
                }
            }
        }

        // Задание 2 Домашние задание 1
        System.out.println("Задание 2 Домашние задание 1");
        {
            int start = 1;
            while (start <= 10) {
                System.out.print(start + " ");
                start++;
            }
            {
                System.out.println(" ");
            }
            {
                for (int i = 10; i >= 1; i--) {
                    System.out.print(i + " ");
                }
                System.out.println(" ");
            }
        }

        // Задание 3 Домашние задание 1
        System.out.println("Задание 3 Домашние задание 1");
        {
            int populationCountry = 12_000_000;
            float birthRate = (float) 17 / 1000;
            float mortality = (float) 8 / 1000;
            for (int y = 1; y <= 10; y++) {
                populationCountry = populationCountry + Math.round(populationCountry * birthRate) - Math.round(populationCountry * mortality);
                System.out.println("Год " + y + ", численность населения составляет " + populationCountry);
            }
        }

        // Задание 1 Домашние задание 2
        System.out.println("Задание 1 Домашние задание 2");
        {
            double savings = 15_000;
            int month = 1;
            while (savings <= 12_000_000) {
                savings += +savings * 0.07;
                {
                    System.out.println("Месяц " + month + ", сумма накоплений равна " + String.format("%.2f", savings) + " рублей");
                    month++;
                }
            }
        }

        // Задание 2 Домашние задание 2
        System.out.println("Задание 2 Домашние задание 2");
        {
            double savings = 15_000;
            int month = 1;
            while (savings <= 12_000_000) {
                savings += +savings * 0.07;
                if (month % 6 == 0) {
                    System.out.println("Месяц " + month + ", сумма накоплений равна " + String.format("%.2f", savings) + " рублей");
                }
                month++;
            }
        }

        // Задание 3 Домашние задание 2
        System.out.println("Задание 3 Домашние задание 2");
        {
            double savings = 15_000;
            int month = 1;
            while (month <= 9 * 12) {
                savings += +savings * 0.07;
                if (month % 6 == 0) {
                    System.out.println("Месяц " + month + ", сумма накоплений равна " + String.format("%.2f", savings) + " рублей");
                }
                month++;
            }
        }

        // Задание 4 Домашние задание 2
        System.out.println("Задание 4 Домашние задание 2");
        {
            int lastDayInMonth = 31;
            int friday = 7;
            while (friday <= lastDayInMonth) {
                System.out.println("Сегодня пятница " + friday + "-е число. Необходимо подготовить отчёт.");
                friday += 7;
            }
        }

        // Задание 1 Домашние задание 3
        System.out.println("Задание 1 Домашние задание 3");
        {
            int currentYear = 2022;
            int startPeriod = currentYear - 200;
            int endPeriod = currentYear + 100;
            for (int i = startPeriod; i <= endPeriod; i++) {
                if (i % 79 == 0) {
                    System.out.println(i);
                }
            }
        }

        // Задание 2 Домашние задание 3
        System.out.println("Задание 2 Домашние задание 3");
        {
            for (int i = 1; i <= 10; i++) {
                System.out.println("2 * " + i + " = " + 2 * i);
            }
        }
    }
}
