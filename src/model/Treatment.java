package model;

public class Treatment {

    int treatmentId;
    int patientId;
    String doctorName;
    String treatment;
    String date;

    public Treatment(int treatmentId, int patientId, String doctorName, String treatment, String date) {
        this.treatmentId = treatmentId;
        this.patientId = patientId;
        this.doctorName = doctorName;
        this.treatment = treatment;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Treatment ID: " + treatmentId +
               " | Patient ID: " + patientId +
               " | Doctor: " + doctorName +
               " | Treatment: " + treatment +
               " | Date: " + date;
    }
}