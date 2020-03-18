package com.company;

public class Engine {
    int power;
    int productionYear;
    boolean isEco;

    private Engine (int power, int productionYear, boolean isEco) {
        this.power = power;
        this.productionYear = productionYear;
        this.isEco = isEco;
    }
    public int getPower() {
        return this.power;
    }
    public int getProductionYear() {
        return this.productionYear;
    }
    boolean isEco() {
        if (power > 2000) {
            return true;
        }
        else {
            return false;
        }
    }
}
