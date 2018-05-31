package domain.mediator.staff;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import domain.model.staff.Employee;
import domain.model.staff.EmployeeFactory;
import domain.model.staff.EmployeeList;
import domain.model.staff.Type;

public class StaffClinicModelManeger implements StaffClinicModel {

	private EmployeeList list;
	private StaffDatabase persistence;
	private Employee employee;

	public StaffClinicModelManeger() throws IOException, ClassNotFoundException {
		this.persistence = new StaffDatabase();

	}

	public void callLoad() throws IOException {
		this.list = persistence.load();
	}

	public EmployeeList getAll() {
		// TODO Auto-generated method stub
		return list;
	}

	public String[] reachType() {
		return Type.enumsToStringArray();
	}

	@Override
	public void addOneEmployee(String[] employeeData) {
		
//		for (int i = 0; i < employeeData.length; i++) {
//			System.out.println(employeeData[i]);
//		}
		
//		DateFormat format = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH);
//		Date dob = null;
//		 if (dob != null) {
//			 dob = employeeData[2];
//		 }
//			
//		Date startDate = null;
//		if (startDate != null) {
//			startDate = employeeData[2].toString();
//			 }
		
		int id = 0;
		String firstName = employeeData[0];
		String lastName = employeeData[1];
//		try {
//			dob = format.parse(employeeData[2]);
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			startDate = format.parse(employeeData[3]);
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		String telNumber = employeeData[4];
		String email = employeeData[5];
		String gender = employeeData[6];
		String employeeType = employeeData[7];
		String username = employeeData[0];
		String password = "123456";
		
		employee = EmployeeFactory.create(id, firstName, lastName, dob, startDate, telNumber, email, gender, employeeType, username, password);
		
		
//		
		System.out.println("we are here first name "  + employee.getFirstName());

//		try {
//			persistence.save(employeeData);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}

	// @Override
	// public void removeEmployee(Employee employee) throws IOException
	// {
	//
	// list.removeEmployee(employee);
	// persistence.remove(employee);
	//
	// }

	@Override
	public ArrayList<Employee> getEmployeeByname(String name) {
		Employee employee = list.getEmployeeByName(name);

		ArrayList<Employee> employees = new ArrayList<Employee>();
		if (employee != null) {
			employees.add(employee);
		}

		return employees;
	}
	

}
