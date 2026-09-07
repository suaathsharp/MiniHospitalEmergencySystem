package model;

public class Main {

    public static void main(String[] args) {

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

        stack.displayStack();
    }
}