package domain.model.staff;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.Test;

public class EmployeeListTest {
	
	Calendar calendar = new GregorianCalendar(1987, 9, 5);
	Date dob = new GregorianCalendar(2017, Calendar.SEPTEMBER, 5).getTime();
	Date startdate = calendar.getTime();
	
	Employee emp1 = new Doctor(1, "Oskars", "Arajs", dob, startdate, "12344567", "os@os.od", "M", "type" , "username", "pasw");
	Employee emp2 = new Doctor(1, "John", "Arajs", dob, startdate, "12344567", "os@os.od", "M", "type" , "username", "pasw");
	Employee emp3 = new Doctor(1, "Dog", "Arajs", dob, startdate, "12344567", "os@os.od", "M", "type" , "username", "pasw");
	Employee emp4 = new Doctor(1, "Cat", "Arajs", dob, startdate, "12344567", "os@os.od", "M", "type" , "username", "pasw");
	
	EmployeeList list = new EmployeeList();

	
	@Test
	public void getByNameTest()  {
		
	list.addEmployee(emp1);
		assertEquals(emp1, list.getEmployeeByName("Oskars"));
	}
	
	@Test
	public void addEmployeeTest ()
	{
		list.addEmployee(emp1);
		list.addEmployee(emp2);
		list.addEmployee(emp3);
		list.addEmployee(emp4);
		
	}
	
	@Test
	public void RemoveEmployeeTest ()
	{
		list.addEmployee(emp1);
		list.addEmployee(emp2);
		list.addEmployee(emp3);
		list.addEmployee(emp4);
		
		list.removeEmployee(emp1);
		list.removeEmployee(emp2);
		list.removeEmployee(emp3);
		list.removeEmployee(emp4);
	}
	
	@Test
	public void add2EmployeeTest ()
	{
		list.addEmployee(emp1);
		list.addEmployee(emp2);
		list.addEmployee(emp3);
		list.addEmployee(emp4);
		
		
		assertEquals(4, list.getNumerOfEmployees());
	}
	
	
	@Test
	public void editEmployeeTest ()
	{
		list.addEmployee(emp1);
	
		list.editEmployee("Oskars", "Alex");
		
		assertEquals(emp1, list.getEmployeeByName("Alex"));
		
	}
	
	
	@Test
	public void getNumberOfEmployeeTest ()
	{
		list.addEmployee(emp1);
		list.addEmployee(emp2);
		list.addEmployee(emp3);
		list.addEmployee(emp4);
		
		assertEquals(3, list.getNumerOfEmployees()); 
	}
	
	
	
	
	


}
