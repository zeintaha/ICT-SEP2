package domain.model.patient;

import java.util.ArrayList;
import java.util.Date;

public class AppointmentList {
private ArrayList<Appointment> appointments;

public AppointmentList() {
	this.appointments = new ArrayList<Appointment>();
}
public Appointment getAppointment(int index)
{
   return appointments.get(index);
}
public void addAppointment(Appointment appointment) {
	appointments.add(appointment);

}

public void removeAppointment(Appointment appointment) {
	appointments.remove(appointment);

}

public Appointment getAppointmentByTime(Date time) {
	for (int i = 0; i < appointments.size(); i++) {
		if (appointments.get(i).getTime().equals(time)) {
			return appointments.get(i);
		}
	}
	System.out.println(" we can not find the Appointment with time : " + time + "!! ");
	return null;
}

public Appointment editAppointmentTime(Date oldTime, Date newTime) {

	Appointment appointment=getAppointmentByTime(oldTime);
	appointment.setTime(newTime);
			return appointment;
}

public Appointment searchAppointmentByTime(Date time) {
	Appointment appointment=getAppointmentByTime(time);
	return appointment;
}


public int getNumberOfAppointment() {
	// TODO Auto-generated method stub
	return appointments.size();
}

public ArrayList<Appointment> getAppointments() {
	return appointments;
}
}
