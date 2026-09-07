package model;

public class Main {

    public static void main(String[] args) {

        Patient patient = new Patient(
                101,
                "Suaath",
                24,
                "0771234567",
                "Accident"
        );

        System.out.println(patient);
    }
}