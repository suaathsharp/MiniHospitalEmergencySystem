package model;

public class Main {

    public static void main(String[] args) {

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
    }
}