package controller.employee.manager;

import java.io.IOException;
import java.rmi.RemoteException;

import clients.Client;
import domain.mediator.staff.RemoteStaffClinicModel;
import domain.mediator.staff.ServerStaffClinicModelManager;
import view.manager.removeemployee.RemoveEmployeeGUI;
import view.manager.searchemployee.SearchEmployeeGUI;

public class RemoveEmlployeeController {

	private Client clientStaff;
	private RemoveEmployeeGUI removeEmployeeGUI;

	public RemoveEmlployeeController(Client clientStaff, RemoveEmployeeGUI removeEmployeeGUI)
			throws ClassNotFoundException, IOException {

		this.clientStaff = new Client();
		this.removeEmployeeGUI = removeEmployeeGUI;
	}

	public void executes(String what) throws RemoteException {
		switch (what) {
		case "Search":
			String name = "";
			if(((RemoveEmployeeGUI) removeEmployeeGUI).getSearchTxtValue().length()>0)
			{
			name= ((RemoveEmployeeGUI) removeEmployeeGUI).getSearchTxtValue().substring(0, 1).toUpperCase()
			+ ((RemoveEmployeeGUI) removeEmployeeGUI).getSearchTxtValue().substring(1).toLowerCase();
			}
			removeEmployeeGUI.enableRemoveButton(true);
	try {
	   clientStaff.callLoadStaff(name);

	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	removeEmployeeGUI.showTable(clientStaff.getAllEmployeesFromTheList());
	int[] ides =  new int[clientStaff.getAllEmployeesFromTheList().size()];
	for (int i = 0; i < ides.length; i++) {
		ides[i] = clientStaff.getAllEmployeesFromTheList().get(i).getId();
		
	}
	
	removeEmployeeGUI.setComboboxValue(ides);


			break;
		case "Remove":

			int id = removeEmployeeGUI.getSelectedItemFromBox();
			clientStaff.removeStaff(id);
			removeEmployeeGUI.showTable(clientStaff.getAllEmployeesFromTheList());

			
			break;

		default:
			break;
		}
		
	}

}
