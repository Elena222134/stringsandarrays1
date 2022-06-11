package org.example.stringsandarrays.services;

public class ArraysService {
    public int sumSale(int[] sale) {
//        int myArray[] = {3, 5, 7, 12};
        int sum = 0;
        for (int i = 0; i < sale.length; i++) {
            sum = sum + sale[i];
        }
        return sum;
//    System.out.println(sum);
    }

    public int averageSumSale(int[] sale) {
        int average = 0;
        int sum = 0;
        for (int i = 0; i < sale.length; i++) {
            sum = sum + sale[i];
            average = sum / sale.length;
        }
        return average;
    }

    public int getMinSale(long[] sales) {
        int minMonth = 0;
        int month = 0;

        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int getMaxSale(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;

            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int numberMonthLessAverageSale(int[] sales) {
        int sred = averageSumSale(sales);
        int s = 0;
        for (int sale : sales) {
            if (sale < sred) {
                s = s + 1;
            }


        }
        return s;

    }

    public int numberMonthMoreAverageSale(int[] sales) {
        int sred = averageSumSale(sales);
        int s = 0;
        for (int sale : sales) {
            if (sale > sred) {
                s = s + 1;
            }


        }
        return s;
    }
}
