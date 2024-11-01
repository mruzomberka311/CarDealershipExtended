package com.pluralsight;

public abstract class LeaseContract extends Contract {
    public LeaseContract(String date, String name, String email,
                         Vehicle vehicleSold, double totalPrice, double monthlyPayment)
    {
        super(date, name, email, vehicleSold, totalPrice, monthlyPayment);
    }

    private double expectedEndingValue;
    private double leaseFee;
    private double interestRate;
    private int numberOfPayments;


    @Override
    public double getTotalPrice()
    {
        double expectedEndingValue = getVehicleSold().getPrice() * .50;
        double leaseFee = getVehicleSold().getPrice() * .07;
        return (getVehicleSold().getPrice() - expectedEndingValue) + leaseFee;
    }

    @Override
    public double getMonthlyPayment()
    {
        int numberOfPayments = 36;
        double interestRate = 4.0 / 1200;
        double monthlyPayment = getTotalPrice() * (interestRate * Math.pow(1 + interestRate, numberOfPayments)) / (Math.pow(1 + interestRate, numberOfPayments) - 1);
        monthlyPayment = Math.round(monthlyPayment * 100);
        monthlyPayment /= 100;
        return monthlyPayment;
    }







}
