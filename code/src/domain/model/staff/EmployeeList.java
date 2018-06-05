package domain.model.staff;

import java.io.Serializable;
import java.util.ArrayList;

public class EmployeeList implements Serializable{
	ArrayList<Employee> employees;

	public EmployeeList() {
		this.employees = new ArrayList<Employee>();

	}

	public void addEmployee(Employee employee) {
		employees.add(employee);

	}

	public void removeEmployee(Employee employee) {
		employees.remove(employee);

	}

	public Employee getEmployeeByName(String name) {
		for (int i = 0; i < employees.size(); i++) {
			if (employees.get(i).getFirstName().equalsIgnoreCase(name)) {
				return employees.get(i);
			}
		}
		System.out.println(" we can not find the employee wiht the name : " + name + "!! ");
		return null;
	}

	public Employee editEmployee(String oldName, String newName) {
		Employee employee = getEmployeeByName(oldName);

		employee.setFirstName(newName);

		return employee;

	}

	public Employee searchEmployeeByName(String name) {
		Employee employee = getEmployeeByName(name);

		return employee;

	}

	public ArrayList<Employee> getAll() {

		return employees;
	}

	public int getNumerOfEmployees() {
		return employees.size();
	}

	public Employee getEmployeeById(int id) {
		Employee employee = null;
		for (int i = 0; i < employees.size(); i++) {
			if (employees.get(i).getId() == id) {
				employee = employees.get(i);
			}

		}
		return employee;

	}
}
