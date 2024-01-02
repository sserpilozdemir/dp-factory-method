package org.patterns;

public class StockEntityFactory {
    public static IStockEntity getStockEntity(String type, double... parameters){
        return switch (type) {
            case "stocks" -> new Stocks(parameters[0], parameters[1]);
            case "bonds" -> new Bonds(parameters[0], parameters[1], (int) parameters[2]);
            case "commodities" -> new Commodities(parameters[0], parameters[1], (int) parameters[2]);
            default -> throw new IllegalArgumentException("Invalid stock entity type!");
        };

    }
}
