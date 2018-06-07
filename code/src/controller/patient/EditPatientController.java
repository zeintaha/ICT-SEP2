package controller.patient;

import java.io.IOException;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;

import clients.Client;
import domain.mediator.staff.StaffDatabase;
import domain.model.patient.Patient;
import view.manager.editemployee.EditEmployeeView;
import view.secretary.patient.editpatient.EditPatientGUI;

public class EditPatientController {
	private Client client;

	private EditPatientGUI editPatientGUI;

	private StaffDatabase persistence;

	public EditPatientController(Client client, EditPatientGUI editPatientGUI)
			throws ClassNotFoundException, IOException {

		this.client = client;
		this.editPatientGUI = editPatientGUI;
	}

	public void executes(String what) throws RemoteException {

		switch (what) {

		case "Search":

			String name = " ";
			name = editPatientGUI.getSearchTxtValue();
			if (name.length() > 1) {

				name = name.substring(0, 1).toUpperCase()
						+ ((EditPatientGUI) editPatientGUI).getSearchTxtValue().substring(1).toLowerCase();
			}
				try {
					client.callLoadPateint(name);
				} catch (IOException e) {

					e.printStackTrace();
				}
			

			int[] ides = new int[client.getAllPatientsFromTheList().size()];
			for (int i = 0; i < ides.length; i++) {
				ides[i] = client.getAllPatientsFromTheList().get(i).getId();

			}

			editPatientGUI.setComboboxValue(ides);

			break;

		case "pickcmbBox":
			int id = editPatientGUI.getSelectedValueCmbox();
			Patient pat = client.getPatientById(id);

			editPatientGUI.setFirstName(pat.getFirstName());
			editPatientGUI.setLastName(pat.getLastName());
			editPatientGUI.setDOB(pat.getDob());
			editPatientGUI.setTel(pat.getTelNumber());
			editPatientGUI.setEmail(pat.getEmail());
			editPatientGUI.setGender(pat.getGender());

			System.out.println("ComboBox");

			break;

		case "Save":
			int id1 = editPatientGUI.getSelectedValueCmbox();
			String firstName = editPatientGUI.getFirstName();
			String lastName = editPatientGUI.getLastName();
			String telNumber = editPatientGUI.getTel();
			String email = editPatientGUI.getEmail();
			String gender = editPatientGUI.getGender();

			String dob = editPatientGUI.getDate();

			SimpleDateFormat sdf2 = new SimpleDateFormat("MM-dd-yyyy");
			java.util.Date date1 = null;
			try {
				date1 = sdf2.parse(dob);
			} catch (java.text.ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			java.sql.Date sqlDOB = new java.sql.Date(date1.getTime());

			Patient pat2 = client.getPatientById(id1);

			pat2.setFirstName(firstName);
			pat2.setLastName(lastName);
			pat2.setTelNumber(telNumber);
			pat2.setEmail(email);
			pat2.setGender(gender);
			pat2.setDob(sqlDOB);

			client.updatePatient(pat2);

			System.out.println("Save");

		default:

			break;
		}

	}
}