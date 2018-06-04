package main;

import java.io.IOException;

import controller.employee.manager.RemoveEmlployeeController;
import domain.mediator.staff.StaffClinicModel;
import domain.mediator.staff.StaffClinicModelManeger;
import view.manager.removeemployee.RemoveEmployeeGUI;

public class MainRemoveEmployee {
	public static void main(String args[]) throws IOException, ClassNotFoundException {
		StaffClinicModel model = new StaffClinicModelManeger();		
		RemoveEmployeeGUI view = new RemoveEmployeeGUI();
		RemoveEmlployeeController removeEmlployeeController = new RemoveEmlployeeController(model,view);
		view.start(removeEmlployeeController);

	}

}
