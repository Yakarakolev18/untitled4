import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int choice;

        System.out.println("1. Insert data");
        System.out.println("2. Print data");
        System.out.println("3. Medicines under 10 leva");
        System.out.println("4. Medicines above 15 leva");
        System.out.println("5. Expirating medicines");
        System.out.print("Choice: "); choice = scanner.nextInt();

        Pharmacy lekarstvo1 = new Pharmacy("izoprinozin", 16, 13, LocalDate.now());
        Pharmacy lekarstvo2 = new Pharmacy("aspirin", 4, 69, LocalDate.now());
        Pharmacy lekarstvo3 = new Pharmacy("upsarin", 3, 28, LocalDate.now());

        ArrayList<Pharmacy> pharmacies = new ArrayList<>();

        pharmacies.add(lekarstvo1);
        pharmacies.add(lekarstvo2);
        pharmacies.add(lekarstvo3);

        switch (choice) {
            case 1: insertData(pharmacies);
                break;
            case 2: printAllData(pharmacies);
                break;
            case 3:  printAllMedicinesWithPriceHigherThan15(pharmacies);
                break;
            case 4:  printAllMedicinesWithLowerPriceThan10(pharmacies);
                break;
            case 5:  printPharmaciesWithExpirationDate(pharmacies);
                break;
            default:
                System.out.println("Incorrect choice!");

        }
    }

    public static void insertData(ArrayList<Pharmacy> pharmacies) {
        Scanner scanner = new Scanner(System.in);
        Pharmacy pharmacy = new Pharmacy();

        String name;
        double price;
        int quantity;

        System.out.println();
        System.out.print("Name: "); name = scanner.nextLine(); pharmacy.name = name;
        System.out.println();
        System.out.print("Price: "); price = scanner.nextDouble(); pharmacy.price = price;
        System.out.println();
        System.out.print("Quantity: "); quantity = scanner.nextInt(); pharmacy.quantity = quantity;
        pharmacy.expirationDate = LocalDate.now();
        pharmacies.add(pharmacy);
    }

    public static void printAllData(ArrayList<Pharmacy> pharmacies) {
        for (Pharmacy p : pharmacies) {
            System.out.println(p.toString());
        }
    }


    public static void printAllMedicinesWithPriceHigherThan15(ArrayList<Pharmacy> pharmacies) {

        ArrayList<Pharmacy> newPharmacies = new ArrayList<>();

        for (Pharmacy p : pharmacies) {
            if(p.price > 15) {
                newPharmacies.add(p);
            }
        }

        for (Pharmacy p : newPharmacies) {
            System.out.println(p.name);
        }
    }

    public static void printAllMedicinesWithLowerPriceThan10(ArrayList<Pharmacy> pharmacies){
        ArrayList<Pharmacy> newPharmacies = new ArrayList<>();
        for(Pharmacy p : pharmacies){
            if(p.price < 10){
                newPharmacies.add(p);
            }
        }

        for (Pharmacy p : newPharmacies) {
            System.out.println(p.toString());
        }
    }

    public static void printPharmaciesWithExpirationDate(ArrayList<Pharmacy> pharmacies){

        ArrayList<Pharmacy> newPharmacies = new ArrayList<>();

        LocalDate date = LocalDate.of(2050, 6, 22);

        for(Pharmacy p : pharmacies){
            if(p.expirationDate.equals(date)){
                newPharmacies.add(p);
            }
        }

        for (Pharmacy p : newPharmacies) {
            System.out.println(p.toString());
        }
    }


}

