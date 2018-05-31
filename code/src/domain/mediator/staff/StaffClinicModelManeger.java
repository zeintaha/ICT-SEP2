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

	public void callLoad(String name) throws IOException {
		this.list = persistence.load(name);
	}

	

	public String[] reachType() {
		return Type.enumsToStringArray();
	}

	@Override
	public void addOneEmployee(String[] employeeData) {
		System.out.println(" printing the array");
	for (int i = 0; i < employeeData.length; i++) {
		System.out.println(employeeData[i]);
		
	}
	System.out.println(" done ");
		
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
		Date dob = null;
		try {
			dob = format.parse(employeeData[2]);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

			
		Date startDate = null;
		try {
			
			startDate = format.parse(employeeData[3]);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		
		
		int id = 0;
		String firstName = employeeData[0];
		String lastName = employeeData[1];
		
		String telNumber = employeeData[4];
		String email = employeeData[5];
		String gender = employeeData[6];
		Type employeeType = Type.valueOf(employeeData[7]);
		String username = employeeData[0];
		String password = "123456";
		
		System.out.println(" hi we are creating the object ");
		employee = EmployeeFactory.create(id, firstName, lastName, dob,
				startDate, telNumber, email, gender, employeeType, username, password);
		System.out.println(" object has been created ");
			
		System.out.println("we are here object details"  + employee);

		try {
			persistence.save(employee);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

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

		for (int i = 0; i < employees.size(); i++) {
			System.out.println(" hi from the model getname method ");
			System.out.println(employees.get(i).toString());
		}
		return employees;
	}
	 public ArrayList<Employee> getAllEmployeesFromTheList(){
		 
		 return list.getAll();
	 }
	

}
