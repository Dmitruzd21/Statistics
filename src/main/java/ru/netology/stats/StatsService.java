package ru.netology.stats;

public class StatsService {
    //1. Сумму всех продаж
    public int calculateSumOfAllSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            int newSum = sum + sale;
            sum = newSum;
        }
        return sum;
    }

    //2. Среднюю сумму продаж в месяц
    public int calculateAverageSalePerMonth(int[] sales) {
        return calculateSumOfAllSales(sales) / 12;

    }

    //3. Номер месяца,в котором был пик продаж(осуществлены продажи на максимальную сумму)*
    public int calculateNumerOfMonthWithMaxSale(int[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    //4. Номер месяца,в котором был минимум продаж(осуществлены продажи на минимальную сумму)*
    public int calculatenumerOfMonthWithMinSale(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }


    //5. Кол-во месяцев,в которых продажи были ниже среднего(см.п.2)
    public int calculateNumberOfMonthesWithUnderAverageSale(int[] sales) {
        int averageSalePerMonth = calculateSumOfAllSales(sales) / 12;
        int numberOfMonthes = 0;
        for (int sale : sales) {
            int x;
            if (sale < averageSalePerMonth) {
                x = 1;
            } else {
                x = 0;
            }

            int newNumberOfMonthesWithUnderAverageSale = numberOfMonthes + x;
            numberOfMonthes = newNumberOfMonthesWithUnderAverageSale;
        }

        return numberOfMonthes;
    }

    //6. Кол-во месяцев,в которых продажи были выше среднего(см.п.2)
    public int calculateNumberOfMonthesWithOverAverageSale(int[] sales) {
        int averageSalePerMonth1 = calculateSumOfAllSales(sales) / 12;
        int numberOfMonthes = 0;
        for (int sale : sales) {
            int x;
            if (sale > averageSalePerMonth1) {
                x = 1;
            } else {
                x = 0;
            }

            int newNumberOfMonthesWithUnderAverageSale = numberOfMonthes + x;
            numberOfMonthes = newNumberOfMonthesWithUnderAverageSale;
        }

        return numberOfMonthes;

    }

}
