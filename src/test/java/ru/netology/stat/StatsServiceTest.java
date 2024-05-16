package ru.netology.stat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatsServiceTest {

    @Test
    public void shouldFindMinMonth() {
        StatsService service = new StatsService();

        long[] sales = {10, 15, 14, 9, 5, 19, 18, 12, 16, 11, 19, 20};

        int expectedMonth = 5;
        int actualMonth = service.minSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindAmount() {
        StatsService service = new StatsService();

        long[] sales = {10, 15, 14, 9, 5, 19, 18, 12, 16, 11, 19, 20};

        long expectedAmount = 168;
        long actualAmount = service.amountSales(sales);

        Assertions.assertEquals(expectedAmount, actualAmount);
    }

    @Test
    public void shouldAverageAmount() {
        StatsService service = new StatsService();

        long[] sales = {10, 15, 14, 9, 5, 19, 18, 12, 16, 11, 19, 20};

        long expectedAverage = 14;
        long actualAverage = service.averageAmountSales(sales);

        Assertions.assertEquals(expectedAverage, actualAverage);
    }
    @Test
    public void shouldFindMaxMonth() {
        StatsService service = new StatsService();

        long[] sales = {10, 15, 14, 9, 5, 19, 18, 12, 16, 11, 19, 20};

        int expectedMonth = 12;
        int actualMonth = service.maxSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }


    @Test
    public void shouldFindAverageMinMonth() {
        StatsService service = new StatsService();

        long[] sales = {10, 15, 14, 9, 5, 19, 18, 12, 16, 11, 19, 20};

        int expectedMinAverage = 6;
        int actualMinAverage = service.minAverage(sales);

        Assertions.assertEquals(expectedMinAverage, actualMinAverage);
    }

    @Test
    public void shouldFindAverageMaxMonth() {
        StatsService service = new StatsService();

        long[] sales = {10, 15, 14, 9, 5, 19, 18, 12, 16, 11, 19, 20};

        int expectedMaxAverage = 7;
        int actualMaxAverage = service.maxAverage(sales);

        Assertions.assertEquals(expectedMaxAverage, actualMaxAverage);
    }


}
