package domain.mediator.appointment;

import java.util.ArrayList;
import java.util.Date;

import domain.model.patient.Appointment;

public interface AppointmentModel {
	public void getAll();
	public void AddAppointment(Appointment appointment);
	public void removeAppointment(Appointment appointment);
	public ArrayList<Appointment> getAppotmenttByDate(Date date);
	 

}
