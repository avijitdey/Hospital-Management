package Classes;
import Interfaces.*;
public class Stuff {

    public String name,stfId,Designation,Contact;
    public double salary;
	
    public int totalEmployee = 0, maximumEmployee = 0;

    public void setName(String stfName) {
        this.name = stfName;
    }

    public void setId( String id) {
        this.stfId = id;
    }

    public void setSalary(double sal) {
        this.salary = sal;
    }
	public void setDesignation(String Designation) {
        this.Designation = Designation;
    }
	
	public void setContact(String Contact) {
        this.Contact = Contact;
    }

    public String getName() {
        return this.name;
    }

    public String getId() {
        return this.stfId;
    }

    public double getSalary() {
        return this.salary;
    }
	
	
   
    public String getDesignation() {
        return this.Designation;
    }
	
	  public String getContact() {
        return this.Contact;
    }
	
	
	
}