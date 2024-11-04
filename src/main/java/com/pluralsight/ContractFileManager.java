package com.pluralsight;
import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Scanner;


public class ContractFileManager {
    ArrayList<Contract> contracts = new ArrayList<>();


  /*
   public Contract getContract() {

        try {
            FileReader fileReader = new FileReader("contracts.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
            String[] tokens = line.split("\\|");
            String type = tokens[0];
            String contractDate = tokens[1];
            String name = tokens[2];
            String email = tokens[3];
            int carId = Integer.parseInt(tokens[4]);
            int year = Integer.parseInt(tokens[5]);
            String make = tokens[6];
            String model = tokens[7];
            String vehicleType = tokens[8];
            String color = tokens[9];
            int odometer = Integer.parseInt(tokens[10]);
            double price = Double.parseDouble(tokens[11]);
            double salesTax = Double.parseDouble(tokens[12]);
            double recordingFee = Double.parseDouble(tokens[13]);
            double totalCoast= Double.parseDouble(tokens[14]);
            boolean finance = Boolean.parseBoolean(tokens[15]);
            double monthlyPayment = Double.parseDouble(tokens[16]);

            Contract contractList = new Contract(type,contractDate,name,email,carId,year,make,model,vehicleType,color,odometer,price,salesTax,recordingFee,totalCoast,finance,monthlyPayment);




            }

        } catch (Exception e) {
            System.err.println("Error processing file");
            e.printStackTrace();
        }
    }
*/
    public Contract writeSalesContract(Vehicle vehicle){
       StringBuilder sBuilder = new StringBuilder();
            sBuilder.append("SALE|").append()

    public Contract writeLeaseContract(){

    }
}
