package domain.mediator.staff;

import java.io.IOException;
import java.util.ArrayList;

import domain.model.staff.Employee;
import domain.model.staff.EmployeeList;
import domain.model.staff.Type;

public class StaffClinicModelManeger implements StaffClinicModel {

	private EmployeeList list;
	private StaffDatabase persistence;

	public StaffClinicModelManeger() throws IOException, ClassNotFoundException {
		this.persistence = new StaffDatabase();
		this.list = persistence.load();
	}

	public EmployeeList getAll() {
		// TODO Auto-generated method stub
		return list;
	}

	public Type[] reachType() {
		return Type.values();
	}
	@Override
	public void addOneEmployee(Employee employee) {
		list.addEmployee(employee);
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

		return employees;
	}
	//
	// @Override
	// public int getNumberOfEmployees()
	// {
	// return list.getNumerOfEmployees();
	// }

}
