import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long sumOfAllSales = service.calculateSumOfAllSales(sales);
        System.out.println("sumOfAllSale:" + sumOfAllSales);

        long averageSalePerMonth = service.calculateAverageSalePerMonth(sales);
        System.out.println("averageSalePerMonth:" + averageSalePerMonth);

        long numerOfMonthWithMaxSale = service.calculateNumerOfMonthWithMaxSale(sales);
        System.out.println("numerOfMonthWithMaxSale:" + numerOfMonthWithMaxSale);

        long numerOfMonthWithMinSale = service.calculatenumerOfMonthWithMinSale(sales);
        System.out.println("numerOfMonthWithMinSale:" + numerOfMonthWithMinSale);

        long numberOfMonthesWithUnderAverageSale = service.calculateNumberOfMonthesWithUnderAverageSale(sales);
        System.out.println("numberOfMonthesWithUnderAverageSale:" + numberOfMonthesWithUnderAverageSale);

        long numberOfMonthesWithOverAverageSale = service.calculateNumberOfMonthesWithOverAverageSale(sales);
        System.out.println("numberOfMonthesWithOverAverageSale:" + numberOfMonthesWithOverAverageSale);
    }


}
