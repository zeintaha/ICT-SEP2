package controller.appointment.addappointment;

import java.io.IOException;

import domain.mediator.patient.PatientModel;
import view.secretary.appointment.addappointment.AddAppointmentGUI;

public class PatientAppoitmentController {

	private PatientModel patientModel;
	private AddAppointmentGUI addAppointmentGUI;

	public PatientAppoitmentController(PatientModel patientModel, AddAppointmentGUI addAppointmentGUI)
			throws ClassNotFoundException, IOException {
		this.patientModel = patientModel;
		this.addAppointmentGUI = addAppointmentGUI;
	}

	public void executes() {

		String name = ((AddAppointmentGUI) addAppointmentGUI).getSearchTxtValue();
		
		try {
			patientModel.callLoad(name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		addAppointmentGUI.showTable(patientModel.getAllPatientsFromTheList());
	
	}

}
