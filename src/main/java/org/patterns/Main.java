package org.patterns;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        IStockEntity bonds = StockEntityFactory.getStockEntity("bonds", 3.40 , 50000.0, 5);
        System.out.println(String.format("Data for %s", bonds));
        System.out.println(String.format("Result for totalInterest %s", bonds.calculate()));

        IStockEntity commodities = StockEntityFactory.getStockEntity("commodities", 100.0, 450.0, 12);
        System.out.println(String.format("Data for %s", commodities));
        System.out.println(String.format("Result is for annualizedReturn %s", commodities.calculate()));
    }
}
