package domain.model.staff;

import java.util.Date;

public class Maneger extends Employee {

	public Maneger(String firstName, String lastName, String id, Date dob, Date startDate, String telNumber,
			String eamil, String gender) {
		super( firstName,lastName,id, dob, startDate, telNumber, eamil, gender);
	}
}
