package main;

import java.io.IOException;

import clients.Client;
import controller.employee.manager.SearchEmployeeController;
import view.manager.searchemployee.SearchEmployeeGUI;

public class MainClientSearchEmployee {
	public static void main(String args[]) throws IOException, ClassNotFoundException {
		Client model = new Client();		
		SearchEmployeeGUI view = new SearchEmployeeGUI();
		SearchEmployeeController searchEmployeeController = new SearchEmployeeController(model,view);
		view.start(searchEmployeeController);

	}
} 