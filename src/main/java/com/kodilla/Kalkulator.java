package com.kodilla;

 class Calculator {
    public double substractAFromB(double a, double b) {
        return a - b;
    }
     public double addAtoB(double a, double b){
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double addAtoB;
        double substractAFromB;
        System.out.println("For first operation " + calculator.addAtoB(7, 5));
        System.out.println("For second operation " + calculator.substractAFromB(9, 4));
    }
    }