package org.patterns;

public class Stocks implements IStockEntity{
    private double price;
    private double earnings;

    public Stocks(double price, double earnings) {
        this.price = price;
        this.earnings = earnings;
    }

    @Override
    public double calculate(){
        //peRatio
        return price / earnings;
    }

    @Override
    public String toString() {
        return "Stocks{" +
                "price=" + price +
                ", earnings=" + earnings +
                '}';
    }
}
