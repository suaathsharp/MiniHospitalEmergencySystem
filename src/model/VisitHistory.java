package model;

public class VisitHistory {

    class Node {
        Visit visit;
        Node next;

        Node(Visit visit) {
            this.visit = visit;
        }
    }

    Node head;

    public void addVisit(Visit visit) {
        Node newNode = new Node(visit);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    public void removeVisit(int visitId) {
        if (head == null) {
            System.out.println("Visit history is empty.");
            return;
        }

        if (head.visit.visitId == visitId) {
            head = head.next;
            System.out.println("Visit removed: " + visitId);
            return;
        }

        Node current = head;

        while (current.next != null) {
            if (current.next.visit.visitId == visitId) {
                current.next = current.next.next;
                System.out.println("Visit removed: " + visitId);
                return;
            }

            current = current.next;
        }

        System.out.println("Visit not found.");
    }

    public Visit searchVisit(int visitId) {
        Node current = head;

        while (current != null) {
            if (current.visit.visitId == visitId) {
                return current.visit;
            }

            current = current.next;
        }

        return null;
    }

    public void displayHistory() {
        System.out.println("Patient Visit History:");

        if (head == null) {
            System.out.println("No visit records.");
            return;
        }

        Node current = head;

        while (current != null) {
            System.out.println(current.visit);
            current = current.next;
        }
    }
}