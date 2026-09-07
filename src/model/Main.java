package model;

public class Main {

    public static void main(String[] args) {

        Patient patient1 = new Patient(
                101, "Suaath", 24, "0771234567", "Accident");

        Patient patient2 = new Patient(
                102, "Ahmed", 30, "0772345678", "Chest Pain");

        Patient patient3 = new Patient(
                103, "Kamal", 45, "0773456789", "Fever");

        EmergencyQueue queue = new EmergencyQueue();

        queue.enqueue(patient1);
        queue.enqueue(patient2);
        queue.enqueue(patient3);

        queue.displayQueue();

        queue.dequeue();

        queue.displayQueue();
    }
}