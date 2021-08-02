import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int sumOfAllSales = (int) service.calculateSumOfAllSales(sales);
        System.out.println("sumOfAllSale:"+sumOfAllSales);

        int averageSalePerMonth = (int) service.calculateAverageSalePerMonth (sales);
        System.out.println("averageSalePerMonth:"+averageSalePerMonth);

        int numerOfMonthWithMaxSale = (int) service.calculateNumerOfMonthWithMaxSale (sales);
        System.out.println("numerOfMonthWithMaxSale:"+numerOfMonthWithMaxSale);

        int numerOfMonthWithMinSale = (int) service.calculatenumerOfMonthWithMinSale (sales);
        System.out.println("numerOfMonthWithMinSale:"+numerOfMonthWithMinSale);

        int numberOfMonthesWithUnderAverageSale = (int) service.calculateNumberOfMonthesWithUnderAverageSale (sales);
        System.out.println("numberOfMonthesWithUnderAverageSale:"+numberOfMonthesWithUnderAverageSale);

        int numberOfMonthesWithOverAverageSale = (int) service.calculateNumberOfMonthesWithOverAverageSale (sales);
        System.out.println("numberOfMonthesWithOverAverageSale:"+numberOfMonthesWithOverAverageSale);
    }


}
