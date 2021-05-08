package Classes;
import Interfaces.*;
public class Hospital implements PatientOperations, StuffOperations {

    public int totalPatients = 0, maximumPatients = 1000;
    public int totalStuff = 0, maximumStuff = 100;
    Patient patients[] = new Patient[maximumPatients];
    Stuff stuffs[] = new Stuff[maximumStuff];

    
    public void insertPatient(Patient p) {
        if (totalPatients < maximumPatients) {
            patients[totalPatients++] = p;
        } else {
            System.out.println("Too many Patients\n");
        }
    }
    
    public void removePatient(Patient p) {
        int index = 0;
        boolean found = false;
        for (int i = 0; i < totalPatients; i++) {
            if (patients[i] == p) {
                index = i;
                found = true;
                break;
            }
        }
        if (found) {
            for (int i = index; i < totalPatients - 1; i++) {
                patients[i] = patients[i + 1];
            }
            totalPatients--;
            System.out.println("Patient removed\n");
        } else {
            System.out.println("Patient not found\n");
        }
    }
    
    public Patient getPatient(int id) {
        int i;
        for (i = 0; i < totalPatients; i++) {
            if (patients[i].getNid() == id) {
                break;
            }
            if (i == totalPatients - 1) {
                break;
            }
        }
        return patients[i];
    }

    
    public void showAllPatients() {

        for (int i = 0; i < totalPatients; i++) {
            System.out.println("Name:" + patients[i].getName() + "\n" + "NID:" + patients[i].getNid() + "\n");
			
			
			
        }
    }

    
    public void insertStuff(Stuff s) {
        if (totalStuff < maximumStuff) {
            stuffs[totalStuff++] = s;
            System.out.println("Stuff Succesfully Inserted");
        } else {
            System.out.println("Too many Stuffs");
        }
    }

   
    public void removeStuff(Stuff s) {
        int index = 0;
        boolean found = false;
        for (int i = 0; i < totalStuff; i++) {
            if (stuffs[i] == s) {

                index = i;
                found = true;
                break;
            }
        }
        if (found) {
            for (int i = index; i < totalStuff - 1; i++) {
                stuffs[i] = stuffs[i + 1];
            }
            totalStuff--;
            System.out.println("Stuff removed\n");
        } else {
            System.out.println("Stuff not found\n");
        }
    }

    
    public Stuff getStuff(String stfId) {
        int i;
        boolean val = false;
        for (i = 0; i < totalStuff; i++) {

            if (stuffs[i].getId().equals(stfId)) {

                break;

            }
        }
        return stuffs[i];

    }

    
    public void showAllStuffs() {
        int i;
        for (i = 0; i < totalStuff; i++) {
            System.out.println("Stuff Name:" + stuffs[i].getName() + "\nStuff Id: " + stuffs[i].getId() + "\nStuff Designation:" + stuffs[i].getDesignation()+ "\nStuff Contact: " + stuffs[i].getContact() + "\nStuff Salary: " + stuffs[i].getSalary() );
			
			
		
}
			
        }
		
}


