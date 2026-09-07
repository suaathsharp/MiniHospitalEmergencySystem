package model;

public class PatientBST {

    class Node {
        Patient patient;
        Node left;
        Node right;

        Node(Patient patient) {
            this.patient = patient;
        }
    }

    Node root;

    public void insert(Patient patient) {
        root = insertPatient(root, patient);
    }

    private Node insertPatient(Node node, Patient patient) {

        if (node == null) {
            return new Node(patient);
        }

        if (patient.patientId < node.patient.patientId) {
            node.left = insertPatient(node.left, patient);
        } else {
            node.right = insertPatient(node.right, patient);
        }

        return node;
    }

    public Patient search(int patientId) {

        Node result = searchPatient(root, patientId);

        if (result != null) {
            return result.patient;
        }

        return null;
    }

    private Node searchPatient(Node node, int patientId) {

        if (node == null || node.patient.patientId == patientId) {
            return node;
        }

        if (patientId < node.patient.patientId) {
            return searchPatient(node.left, patientId);
        }

        return searchPatient(node.right, patientId);
    }

    public void display() {
        System.out.println("Patients in BST:");
        inorder(root);
    }

    private void inorder(Node node) {

        if (node != null) {
            inorder(node.left);
            System.out.println(node.patient);
            inorder(node.right);
        }
    }
}