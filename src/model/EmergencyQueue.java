package model;

import java.util.LinkedList;
import java.util.Queue;

public class EmergencyQueue {

    private Queue<Patient> queue = new LinkedList<>();

    public void enqueue(Patient patient) {
        queue.add(patient);
        System.out.println("Added to queue: " + patient.name);
    }

    public Patient dequeue() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty.");
            return null;
        }

        Patient patient = queue.poll();
        System.out.println("Treating: " + patient.name);
        return patient;
    }

    public void displayQueue() {
        System.out.println("\nWaiting Patients:");

        if (queue.isEmpty()) {
            System.out.println("No patients waiting.");
            return;
        }

        for (Patient patient : queue) {
            System.out.println(patient);
        }
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}