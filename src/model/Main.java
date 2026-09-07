package model;

public class Main {

    public static void main(String[] args) {

        Patient patient1 = new Patient(
                103, "Kamal", 45, "0773456789", "Fever");

        Patient patient2 = new Patient(
                101, "Suaath", 24, "0771234567", "Accident");

        Patient patient3 = new Patient(
                102, "Ahmed", 30, "0772345678", "Chest Pain");

        PatientBST bst = new PatientBST();

        bst.insert(patient1);
        bst.insert(patient2);
        bst.insert(patient3);

        System.out.println("BST In-order:");
        bst.display();

        System.out.println("\nSearch Patient 102:");
        System.out.println(bst.search(102));
    }
}