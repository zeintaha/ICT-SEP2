package domain.mediator.appointment;

import java.util.ArrayList;
import java.util.Date;

import domain.model.patient.Appointment;
import domain.model.patient.AppointmentList;

public class AppointmentModelManager implements AppointmentModel {
	private AppointmentPersistance persistance;
	private AppointmentList list;
	public AppointmentModelManager() throws ClassNotFoundException {
		
		this.persistance = new AppointmentDatabase();
		list = new AppointmentList();
	}

	@Override
	public void getAll() {
		list.getAllAppointments();
		persistance.load();
		
	}

	@Override
	public void AddAppointment(Appointment appointment) {
		list.addAppointment(appointment);
		persistance.save(appointment);
		
	}

	@Override
	public void removeAppointment(Appointment appointment) {
list.removeAppointment(appointment);
persistance.remove(appointment);
		
	}

	@Override
	public ArrayList<Appointment> getAppotmenttByDate(Date date) {
	return list.getAvailableAppointmentOnThisDate(date);
	
	}

	

}
