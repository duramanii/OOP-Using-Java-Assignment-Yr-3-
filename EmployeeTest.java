import java.time.LocalDate;
import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee = new Employee();
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please Enter the EmployeeId >>");
		String EmployeeId = input.next();
		employee.setEmployeeId(EmployeeId);
		System.out.print("Please Enter The firstname >>");
		String Firstname = input.next();
		employee.setFirstname(Firstname);
		System.out.print("Please Enter The Lastname >>");
		String Lastname = input.next();
		employee.setLastname(Lastname);
		System.out.print("Please Enter The Email >>");
		String Email = input.next();
		employee.setEmail(Email);
		System.out.print("Please Enter The hireDate >>");
		String hireDate =input.next();
		employee.setHireDate(hireDate);
		
		System.out.println("Employee Information");
		System.out.println ("EmployeeId " + employee.getEmployeeId() );
		System.out.println ("Firstname " + employee.getFirstname() );
		System.out.println ("Lastname " + employee.getLastname() );
		System.out.println ("Email " + employee.getEmail() );
		System.out.println ("HireDate " + employee.getHireDate() );
		
	}

}
