package com.pluralsight;

public abstract class SalesContract extends Contract{
    public SalesContract(String date, String name, String email,
                         Vehicle vehicleSold, double totalPrice, double monthlyPayment)
    {
        super(date, name, email, vehicleSold, totalPrice, monthlyPayment);
    }

    private double salesTaxAmount;
    private double recordingFee;
    private double processingFee;
    private boolean FinanceOption;

    @Override
    public double getTotalPrice()
    {
        double salesTaxAmount = getVehicleSold().getPrice() - (getVehicleSold().getPrice() * .05);
        double recordingFee = 100;
        double processingFee = 0;

        if (getVehicleSold().getPrice() < 10000)
        {
            processingFee = 295;

        } if (getVehicleSold().getPrice() > 10000)
        {
          processingFee = 495;
        }
        return getVehicleSold().getPrice() + salesTaxAmount + recordingFee + processingFee;
    }

    @Override
    public double getMonthlyPayment() {
        boolean financeOption = true;
        int numberOfPayments = 0;
        double interestRate = 0;
        if (financeOption) {
            if (getVehicleSold().getPrice() >= 10000) {
                numberOfPayments = 48;
                interestRate = 4.25 / 1200;
            } else {
                numberOfPayments = 24;
                interestRate = 5.25 / 1200;
            }

            double monthlyPayment = getTotalPrice() * (interestRate * Math.pow(1 + interestRate, numberOfPayments)) / (Math.pow(1 + interestRate, numberOfPayments) - 1);
            monthlyPayment = Math.round(monthlyPayment * 100);
            monthlyPayment /= 100;
            return monthlyPayment;
        } else {
            return 0.0;
        }
    }


}
