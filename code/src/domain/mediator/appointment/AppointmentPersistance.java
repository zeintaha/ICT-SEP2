package domain.mediator.appointment;

import java.util.ArrayList;

import domain.model.patient.Appointment;

public interface AppointmentPersistance {
	public ArrayList<Appointment> load();
	public void save(Appointment appointment);
	public void remove(Appointment appointment);

}
