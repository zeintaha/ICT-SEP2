package controller.patient;

import java.io.IOException;

import domain.mediator.patient.PatientModel;
import view.secretary.patient.addpatient.AddPatientView;

public class AddPatientController {
	private PatientModel patientModel;
	private AddPatientView view;

	public AddPatientController(PatientModel patientModel, AddPatientView view)
			throws ClassNotFoundException, IOException {
		this.patientModel = patientModel;
		this.view = view;
	}

	public void executes() {
		String[] data = view.getTextFieldValues();
		patientModel.addPatient(data);
	}

}
