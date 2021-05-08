package Interfaces;
import Classes.*;
public interface PatientOperations {

    public void insertPatient(Patient p);

    public void removePatient(Patient p);

    public Patient getPatient(int nid);

    public void showAllPatients();
}