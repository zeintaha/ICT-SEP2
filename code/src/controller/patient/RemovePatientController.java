package controller.patient;

import java.io.IOException;

import domain.mediator.patient.PatientModel;
import domain.mediator.patient.PatientModelManager;
import view.secretary.patient.removepatient.RemovePatientGUI;

public class RemovePatientController {
private PatientModel patientModel;
private RemovePatientGUI removePatientGUI;
public RemovePatientController(PatientModel patientModel, RemovePatientGUI removePatientGUI) 
		 throws ClassNotFoundException, IOException
{
	this.patientModel = new PatientModelManager();
	this.removePatientGUI = removePatientGUI;
}
public void executes(String what)
{
	switch (what) {
	case "Search":
		String name = "";
	if(((RemovePatientGUI) removePatientGUI).getSearchTxtValue().length()>0){
		name= ((RemovePatientGUI) removePatientGUI).getSearchTxtValue().substring(0, 1).toUpperCase()
				+ ((RemovePatientGUI) removePatientGUI).getSearchTxtValue().substring(1).toLowerCase();
				}
				removePatientGUI.enableRemoveButton(true);
		try {
			patientModel.callLoad(name);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		removePatientGUI.showTable(patientModel.getAllPatientsFromTheList());
		int[] ides =  new int[patientModel.getAllPatientsFromTheList().size()];
		for (int i = 0; i < ides.length; i++) {
			ides[i] = patientModel.getAllPatientsFromTheList().get(i).getId();
			
		}
		
		removePatientGUI.setComboboxValue(ides);


				break;
			case "Remove":

				int id = removePatientGUI.getSelectedItemFromBox();
				patientModel.remove(id);
				removePatientGUI.showTable(patientModel.getAllPatientsFromTheList());
				
				break;

			default:
				break;
			}
			
		}

}
