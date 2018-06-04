package main;

import java.io.IOException;

import controller.employee.maneger.SearchEmployeeController;
import domain.mediator.staff.StaffClinicModel;
import domain.mediator.staff.StaffClinicModelManeger;
import view.manager.searchemployee.SearchEmployeeGUI;

public class MainSearchManeger {
	public static void main(String args[]) throws IOException, ClassNotFoundException {
		StaffClinicModel model = new StaffClinicModelManeger();		
		SearchEmployeeGUI view = new SearchEmployeeGUI();
		SearchEmployeeController searchEmployeeController = new SearchEmployeeController(model,view);
		view.start(searchEmployeeController);

	}
}