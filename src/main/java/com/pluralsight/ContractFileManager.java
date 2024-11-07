package com.pluralsight;
import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Scanner;


public class ContractFileManager {
    ArrayList<Contract> contracts = new ArrayList<>();



    public void writeSalesContract(int vin, Vehicle vehicle){
        try{
            FileWriter writer = new FileWriter("contracts.csv" , true);
            BufferedWriter buffer = new BufferedWriter(writer);
            buffer.append("SALE|").append(vehicle.getVin())
                    .append("|").append(contract.Date).append("|").append(contrat.Name).append("|")
                    .append(contract.getEmail()).append("|").append(contract.getCarId).append("|")
                    .append(vehicle.getYear()).append("|").append(vehicle.getMake()).append("|").append(vehicle.getModel())
                    .append("|").append(vehicle.getVehicleType()).append("|").append(vehicle.getColor()).append("|")
                    .append(vehicle.getOdometer()).append("|").append(vehicle.getPrice()).append("|").append(contract.getRecordingFee)
                    .append("|").append(contract.getProcessingFee).append("|").append(contract.getFinance).append("|")
                    .append(contract.getMonthlyPayment());
            buffer.newLine();
            buffer.close();



        } catch (Exception e) {
            System.err.println("Error appending info to the file");
            e.printStackTrace();
        }
    }


    public void writeLeaseContract(int vin, Vehicle vehicle){

        ArrayList<Contract> salesContract = new ArrayList<>();

        try {
                FileWriter writer = new FileWriter("contracts.csv" , true);
                BufferedWriter buffer = new BufferedWriter(writer);
                buffer.append("LEASE|").append(vehicle.getVin())
                        .append("|").append(salesContract.getDate).append("|").append(contrat.Name).append("|")
                        .append(contract.getEmail()).append("|").append(contract.getCarId).append("|")
                        .append(vehicle.getYear()).append("|").append(vehicle.getMake()).append("|").append(vehicle.getModel())
                        .append("|").append(vehicle.getVehicleType()).append("|").append(vehicle.getColor()).append("|")
                        .append(vehicle.getOdometer()).append("|").append(vehicle.getPrice()).append("|").append(contract.getRecordingFee)
                        .append("|").append(contract.getProcessingFee).append("|").append(contract.getFinance).append("|")
                        .append(contract.getMonthlyPayment());
                salesContract.add();
                buffer.newLine();
                buffer.close();

        }
        catch (Exception e){
            System.err.println("Error writing info to file");
            e.printStackTrace();
        }






    }




}
