package model;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("===== MINI HOSPITAL EMERGENCY MANAGEMENT SYSTEM =====");

        System.out.println("\n--- BST TEST ---");

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

        bst.display();

        System.out.println("\nSearch Patient 102:");
        System.out.println(bst.search(102));

        bst.delete(102);

        System.out.println("\nAfter Delete Patient 102:");
        bst.display();

        System.out.println("\n--- QUEUE TEST ---");

        EmergencyQueue queue = new EmergencyQueue();

        queue.enqueue(patient1);
        queue.enqueue(patient2);
        queue.enqueue(patient3);

        queue.displayQueue();

        queue.dequeue();

        System.out.println("\nAfter Dequeue:");
        queue.displayQueue();

        System.out.println("\n--- STACK TEST ---");

        Treatment treatment1 = new Treatment(
                1, 101, "Dr. Silva", "First Aid", "07-09-2026");

        Treatment treatment2 = new Treatment(
                2, 102, "Dr. Ahmed", "Pain Treatment", "07-09-2026");

        Treatment treatment3 = new Treatment(
                3, 103, "Dr. Kumar", "Fever Treatment", "07-09-2026");

        EmergencyStack stack = new EmergencyStack();

        stack.push(treatment1);
        stack.push(treatment2);
        stack.push(treatment3);

        stack.displayStack();

        stack.pop();

        System.out.println("\nAfter Pop:");
        stack.displayStack();

        System.out.println("\n--- LINKED LIST TEST ---");

        Visit visit1 = new Visit(
                1, "07-09-2026", "Dr. Silva", "Accident", "First Aid");

        Visit visit2 = new Visit(
                2, "07-09-2026", "Dr. Ahmed", "Chest Pain", "Pain Treatment");

        Visit visit3 = new Visit(
                3, "07-09-2026", "Dr. Kumar", "Fever", "Fever Treatment");

        VisitHistory history = new VisitHistory();

        history.addVisit(visit1);
        history.addVisit(visit2);
        history.addVisit(visit3);

        history.displayHistory();

        System.out.println("\nSearch Visit 2:");
        System.out.println(history.searchVisit(2));

        history.removeVisit(2);

        System.out.println("\nAfter Removing Visit 2:");
        history.displayHistory();

        System.out.println("\n===== ALL TESTS COMPLETED =====");

        livePatientDemo(bst);
    }

    public static void livePatientDemo(PatientBST bst) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n===== LIVE PATIENT DEMO =====");

        System.out.print("Enter Patient ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Contact Number: ");
        String contact = scanner.nextLine();

        System.out.print("Enter Medical Condition: ");
        String condition = scanner.nextLine();

        Patient patient = new Patient(
                id, name, age, contact, condition);

        bst.insert(patient);

        System.out.println("\nPatient added successfully.");

        System.out.println("\n--- Patients After Adding ---");
        bst.display();

        System.out.println("\n--- Search Live Patient ---");

        System.out.print("Enter Patient ID to search: ");
        int searchId = scanner.nextInt();

        Patient found = bst.search(searchId);

        if (found != null) {
            System.out.println("Patient found:");
            System.out.println(found);
        } else {
            System.out.println("Patient not found.");
        }

        System.out.println("\n--- Delete Live Patient ---");

        System.out.print("Enter Patient ID to delete: ");
        int deleteId = scanner.nextInt();

        if (bst.search(deleteId) != null) {
            bst.delete(deleteId);
            System.out.println("Patient deleted successfully.");
        } else {
            System.out.println("Patient not found.");
        }

        System.out.println("\n--- Patients After Deletion ---");
        bst.display();

        scanner.close();
    }
}