package controller.appointment.addappointment;

import java.io.IOException;
import java.rmi.RemoteException;
import java.util.Date;

import clients.Client;
import view.secretary.appointment.addappointment.AddAppointmentGUI;

public class AddApointmnentController {

	private Client client;
	private AddAppointmentGUI addAppointmentGUI;

	public AddApointmnentController(Client client, AddAppointmentGUI addAppointmentGUI)
			throws ClassNotFoundException, IOException {

		this.addAppointmentGUI = addAppointmentGUI;
		this.client = client;

	}

	public void executeSearch() throws RemoteException {

		String name = ((AddAppointmentGUI) addAppointmentGUI).getSearchTxtValue();

		boolean error = false;

		if (name.isEmpty()) {
			addAppointmentGUI.showError();
			error = true;

		}
		if (error == false) {
			addAppointmentGUI.enableRemoveButton(true);
			if (name.length() > 1) {

				name = name.substring(0, 1).toUpperCase()
						+ ((AddAppointmentGUI) addAppointmentGUI).getSearchTxtValue().substring(1).toLowerCase();
			}

			try {
				client.callLoadPateint(name);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			addAppointmentGUI.showTable(client.getAllPatientsFromTheList());
			setPatientIdComboBoxValue();

			fillComboBoxForFreeAppointment();
		}

	}

	public void executeAdd() throws RemoteException {
		String brief = addAppointmentGUI.getTextAreaValue();
		Date appointmentDate = addAppointmentGUI.getSelectedDate();
		int patientId = addAppointmentGUI.getSelectedPatientId();
		int id = client.getDateId(appointmentDate);

		client.AddAppointment(appointmentDate, brief, patientId, id);

		addAppointmentGUI.showConfirmation();

	}

	public void setPatientIdComboBoxValue() throws RemoteException {
		int[] ides = new int[client.getAllPatientsFromTheList().size()];
		for (int i = 0; i < ides.length; i++) {

			ides[i] = client.getAllPatientsFromTheList().get(i).getId();

		}

		addAppointmentGUI.setComboboxValue(ides);
	}

	public void fillComboBoxForFreeAppointment() throws RemoteException {

		Date[] freeAppointments = new Date[client.getAllFreeAppointment().getNumberOfAppointment()];

		for (int i = 0; i < freeAppointments.length; i++) {

			freeAppointments[i] = client.getAllFreeAppointment().getAppointmentByIndex(i).getDateOfAppointment();

		}
		addAppointmentGUI.fillComboBoxFreeAppointments(freeAppointments);

	}

}