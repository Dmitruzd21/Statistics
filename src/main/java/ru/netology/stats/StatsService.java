package ru.netology.stats;

public class StatsService {
    //1. Сумму всех продаж
    public long calculateSumOfAllSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            long newSum = sum + sale;
            sum = newSum;
            //sum += sale
        }
        return sum;
    }

    //2. Среднюю сумму продаж в месяц
    public long calculateAverageSalePerMonth(long[] sales) {
        return calculateSumOfAllSales(sales) / sales.length;

    }

    //3. Номер месяца,в котором был пик продаж(осуществлены продажи на максимальную сумму)*
    public long calculateNumerOfMonthWithMaxSale(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
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
    public long calculatenumerOfMonthWithMinSale(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
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
    public long calculateNumberOfMonthesWithUnderAverageSale(long[] sales) {
        long averageSalePerMonth = calculateAverageSalePerMonth(sales);
        long monthCount = 0;
        for (long sale : sales) {
            int x;
            if (sale < averageSalePerMonth) {
                x = 1;
            } else {
                x = 0;
            }

            long newNumberOfMonthesWithUnderAverageSale = monthCount + x;
            monthCount = newNumberOfMonthesWithUnderAverageSale;
        }

        return monthCount;
    }

    /// for (long sale : sales) {
    //            if (sale < averageSalePerMonth) {
    //              monthCount++;
    //            }
    //        }
    //
    //        return monthCount;
    //    }

    //6. Кол-во месяцев,в которых продажи были выше среднего(см.п.2)
    public long calculateNumberOfMonthesWithOverAverageSale(long[] sales) {
        long averageSalePerMonth1 = calculateAverageSalePerMonth(sales);
        long monthCount = 0;
        for (long sale : sales) {
            int x;
            if (sale > averageSalePerMonth1) {
                x = 1;
            } else {
                x = 0;
            }

            long newNumberOfMonthesWithUnderAverageSale = monthCount + x;
            monthCount = newNumberOfMonthesWithUnderAverageSale;
        }

        return monthCount;

    }
    /// for (long sale : sales) {
    //            if (sale > averageSalePerMonth) {
    //              monthCount++;
    //            }
    //        }
    //
    //        return monthCount;
    //    }

}

