package domain.model.staff;

import java.util.Date;

public class Doctor extends Employee {

	public Doctor(String userName, String password, String firstName, String lastName, String id, Date dob, Date startDate,
			String telNumber, String eamil, String gender) {
		super(userName, password, firstName, lastName, id, dob, Type.Doctor, startDate, telNumber, eamil, gender);

	}

}
