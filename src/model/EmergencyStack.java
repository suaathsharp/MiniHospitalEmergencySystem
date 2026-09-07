package model;

import java.util.Stack;

public class EmergencyStack {

    private Stack<Treatment> stack = new Stack<>();

    public void push(Treatment treatment) {
        stack.push(treatment);
        System.out.println("Treatment added: " + treatment.treatmentId);
    }

    public Treatment pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty.");
            return null;
        }

        Treatment treatment = stack.pop();
        System.out.println("Treatment removed: " + treatment.treatmentId);
        return treatment;
    }

    public void displayStack() {
        System.out.println("\nCompleted Treatments:");

        if (stack.isEmpty()) {
            System.out.println("No treatment records.");
            return;
        }

        for (Treatment treatment : stack) {
            System.out.println(treatment);
        }
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}