import Interfaces.*;
import Classes.*;
import java.io.*;
import java.util.Scanner;

public class Start {

    public static void main(String[] args) {

        Patient p = new Patient();
        Stuff s = new Stuff();
		Account a = new Account();
        Hospital h = new Hospital();
		File FILE=new File("History.txt");
		String NewLine=System.getProperty("line.separator");
		boolean con=true;
		try{
while (con=true)
{	
        FileWriter writer;
	    con=true;
        System.out.println("----WELCOME TO XYZ LABAID HOSPITAL----");
        System.out.println("1. Stuff Management");
        System.out.println("2. Patient Management");
        System.out.println("3. Account Transactions");
        System.out.println("4.--------Exit----------");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any Option you want to do : ");
        int digit = input.nextInt();
        switch (digit) {
            case 1:
                double salary;
                String name,id,Designation,Contact;
                System.out.println("1. Insert New Stuff");
                System.out.println("2. Remove Existing Stuff");
				System.out.println("3. Show All Stuffs");
				System.out.println("4. Go Back");
                System.out.println("Enter any Option you want to do : ");
				int Number = input.nextInt();
				switch (Number) {
                    case 1:
                        System.out.println("Stuff Name:");
                        name = input.next();
                        s.setName(name);

                        System.out.println("Stuff ID:");
                        id = input.next();
                        s.setId(id);
						
						System.out.println("Stuff Designation:");
                        Designation = input.next();
                        s.setDesignation(Designation);
						
						System.out.println("Stuff Contact:");
                        Contact = input.next();
                        s.setContact(Contact);
						
                        System.out.println("Stuff Salary:");
                        salary = (double) input.nextInt();
                        s.setSalary(salary);
						
						
						
                        h.insertStuff(s);
                        break;
                    case 2:
                        if (h.totalStuff == 0) {
                            System.out.println("There are no Stuffs inside Hospital");
                        }
                        System.out.println("Stuff ID:");
                        id = input.next();
                        s = h.getStuff(id);
                        if (s.getId().equals(id)) {
						h.removeStuff(s);
                        } 
						else {
                            System.out.println("Stuff not found\n");
                        }
                        break;
                    case 3:
                        h.showAllStuffs();
                        break;
					case 4: break;
                    default:
                        System.out.println("Wrong Selection");
                        System.out.println(" Thank You ");
                }
                break;
            case 2:
                int nid;
				int num;
				double balance;

                System.out.println("1. Insert New Patient  ");
                System.out.println("2. Remove Existing Patient");
                System.out.println("3. Show All Patient");
				System.out.println("4. Go Back");
                System.out.println("Enter any Option you want to do : ");
                int Num = input.nextInt();
                switch (Num) {
                    case 1:
					    System.out.println("Patient NID:");
                        nid = input.nextInt();
                        p.setNid(nid);
					    
                        System.out.println("Patient Name:");
                        name = input.next();
                        p.setName(name);
                        
						
						
                        h.insertPatient(p);
                       
						
                        System.out.println("Patient Successfully Inserted");
                        break;
                    case 2:
                        if (h.totalPatients == 0) {
                            System.out.println("There are no Patients inside Hospital");
                        }
                        System.out.println("Patient NID:");
                        nid = input.nextInt();
                        p = h.getPatient(nid);
                        if (p.getNid() != nid) {
                            System.out.println("Patient not found\n");
                        } else {
                            h.removePatient(p);
                        }
                        System.out.println("Patient Successfully Removed");
                        break;
                    case 3:
                        h.showAllPatients();
                        System.out.println("Show all Patient ");
                        break;
					case 4: break;
                    default:
                        System.out.println("Wrong Selection");
                }
                System.out.println(" Thank You ");
                break;
            case 3:
			    writer = new FileWriter(FILE,true);
                int accountNumber;
                double amount;
				int Nid;
                        System.out.println("1.Patient Bill");
                        System.out.println("2.Payment bill");
						System.out.println("3. Go Back");
                        System.out.println("Enter any Option you want to do : ");
                        int Noo = input.nextInt();
                        switch (Noo) {
                            case 1:
                                if (h.totalPatients == 0) {
                                    System.out.println("There are No Patients In Hospital");
                                    break;
                                }
                                System.out.println("Patient NID:");
                                Nid = input.nextInt();
                                p = h.getPatient(Nid);
								
								if (p.totalAccounts == 0) {
                                    System.out.println("Patients Has No Accounts");
                                    break;
                                }
                                System.out.println("Patient Account Number:");
                                accountNumber = input.nextInt();
                                a = p.getAccount(accountNumber);
                                System.out.println(" Bill:");
                                amount = input.nextDouble();
                                try {
                                    double kk=a.addedBalance;
									String MM=String.valueOf(kk);
									writer.write("Bill: "+MM);
                                    writer.write("    "+NewLine);
									writer.close();
                                }
								catch (NullPointerException x) {
                                    System.out.println("Patient Does Not Own This Account" +x);
                                }
                                System.out.println("Money Successfully Bill ");
                                break;
                            case 2:
                                if (h.totalPatients == 0) {
                                    System.out.println("There are No Patient In Hospital");
                                    break;
                                }
                                System.out.println("Patient NID:");
                                nid = input.nextInt();
                                p = h.getPatient(nid);
                                if (p.totalAccounts == 0) {
                                    System.out.println("Patient Has No Account");
                                }
                                System.out.println("Patient Account Number:");
                                accountNumber = input.nextInt();
                                a = p.getAccount(accountNumber);
                                System.out.println(" Amount paid:");
                                amount = input.nextDouble();
                                double LL= a.subbedBalance;
								String FF=String.valueOf(LL);
								writer.write(" Paid "+FF);
                                writer.write("    "+NewLine);
								writer.close();
                                System.out.println("Money Successfully paid ");
                                break;
								case 3: break;
                            default:
                                System.out.println("Wrong Selection");
                                System.out.println(" Thank You ");
                        }
                    case 4:
                        System.out.println(" Thank You For your Visit To Our Hospital ");
						con=false;
                        break;
                    default:
                        System.out.println("Wrong Selection Of Digit ");
                }
		}
		}
		catch(Exception rr){
			System.out.println("The Exception is "+rr);
		}
	}
}