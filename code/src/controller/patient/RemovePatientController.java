package controller.patient;

import java.io.IOException;
import java.rmi.RemoteException;

import clients.Client;
import domain.mediator.patient.RemotePatientModel;
import domain.mediator.patient.ServerPatientModelManager;
import view.secretary.patient.removepatient.RemovePatientGUI;

public class RemovePatientController {
private Client client;
private RemovePatientGUI removePatientGUI;
public RemovePatientController(Client patientModel, RemovePatientGUI removePatientGUI) 
		 throws ClassNotFoundException, IOException
{
	this.client = new Client();
	this.removePatientGUI = removePatientGUI;
}
public void executes(String what) throws RemoteException
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
			client.callLoad(name);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		removePatientGUI.showTable(client.getAllPatientsFromTheList());
		int[] ides =  new int[client.getAllPatientsFromTheList().size()];
		for (int i = 0; i < ides.length; i++) {
			ides[i] = client.getAllPatientsFromTheList().get(i).getId();
			
		}
		
		removePatientGUI.setComboboxValue(ides);


				break;
			case "Remove":

				int id = removePatientGUI.getSelectedItemFromBox();
				client.removePatient(id);
				removePatientGUI.showTable(client.getAllPatientsFromTheList());
				
				break;

			default:
				break;
			}
			
		}

}
