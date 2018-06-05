package domain.model.patient;

import java.io.Serializable;
import java.util.Date;

import domain.model.patient.Patient;

public class Appointment implements Serializable {

	private Date dateOfAppointment;
	private Date time;
	private String brief;
	private Patient patient;

	public Appointment(Date dateOfAppointment, Date time, String brief, Patient patient) {
		this.dateOfAppointment = dateOfAppointment;
		this.time = time;
		this.brief = brief;
		this.patient = patient;
	}

	public Date getDateOfAppointment() {
		return dateOfAppointment;
	}

	public void setDateOfAppointment(Date dateOfAppointment) {
		this.dateOfAppointment = dateOfAppointment;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getBrief() {
		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	@Override
	public String toString() {
		return " dateOfAppointment=" + dateOfAppointment + ", time=" + time + ", brief=" + brief + ", patient="
				+ patient + "]";
	}

}