package main;

import java.io.IOException;

import clients.Client;
import controller.employee.manager.RemoveEmlployeeController;
import view.manager.removeemployee.RemoveEmployeeGUI;

public class MainClientRemoveEmployee {
	public static void main(String args[]) throws IOException, ClassNotFoundException {
	   Client model = new Client();		
		RemoveEmployeeGUI view = new RemoveEmployeeGUI();
		RemoveEmlployeeController removeEmlployeeController = new RemoveEmlployeeController(model,view);
		view.start(removeEmlployeeController);

	}

}
