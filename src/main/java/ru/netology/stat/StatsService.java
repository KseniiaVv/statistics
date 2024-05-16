package ru.netology.stat;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }



    public int amountSales(long[] sales) { // сумма продаж
        int amount = 0;
        for (int i = 0; i < sales.length; i++) {
            amount = (int) (amount + sales[i]);
        }
        return amount;

    }

    public int averageAmountSales(long[] sales) {       //средняя сумма продаж
        int average = amountSales(sales) / 12;

        return average;
    }

    public int maxSales(long[] sales) {          // месяц, в который был пик продаж
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minAverage(long[] sales) {      //  кол-во месяцев, в которых продажи были ниже среднего
        int calcMinAverage = 0;
        long average = averageAmountSales(sales);
        for (int i = 0; i < 12; i++) {
            if (sales[i] <= average) {
                calcMinAverage++;
            }
        }
        return calcMinAverage;
    }

    public int maxAverage(long[] sales) {      //  кол-во месяцев, в которых продажи были выше среднего
        int calcMaxAverage = 0;
        long average = averageAmountSales(sales);
        for (int i = 0; i < 12; i++) {
            if (sales[i] >= average) {
                calcMaxAverage++;
            }
        }
        return calcMaxAverage;
    }



}

