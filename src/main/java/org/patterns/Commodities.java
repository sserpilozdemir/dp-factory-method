package org.patterns;

public class Commodities implements IStockEntity{
    private double spotPrice;
    private double futurePrice;
    private int monthsToExpiration;

    public Commodities(double spotPrice, double futurePrice, int monthsToExpiration) {
        this.spotPrice = spotPrice;
        this.futurePrice = futurePrice;
        this.monthsToExpiration = monthsToExpiration;
    }

    @Override
    public double calculate(){
        double priceDifference = futurePrice - spotPrice;
        //annualizedReturn
        return (priceDifference / spotPrice) / (monthsToExpiration / 12.0);
    }

    @Override
    public String toString() {
        return "Commodities{" +
                "spotPrice=" + spotPrice +
                ", futurePrice=" + futurePrice +
                ", monthsToExpiration=" + monthsToExpiration +
                '}';
    }
}
