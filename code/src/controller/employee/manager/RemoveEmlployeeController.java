package controller.employee.manager;

import java.io.IOException;

import domain.mediator.staff.StaffClinicModel;
import domain.mediator.staff.StaffClinicModelManager;
import view.manager.removeemployee.RemoveEmployeeGUI;
import view.manager.searchemployee.SearchEmployeeGUI;

public class RemoveEmlployeeController {

	private StaffClinicModel staffClinicModel;
	private RemoveEmployeeGUI removeEmployeeGUI;

	public RemoveEmlployeeController(StaffClinicModel staffClinicModel, RemoveEmployeeGUI removeEmployeeGUI)
			throws ClassNotFoundException, IOException {

		this.staffClinicModel = new StaffClinicModelManager();
		this.removeEmployeeGUI = removeEmployeeGUI;
	}

	public void executes(String what) {
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
		staffClinicModel.callLoad(name);

	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	removeEmployeeGUI.showTable(staffClinicModel.getAllEmployeesFromTheList());
	int[] ides =  new int[staffClinicModel.getAllEmployeesFromTheList().size()];
	for (int i = 0; i < ides.length; i++) {
		ides[i] = staffClinicModel.getAllEmployeesFromTheList().get(i).getId();
		
	}
	
	removeEmployeeGUI.setComboboxValue(ides);


			break;
		case "Remove":

			int id = removeEmployeeGUI.getSelectedItemFromBox();
			staffClinicModel.remove(id);
			removeEmployeeGUI.showTable(staffClinicModel.getAllEmployeesFromTheList());
			
			
			
			
			
			
			
			break;

		default:
			break;
		}
		
	}

}
