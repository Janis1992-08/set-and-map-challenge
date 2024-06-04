package org.example;




public class Main {
    public static void main(String[] args) {

        Pharmacy pharmacy = new Pharmacy();

        Medication med1 = new Medication("Aspirin", 9.73, true);
        Medication med2 = new Medication("Ibuprofen", 12.99, false);
        Medication med3 = new Medication("Prednisolon", 30.93, true);
        Medication med4 = new Medication("Antibiotika", 18.79, false);


        pharmacy.save(med1);
        pharmacy.save(med2);
        pharmacy.save(med3);
        pharmacy.save(med4);

        System.out.println("Number of Medications: " + pharmacy.getCount());

        System.out.println();

        System.out.println("Find Prednisolon: " + pharmacy.find("Prednisolon"));

        System.out.println();

        pharmacy.delete("Aspirin");
        System.out.println("Number of Medications: " + pharmacy.getCount());

        System.out.println();

        System.out.println("All Medications found");
        pharmacy.printAllMedications();


    }
}