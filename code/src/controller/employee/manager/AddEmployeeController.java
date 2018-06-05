package controller.employee.manager;

import java.io.IOException;

import domain.mediator.staff.StaffClinicModel;
import domain.model.staff.Employee;
import domain.model.staff.EmployeeFactory;
import domain.model.staff.Type;

import view.manager.addemployee.AddEmployeeView;

public class AddEmployeeController {
	private StaffClinicModel staffClinicModel;
	private AddEmployeeView view;

	public AddEmployeeController(StaffClinicModel staffClinicModel, AddEmployeeView view)
			throws ClassNotFoundException, IOException {
		
		this.staffClinicModel = staffClinicModel;
		this.view = view;
	}

	public String[] setComboboxValue() {
		return staffClinicModel.reachType();
	}

	public void executes() {
		String[] data = view.getTextFieldValues();

		staffClinicModel.addOneEmployee(data);


	}
}
