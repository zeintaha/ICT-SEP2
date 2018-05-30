package domain.model.staff;

import java.util.Date;

public class EmployeeFactory {

	public static Employee create(String firstName, String lastName, String id, Date dob, Date startDate,
			String telNumber, String email, String gender, Type type) {
		Employee employee = null;
		if (type==Type.Doctor) {
			employee = new Doctor(firstName, lastName, id, dob, startDate, telNumber, email, gender);

		} else if (type==Type.Maneger) {
			employee = new Maneger(firstName, lastName, id, dob, startDate, telNumber, email, gender);

		} else if (type==Type.Secratary) {
			employee = new Secretary(firstName, lastName, id, dob, startDate, telNumber, email, gender);
		}

		return employee;

	}

}
