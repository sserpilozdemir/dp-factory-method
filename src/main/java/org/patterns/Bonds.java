package org.patterns;

public class Bonds implements IStockEntity {
    private double annualInterest;
    private double principal;
    private int years;

    public Bonds(double annualInterest, double principal, int years) {
        this.annualInterest = annualInterest;
        this.principal = principal;
        this.years = years;
    }

    @Override
    public double calculate(){
        //calculation totalInterest
        return principal * (annualInterest / 100) * years;
    }

    @Override
    public String toString() {
        return "Bonds{" +
                "annualInterest=" + annualInterest +
                ", principal=" + principal +
                ", years=" + years +
                '}';
    }
}
