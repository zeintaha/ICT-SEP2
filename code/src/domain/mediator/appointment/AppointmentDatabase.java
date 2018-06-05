package domain.mediator.appointment;

import java.util.ArrayList;

import domain.model.patient.Appointment;
import utility.persistence.MyDatabase;

public class AppointmentDatabase implements AppointmentPersistance {

	private MyDatabase db;
	private final String DRIVER = "org.postgresql.Driver";
	private final String URL = "jdbc:postgresql://localhost:5432/postgres";
	private final String USER = "postgres";
	private final String PASSWORD = "0940";

	public AppointmentDatabase() throws ClassNotFoundException {
		this.db = new MyDatabase(DRIVER, URL, USER, PASSWORD);
	}

	@Override
	public ArrayList<Appointment> load() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Appointment appointment) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(Appointment appointment) {
		// TODO Auto-generated method stub

	}

}
