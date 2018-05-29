package controller.employee.maneger;

import java.io.IOException;
import java.util.Date;

import domain.mediator.staff.StaffClinicModel;
import domain.model.staff.Employee;
import domain.model.staff.EmployeeFactory;
import domain.model.staff.Type;
import view.manager.addemployee.AddEmployeeGUI;
import view.manager.addemployee.AddEmployeeView;

public class AddEmployeeController {
	private StaffClinicModel staffClinicModel;
	private AddEmployeeView view;

	public AddEmployeeController(StaffClinicModel staffClinicModel, AddEmployeeView view)
			throws ClassNotFoundException, IOException {
		super();
		this.staffClinicModel = staffClinicModel;
		this.view = view;
	}

	public Type[] getValues() {
		return staffClinicModel.reachType();
	}

	public void executes() {
		String[] data = view.get();
//		String string = Date

		Employee employee = EmployeeFactory.create(data[0], data[1], data[2], null, null, data[5], data[6], data[7],
				Type.Doctor);
		staffClinicModel.addOneEmployee(employee);
		System.out.println(employee.toString());

	}
}
