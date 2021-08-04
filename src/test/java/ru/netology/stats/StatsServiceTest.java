package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldcalculateSumOfAllSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.calculateSumOfAllSales(sales);
        long expected = 180;
        assertEquals(expected, actual,"Тest calculateSumOfAllSales - failed");
    }

    @Test
    void shouldcalculateAverageSalePerMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.calculateAverageSalePerMonth(sales);
        long expected = 15;
        assertEquals(expected, actual,"Тest calculateAverageSalePerMonth - failed");
    }

    @Test
    void shouldcalculateNumerOfMonthWithMaxSale() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.calculateNumerOfMonthWithMaxSale(sales);
        long expected = 8;
        assertEquals(expected, actual,"Тest calculateNumerOfMonthWithMaxSale - failed");
    }

    @Test
    void shouldcalculatenumerOfMonthWithMinSale() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.calculatenumerOfMonthWithMinSale(sales);
        long expected = 9;
        assertEquals(expected, actual,"Тest calculatenumerOfMonthWithMinSale - failed");
    }

    @Test
    void shouldcalculateNumberOfMonthesWithUnderAverageSale() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.calculateNumberOfMonthesWithUnderAverageSale(sales);
        long expected = 5;
        assertEquals(expected, actual,"Тest calculateNumberOfMonthesWithUnderAverageSale - failed");
    }

    @Test
    void shouldcalculateNumberOfMonthesWithOverAverageSale() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.calculateNumberOfMonthesWithOverAverageSale(sales);
        long expected = 5;
        assertEquals(expected, actual,"Тest calculateNumberOfMonthesWithOverAverageSale - failed");
    }
}