package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;

    }

    public int calculateAverageAmount(int[] sales) {
        int sum = calculateSum(sales);
        return sum / sales.length;
    }

    public int calculateMinimalSale(int[] sales) {
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

    public int calculateMaxSale(int[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int calculateMonthUnderAverageSale(int[] sales) {
        int month = 0;
        int averageSale = calculateAverageAmount(sales);
        for (int sale : sales) {
            if (sale < averageSale) {
                month = month + 1;
            }
        }
        return month;
    }

    public int calculateMonthOverAverageSale(int[] sales) {
        int month = 0;
        int averageSale = calculateAverageAmount(sales);
        for (int sale : sales) {
            if (sale > averageSale) {
                month = month + 1;
            }
        }
        return month;
    }
}