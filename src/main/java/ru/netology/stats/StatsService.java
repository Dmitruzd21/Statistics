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
        int y = 0;
        int x1;
        int x2;
        int x3;
        int x4;
        int x5;
        int x6;
        int x7;
        int x8;
        int x9;
        int x10;
        int x11;
        int x12;
        if (sales[0] < averageSalePerMonth) {
            x = 1;
        } else {
            x = 0;
        }
        y=x
        if (sales[1] < averageSalePerMonth) {
            x2 = 1;
        } else {
            x2 = 0;
        }
        if (sales[2] < averageSalePerMonth) {
            x3 = 1;
        } else {
            x3 = 0;
        }
        if (sales[3] < averageSalePerMonth) {
            x4 = 1;
        } else {
            x4 = 0;
        }
        if (sales[4] < averageSalePerMonth) {
            x5 = 1;
        } else {
            x5 = 0;
        }
        if (sales[5] < averageSalePerMonth) {
            x6 = 1;
        } else {
            x6 = 0;
        }
        if (sales[6] < averageSalePerMonth) {
            x7 = 1;
        } else {
            x7 = 0;
        }
        if (sales[7] < averageSalePerMonth) {
            x8 = 1;
        } else {
            x8 = 0;
        }
        if (sales[8] < averageSalePerMonth) {
            x9 = 1;
        } else {
            x9 = 0;
        }
        if (sales[9] < averageSalePerMonth) {
            x10 = 1;
        } else {
            x10 = 0;
        }
        if (sales[10] < averageSalePerMonth) {
            x11 = 1;
        } else {
            x11 = 0;
        }
        if (sales[11] < averageSalePerMonth) {
            x12 = 1;
        } else {
            x12 = 0;
        }
        int numberOfMonthesWithUnderAverageSale = x1 + x2 + x3 + x4 + x5 + x6 + x7 + x8 + x9 + x10 + x11 + x12;
        return numberOfMonthesWithUnderAverageSale;
    }

    //6. Кол-во месяцев,в которых продажи были выше среднего(см.п.2)
    public int calculateNumberOfMonthesWithOverAverageSale(int[] sales) {
            int averageSalePerMonth1 = calculateSumOfAllSales(sales) / 12;
            int y1;
            int y2;
            int y3;
            int y4;
            int y5;
            int y6;
            int y7;
            int y8;
            int y9;
            int y10;
            int y11;
            int y12;
            if (sales[0] > averageSalePerMonth1) {
                y1 = 1;
            } else {
                y1 = 0;
            }
            if (sales[1] > averageSalePerMonth1) {
                y2 = 1;
            } else {
                y2 = 0;
            }
            if (sales[2] > averageSalePerMonth1) {
                y3 = 1;
            } else {
                y3 = 0;
            }
            if (sales[3] > averageSalePerMonth1) {
                y4 = 1;
            } else {
                y4 = 0;
            }
            if (sales[4] > averageSalePerMonth1) {
                y5 = 1;
            } else {
                y5 = 0;
            }
            if (sales[5] > averageSalePerMonth1) {
                y6 = 1;
            } else {
                y6 = 0;
            }
            if (sales[6] > averageSalePerMonth1) {
                y7 = 1;
            } else {
                y7 = 0;
            }
            if (sales[7] > averageSalePerMonth1) {
                y8 = 1;
            } else {
                y8 = 0;
            }
            if (sales[8] > averageSalePerMonth1) {
                y9 = 1;
            } else {
                y9 = 0;
            }
            if (sales[9] > averageSalePerMonth1) {
                y10 = 1;
            } else {
                y10 = 0;
            }
            if (sales[10] > averageSalePerMonth1) {
                y11 = 1;
            } else {
                y11 = 0;
            }
            if (sales[11] > averageSalePerMonth1) {
                y12 = 1;
            } else {
                y12 = 0;
            }
            int numberOfMonthesWithOverAverageSale = y1 + y2 + y3 + y4 + y5 + y6 + y7 + y8 + y9 + y10 + y11 + y12;
            return numberOfMonthesWithOverAverageSale;
        }

    }
