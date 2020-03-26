package com.company;

public class Engine {

    public int productionYear;
    public double power;
    public boolean engineEco;

    public Engine(int productionYear, double power) {
        this.power = power;
        this.productionYear = productionYear;
    }

    public int getProductionYear() {
        return this.productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public double getPower() {
        return this.power;
    }

    public void setPower(double power) {
        this.power = power;
    }

     public boolean getEngine() {
        if (productionYear > 2000) {
            if (power > 20000) {
                return  true;
            } else {
                return false;
            }
        } else {
            return  false;
        }
    }
    public boolean checkEco (){ return this.engineEco; }
}

