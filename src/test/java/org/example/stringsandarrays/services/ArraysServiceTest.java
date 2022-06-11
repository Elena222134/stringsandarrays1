package org.example.stringsandarrays.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArraysServiceTest {
    @Test
    public void amountSale() {
        ArraysService service = new ArraysService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 180;
        int actualSum = service.sumSale(sale);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void averageAmountSale() {
        ArraysService service = new ArraysService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 15;
        int actualSum = service.averageSumSale(sale);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void minSale() {
        ArraysService service = new ArraysService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMin = 9;
        long actualMin = service.getMinSale(sales);
        Assertions.assertEquals(expectedMin, actualMin);
    }

    @Test
    public void maxSale() {
        ArraysService service = new ArraysService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMax = 8;
        int actualMax = service.getMaxSale(sales);
        Assertions.assertEquals(expectedMax, actualMax);
    }

    @Test
    public void numberMonthLessAverageSale() {
        ArraysService service = new ArraysService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 5;
        int actualSum = service.numberMonthLessAverageSale(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void numberMonthMoreAverageSale() {
        ArraysService service = new ArraysService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 5;
        int actualSum = service.numberMonthMoreAverageSale(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }
}