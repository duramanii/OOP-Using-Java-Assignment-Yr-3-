import java.time.LocalDate; // Its a new package from java.time to deal with time.

// This Class contain the conceptual blueprint and detail  for the Employee class.
public class Employee {
private String employeeId; // creating Instance Variables, for protection we do not allow access to our variable.
private String firstname;
private String lastname;
private String email;
private LocalDate hireDate;



// I create a getters and setters. getters allows us to get the value out of the variables, and setters allows us to set the value in the instance variables.
public String getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(String employeeId) {
	this.employeeId = employeeId;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public LocalDate getHireDate() {
	return hireDate;
}
public void setHireDate(LocalDate hireDate) {
	this.hireDate = hireDate;
}
public void setHireDate(String hireDate2) {
	// TODO Auto-generated method stub
	
}
 
} 
